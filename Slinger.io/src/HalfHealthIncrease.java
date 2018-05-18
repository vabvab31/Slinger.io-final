import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * This power up increases health by 50%
 * @author matthewlee
 *
 */
public class HalfHealthIncrease extends PowerUp{
	public HalfHealthIncrease(double x, double y) {
		super(x,y, 40,40);
	}

	@Override
	/**
	 * A red box --> represents full health
	 * @post the fill is going to be set to red
	 * Draws a full health restore object
	 */
	public void draw(PApplet p) {
		Rectangle powerup1 = new Rectangle(getX(), getY(), 20,40);
		powerup1.setFill(255, 0, 0);
		powerup1.draw(p);
		
		Rectangle powerup2 = new Rectangle(getX()+20, getY(), 20,40);
		powerup2.setFill(0, 0, 255);
		powerup2.draw(p);
	}

	
	/**
	 * Fully restores the health of the sling
	 */
	public void performPowerUp(Sling s) {
		s.increaseHealth(s.getHealth()/2);;
	}

}
