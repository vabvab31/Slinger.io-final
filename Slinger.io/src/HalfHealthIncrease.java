import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * This power up increases health by 50%
 * @author matthewlee
 *
 */
public class HalfHealthIncrease extends PowerUp{
	public HalfHealthIncrease(double x, double y) {
		super(x,y);
	}

	@Override
	/**
	 * A red box --> represents full health
	 * @post the fill is going to be set to red
	 * Draws a full health restore object
	 */
	public void draw(PApplet p) {
		Rectangle powerup1 = new Rectangle(xVal(), yVal(), 10,20);
		powerup1.setFill(255, 0, 0);
		addShape(powerup1);
		
		Rectangle powerup2 = new Rectangle(xVal() + 10, yVal(), 10,20);
		powerup2.setFill(0, 0, 255);
		addShape(powerup2);
	}

	
	/**
	 * Fully restores the health of the sling
	 */
	public void performPowerUp(Sling s) {
		s.increaseHealth(s.getHealth()/2);;
	}

}
