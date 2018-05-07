import lyndon.shapes.*;
import processing.core.PApplet;

public class Map1 extends Map{
	
	private int width = 800;
	private int height = 900;
	
	public Map1(Sling player1, Sling player2) {
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
	}
}
