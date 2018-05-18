import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * Restores health 100% for the sling.
 * @author matthewlee
 *
 */
public class FullHealth extends PowerUp{
	
	

	public FullHealth(double x, double y) {
		super(x,y,40,40);

	}

	@Override
	/**
	 * A red box --> represents full health
	 * @post the fill is going to be set to red
	 * Draws a full health restore object
	 */
	public void draw(PApplet p) {
		
		Rectangle r = new Rectangle(getX(),getY(),40,40);
		r.setFill(255, 0, 0);
		r.draw(p);
	}

	
	/**
	 * Fully restores the health of the sling
	 */
	public void performPowerUp(Sling s) {
		s.restoreHealth();
	}

}
