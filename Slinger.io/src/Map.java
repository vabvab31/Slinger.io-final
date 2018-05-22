
import java.util.ArrayList;

import lyndon.shapes.*;
import processing.core.PApplet;
import processing.core.PFont;
/** The abstract class for each of the maps.
 * @author Lyndon Lee A
 */
public abstract class Map {
	protected Sling player1, player2;
	private boolean canShoot1, canShoot2;
	private boolean canMove1, canMove2;
	private int turn;
	private int move1, move2;
	private int distance1, distance2;
	ArrayList<Shape2D> shapes;
	PowerUp [] powerups = new PowerUp[3];
	private int time;
	private int setup;
	private PFont font;
	private int drawTime; //the time
	public Map(Sling player1, Sling player2) {
		this.player1 = player1;
		this.player2 = player2;
		shapes = new ArrayList<Shape2D>();
		time = -1;
		move1 = 0;
		move2 = 0;
		canShoot1 = false;
		canShoot2 = false;
		canMove1 = true;
		canMove2 = true;
		distance1 = 0;
		distance2 = 0;
		turn = 1;
		powerups[0] = new FullHealth(0,0);
		powerups[1] = new HalfHealthIncrease(0,0);
		powerups[2] = new IncreaseSlingRange(0,0);
		drawTime = 0;
		setup = 0;
	}
	
	private void setup(PApplet p) {
		font = p.createFont("font2.ttf", 100);
	}
	
	public void draw(PApplet p) {
		
		if (setup == 0) {
			setup(p);
			setup = 1;
		}
			
		calcTime(p);
		
		for (Shape s : shapes) {
			s.draw(p);
		}
		
		p.stroke(0);
		
		if (turn == 1) {
			if (move1 == 0) {
				p.textFont(font);
				p.fill(150);
				p.text("move or shoot? (1)", 110, 120);
			}
			else if (move1 == 1) {
				canMove1 = false;
			}
			else if (move1 == 2) {
				canMove1 = true;
				p.textFont(font);
				p.fill(150);
				p.text(distance1, 380, 120);
				if (distance1 <= 0) {
					move1 = 0;
					canMove1 = false;
					turn = 2;
				}
			}
		}
		else if (turn == 2) {
			if (move2 == 0) {
				p.textFont(font);
				p.fill(150);
				p.text("move or shoot? (2)", 110, 120);
			}
			else if (move2 == 1) {
				canMove2 = false;
			}
			else if (move2 == 2) {
				canMove2 = true;
				p.textFont(font);
				p.fill(150);
				p.text(distance2, 380, 120);
				if (distance2 <= 0) {
					move2 = 0;
					canMove2 = false;
					turn = 1;
				}
			}
		}
		
		p.fill(209, 47, 29);
		p.rect(20, 20, 50, 5);
		p.fill(72, 150, 73);
		p.rect(20, 20, 50*player1.getHealth()/100, 5);
		
		p.fill(209, 47, 29);
		p.rect(730, 20, 50, 5);
		p.fill(72, 150, 73);
		p.rect(730, 20, 50*player2.getHealth()/100, 5);
		
		if (canShoot1) {
			player1.getProjectile().draw(p);
		}
		
		if (canShoot2) {
			player2.getProjectile().draw(p);
		}
		
	
		if(time - drawTime == 2000)
		{
		
			
			int random =  (int)(Math.random() * 3);
			int randomx = (int)(Math.random() * 400) + 200;
			
			if(random==0)
			{
				powerups[0] = new FullHealth(randomx, 100);
				powerups[0].setOriginalTime(time);
	
			}
			
			else if(random==1)
			{
				powerups[1] = new HalfHealthIncrease(randomx, 100);
				powerups[1].setOriginalTime(time);
			}
			
			else
			{
				powerups[2] = new IncreaseSlingRange(randomx, 100);
				powerups[2].setOriginalTime(time);
			}
			
			
			drawTime = time;
	
		}
			
			

		if(powerups[0].getY()!=0)
		{
			powerups[0].draw(p);
			if(!powerups[0].isColliding(shapes))
			{
				powerups[0].act();
			}
			
			if(time - powerups[0].getOriginalTime() > 10000)
			{
				powerups[0] = new FullHealth(0,0);
			}
		
		}
		if(powerups[1].getY()!=0)
		{
			powerups[1].draw(p);
			if(!powerups[1].isColliding(shapes))
			{
				powerups[1].act();
			}
			if(time - powerups[1].getOriginalTime() > 10000)
			{
				powerups[1] = new HalfHealthIncrease(0,0);
			}
			
		}
		if(powerups[2].getY()!=0)
		{
			powerups[2].draw(p);
			//if(powerups[2].getY()<500)
			if(!powerups[2].isColliding(shapes))
			{
				powerups[2].act();
			}
			if(time - powerups[2].getOriginalTime() > 10000)
			{
				powerups[2] = new IncreaseSlingRange(0,0);
			}
		
		}
		
		for (PowerUp pu : powerups) {
			if (player1.getProjectile().intersect(pu)) {
				pu.performPowerUp(player1);
				pu.setX(-100);
				pu.setY(-100);
			}
			if (player2.getProjectile().intersect(pu)) {
				pu.performPowerUp(player2);
				pu.setX(-100);
				pu.setY(-100);
			}
		}
	}
	
	public void calcTime(PApplet p) {
		if (time > 100000000) {
			time = 0;
		}
		time++;
		
	}
	
	public void shoot(int player) {
		if (player == 1) {
			canShoot1 = true;
		}
		else if (player == 2) {
			canShoot2 = true;
		}
	}
	
	
	/**
	 * 
	 * @param i this parameter is either 1 or another number
	 * @return returns the canShoot1 if its 1, else it returns the canShoot2
	 */
	public boolean shooting(int i) {
		if (i == 1)
			return canShoot1;
		return canShoot2;
	}
	
	public boolean canMove(int i) {
		if (i == 1)
			return canMove1;
		return canMove2;
	}
	
	public void hit(int player) {
		if (player == 1) {
			this.player2.getProjectile().setXY(player2.xPos()+7, 535);
			this.player1.decreaseHealth(10);
			canShoot2 = false;
			turn = 1;
			move1 = 0;
			
		}
		else if (player == 2) {
			this.player1.getProjectile().setXY(player1.xPos()+7, 535);
			this.player2.decreaseHealth(10);
			canShoot1 = false;
			turn = 2;
			move2 = 0;
		}
	}
	
	public void notImportantHit(int player) {
		if (player == 1) {
			this.player2.getProjectile().setXY(player2.xPos()+7, 535);
			canShoot2 = false;
			turn = 1;
			move1 = 0;
			
		}
		else if (player == 2) {
			this.player1.getProjectile().setXY(player1.xPos()+7, 535);
			canShoot1 = false;
			turn = 2;
			move2 = 0;
		}
	}
	
	public void add(Shape2D s) {
		shapes.add(s);
	}

	public int getTurn() {
		return turn;
	}
	
	public void move(int player, int move) {
		if (player == 1) {
			if (move == 1) {
				move1 = 1;
			}
			else if (move == 2) {
				move1 = 2;
			}
		}
		else if (player == 2) {
			if (move == 1) {
				move2 = 1;
			}
			else if (move == 2) {
				move2 = 2;
			}
		}
	}
	
	public int move(int player) {
		if (player == 1) {
			return move1;
		}
		else {
			return move2;
		}
	}
	
	public void walk(int player) {
		if (player == 1) {
			distance1--;
		}
		else {
			distance2--;
		}
	}
	
	public void setDistance(int player, int distance) {
		if (player == 1) {
			distance1 = distance;
		}
		else {
			distance2 = distance;
		}
	}
}
