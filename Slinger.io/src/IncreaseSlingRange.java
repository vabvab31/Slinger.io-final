import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * This power up increases sling range by 1
 * @author matthewlee
 *
 */
public class IncreaseSlingRange extends PowerUp{
	public IncreaseSlingRange(double x, double y) {
		super(x,y);
	}

	@Override
	/**
	 * A red box --> represents full health
	 * @post the fill is going to be set to red
	 * Draws a full health restore object
	 */
	public void draw(PApplet p) {
		Rectangle powerup1 = new Rectangle(xVal(), yVal(), 20,20);
		powerup1.setFill(0, 255, 0);
		addShape(powerup1);
		
	}

	
	/**
	 * Fully restores the health of the sling
	 */
	public void performPowerUp(Sling s) {
		s.getProjectile().maxHorizontalMovement++;
	}

}
