
import java.util.ArrayList;

import lyndon.shapes.*;
import processing.core.PApplet;
/** The abstract class for each of the maps.
 * @author Lyndon Lee A
 */
public abstract class Map {
	protected Sling player1, player2;
	private boolean canShoot1, canShoot2;
	private int turn;
	ArrayList<Shape2D> shapes;
	private int time;
	public Map(Sling player1, Sling player2) {
		this.player1 = player1;
		this.player2 = player2;
		shapes = new ArrayList<Shape2D>();
		time = -1;
		canShoot1 = false;
		canShoot2 = false;
		turn = 1;
	}
	
	public void draw(PApplet p) {
		calcTime(p);
		
		for (Shape s : shapes) {
			s.draw(p);
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
	
	public void hit(int player) {
		if (player == 1) {
			this.player2.getProjectile().setXY(player2.xPos()+7, 535);
			this.player1.decreaseHealth(10);
			canShoot2 = false;
			//turn = 1;
			
		}
		else if (player == 2) {
			this.player1.getProjectile().setXY(player1.xPos()+7, 535);
			this.player2.decreaseHealth(10);
			canShoot1 = false;
			//turn = 2;
		}
	}
	
	public void notImportantHit(int player) {
		if (player == 1) {
			this.player2.getProjectile().setXY(player2.xPos()+7, 535);
			canShoot2 = false;
			//turn = 1;
			
		}
		else if (player == 2) {
			this.player1.getProjectile().setXY(player1.xPos()+7, 535);
			canShoot1 = false;
			//turn = 2;
		}
	}
	
	public void add(Shape2D s) {
		shapes.add(s);
	}

	public int getTurn() {
		return turn;
	}
	

}
