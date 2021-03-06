
import lyndon.shapes.*;


import processing.core.PApplet;
import processing.core.PImage;

import processing.core.PApplet;

/**
 * The City class is one of the three maps in Slinger.io which is a subclass of the abstract class, map.
 * 
 * @author Vaibhav Seshadri
 */
public class City extends Map{
	
	private int width = 800;
	private int height = 900;
	private PImage photo;

	
	public City(PApplet p, Sling player1, Sling player2) {
		super(player1, player2);
		setMap(p);
	}
	
	public void setMap(PApplet p) {
		
		Rectangle ground = new Rectangle(0,550,900,100); //Ground
		ground.setFill(25, 25, 25);
		add(ground);
		
		Rectangle building = new Rectangle(width/2-50, 260, 100, 290);
		building.setFill(58, 58, 58);
		building.setStroke(58, 58, 58);
		add(building);
		
		Rectangle t = new Rectangle(width / 2 - 40, 230, 80, 30);
		t.setFill(58, 58, 58);
		t.setStroke(58, 58, 58);
		add(t);
		
		Rectangle y = new Rectangle(width / 2 - 10, 220, 40, 10);
		y.setFill(58, 58, 58);
		y.setStroke(58, 58, 58);
		add(y);
		
		Rectangle s = new Rectangle(width / 2 + 15, 200, 10, 20);
		s.setFill(58, 58, 58);
		s.setStroke(58, 58, 58);
		add(s);
		
		Rectangle q = new Rectangle(width / 2 + 19, 180, 2, 20);
		q.setFill(58, 58, 58);
		q.setStroke(58, 58, 58);
		add(q);
		
		
		Rectangle leftDoor = new Rectangle(width/2 - 10, 520, 10, 30 );
		leftDoor.setFill(222, 184, 135);
		add(leftDoor);
		
		Rectangle rightDoor = new Rectangle(width/2, 520, 10, 30 );
		rightDoor.setFill(222, 184, 135);
		add(rightDoor);
		
		Circle leftKnob = new Circle(width/2 - 4, 535, 4 );
		leftKnob.setFill(255,215,0);
		add(leftKnob);
		
		Circle rightKnob = new Circle(width/2  + 4, 535, 4 );
		rightKnob.setFill(255,215,0);
		add(rightKnob);
		
		
		
		
		
		
		
		for(int i = width/2 - 40; i < width/2 + 45; i += 30 ) {
			for(int j = 265; j < 500; j += 35) {
				Rectangle window = new Rectangle(i,j, 20, 20);
				
				if((int)(2*Math.random()+1) == 2) {
					window.setFill(226, 226, 0);
					add(window);
				}
				else {
					window.setFill(220, 220, 220);
					add(window);
				}

			}
		}
		
		
	
		
		
		
	
	
	}
	
	

public void star(float x, float y, PApplet p) {
 
	
float angle = (float) (Math.PI * 2 / 5);
float halfAngle = (float) (angle/2.0);



	p.beginShape();
	for (float a = 0; a < Math.PI * 2; a += angle) {
		float sx = (float) (x + Math.cos(a) * 10);
		float sy = (float) (y + Math.sin(a) * 10);
		p.vertex(sx, sy);
		sx = (float) (x + Math.cos(a+halfAngle) * 5);
		sy = (float) (y + Math.sin(a+halfAngle) * 5);
		p.vertex(sx, sy);
	}
	p.endShape();
}

	
//	public void setup(PApplet p) {
//		photo = p.loadImage("PImage.jpg");
//		photo.resize(800, 600);
//	}
	
	public void draw(PApplet p) {
//		setup(p);
//		p.image(photo, 0, 0);

		p.background(0,24,72);


		
		Circle moon = new Circle(width/ 2 - 40, 275, 250);
		moon.setFill(254, 252, 215);
		moon.draw(p);
		
		
		star(20, 440, p);
		star(50, 120, p);
		star(100, 290, p);
		star(110, 70, p);
		star(150, 150, p);
		star(170, 220, p);
		star(210, 15, p);
		star(220, 400, p);
		star(260, 50, p);
		star(350, 140, p);
		star(390, 30, p);
		star(460, 390, p);
		star(500, 80, p);
		star(570, 90, p);
		star(620, 190, p);
		star(680, 310, p);
		star(710, 10, p);
		star(740, 150, p);
		star(780, 400, p);
		
	


		super.draw(p);
		
		
		
		
		
		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
		
		
		
	}
}
