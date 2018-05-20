
import java.util.ArrayList;
import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * PowerUp objects that randomly spawn on the screen
 * @author matthewlee
 *
 */
public abstract class PowerUp extends Rectangle{
	
	private double vx;
	private double vy;
	private int originalTime = 0;
	
	
	
	public PowerUp(double x, double y, double width, double height)
	{
		super(x,y, width, height);
		vx = 0;
		vy = 0;
		
	}
	
	public void act() {
		vy += 0.25;
		
		setX(getX() + vx);
		setY(getY() + vy);
	}
	
	public void setVY(double amt)
	{
		vy = amt;
	}
	
	public int getOriginalTime()
	{
		return originalTime;
	}

	public void setOriginalTime(int amt)
	{
		originalTime = amt;
	}
	
	public boolean isColliding(ArrayList<Shape2D> shapes)
	{
		
	}
	
	 
	public abstract void draw(PApplet p);
		
	
	public abstract void performPowerUp(Sling s);

}
