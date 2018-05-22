
import lyndon.shapes.Circle;
import lyndon.shapes.Ellipse;
import lyndon.shapes.Rectangle;
import processing.core.PApplet;
/**
 * Extends the Projectile class, one of the three projectiles. Strongest but slowest projectile
 * 
 * @author Vaibhav Seshadri
 *
 */
public class Watermelon extends Projectile{
	
	public Watermelon() {
		super(2,3,9,0,0);
	}

	@Override
	public void draw(PApplet p) {
		super.draw(p);
		Ellipse Watermelon = new Ellipse(xPos, yPos, 16, 22);
		Ellipse whitePart = new Ellipse(xPos, yPos, 14, 19);
		Ellipse redPart = new Ellipse(xPos, yPos, 11, 16);
		Watermelon.setFill(119, 200, 15);
		redPart.setFill(255, 79, 73);
		whitePart.setFill(255, 255, 255);
		
		
		Watermelon.draw(p);
		whitePart.draw(p);
		redPart.draw(p);
	}



}
