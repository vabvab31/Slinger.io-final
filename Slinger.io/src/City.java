import lyndon.shapes.*;

import processing.core.PApplet;
import processing.core.PImage;
/**
 * The City class is one of the three maps in Slinger.io which is a subclass of the abstract class, map.
 * 
 * @author Vaibhav Seshadri
 */
public class City extends Map{
	
	private int width = 800;
	private int height = 900;
	private PImage photo;
	
	public City(Sling player1, Sling player2) {
		super(player1, player2);
		setMap();
	}
	
	public void setMap() {
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
	
	public void setup(PApplet p) {
		photo = p.loadImage("PImage.jpg");
		photo.resize(800, 600);
	}
	
	public void draw(PApplet p) {
		setup(p);
		p.image(photo, 0, 0);
		
		super.draw(p);
		
		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
	}
}
