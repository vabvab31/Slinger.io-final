
import java.util.ArrayList;
import lyndon.shapes.Shape;
import processing.core.PApplet;
/**
 * PowerUp objects that randomly spawn on the screen
 * @author matthewlee
 *
 */
public abstract class PowerUp {
	
	private double x;
	private double y;
	private ArrayList <Shape> shapes;
	
	
	public PowerUp(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @return the x position of the powerup
	 */
	public double xVal()
	{
		return x;
	}
	
	/**
	 * 
	 * @return the y position of the powerup
	 */
	public double yVal()
	{
		return y;
	}
	
	public void addShape(Shape s)
	{
		shapes.add(s);
	}
	
	public ArrayList <Shape> shapesArray ()
	{
		return shapes;
	}
	
	public abstract void draw(PApplet p);
	
	public abstract void performPowerUp(Sling s);

}
