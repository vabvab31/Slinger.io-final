import lyndon.shapes.*;
import processing.core.PApplet;

public class Map1 extends Map{
	
	public Map1(Sling player1, Sling player2) {
		super(player1, player2);
		setMap();
	}
	
	public void setMap() {
		Rectangle ground = new Rectangle(0,550,900,100);
		ground.setFill(0,0,0);
		add(ground);
	}
	
	public void draw(PApplet p) {
		super.draw(p);
	}
}
