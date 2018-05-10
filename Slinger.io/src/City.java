
import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * The City class is one of the three maps in Slinger.io which is a subclass of the abstract class, map.
 * 
 * @author Vaibhav Seshadri
 */
public class City extends Map{
	
	private int width = 800;
	private int height = 900;
	
	public City(Sling player1, Sling player2) {
		super(player1, player2);
		setMap();
	}
	
	public void setMap() {
		Rectangle ground = new Rectangle(0,550,900,100); //Ground
		ground.setFill(220, 220, 220);
		add(ground);
		
		Rectangle building = new Rectangle(width/2-50, 200, 100, 350);
		building.setFill(105, 105, 105);
		add(building);
		
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
			for(int j = 205; j < 500; j += 35) {
				Rectangle window = new Rectangle(i,j, 20, 20);
				
				if((int)(2*Math.random()+1) == 2) {
					window.setFill(255, 255, 0);
					add(window);
				}
				else {
					window.setFill(220, 220, 220);
					add(window);
				}

			}
		}
		
		
	
	
	}
	
	public void draw(PApplet p) {
		super.draw(p);
		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
	}
}
