
import java.util.ArrayList;

import lyndon.shapes.*;
import processing.core.PApplet;
/**
 * Represents a projectile object that is abstract
 * @author matthewlee
 *@version 5-10-18
 */
public abstract class Projectile {
	
	public static final int maxPower = 10; //filler
	protected int xVelocity; //1-10
	protected int yVelocity; //1-
	protected int maxHorizontalMovement; //for the sling
	protected int xPos; 
	protected int yPos;
	
	
	public Projectile(int velocity, int horz, int power, int x, int y) {
		this.yVelocity = velocity;
		this.xVelocity = horz;
		this.maxHorizontalMovement = power;
		this.xPos = x;
		this.yPos = y;
	}
	
	/**
	 * Sets the xy --> primarily for setting postition right after the projectile gets put into a sling
	 * @param x - the x location
	 * @param y - the y location
	 */
	public void setXY(int x, int y)
	{
		this.xPos = x;
		this.yPos = y;
	}
	
	/**
	 * Adds 1 more unit to the velocty field
	 * Doesn't add if the velocity is already at 10
	 */
	public void upgradeVelocity()
	{
		if(yVelocity<10)
		{
			yVelocity++;
		}
	}
	
	/**
	 * Adds 1 more unit to the power field
	 * Doesn't add if the power is already at 10
	 */
	public void upgradePower()
	{
		if(maxHorizontalMovement<10)
		{
			maxHorizontalMovement++;
		}
	}
	
	/**
	 * Adds 1 more unit to the range field
	 * Doesn't add if the range is already at 10
	 */
	public void upgradeYMovement()
	{
		if(yVelocity<10)
		{
			yVelocity++;
		}
	}
	
	public int getXVelocity()
	{
		return this.xVelocity;
	}
	
	public int getMaxHorizontalMovement()
	{
		return this.maxHorizontalMovement;
	}
	
	public int getYVelocity()
	{
		return this.yVelocity;
	}
	
	public void setXVelocity(int i)
	{
		xVelocity = i;
	}
	
	public void setMaxHorizontalMovement(int i)
	{
		maxHorizontalMovement = i;
	}
	
	public void setYVelocity(int i)
	{
		yVelocity = i;
	}
	
	
	public void xMove(int amt)
	{
		xPos += amt;
	}
	
	public void yMove(int amt)
	{
		yPos +=amt;
	}
	
	
	
	public void draw(PApplet p) {
		yVelocity++;
		yPos += yVelocity/4;
		xPos += xVelocity*2;
	}
	


	public boolean intersect(ArrayList<Shape2D> shapes){
		
		for(int i = 0; i < shapes.size(); i++) {
			/*if(shapes.get(i).isPointInside(xPos-2, yPos) || shapes.get(i).isPointInside(xPos+2, yPos) || shapes.get(i).isPointInside(xPos, yPos-2) || shapes.get(i).isPointInside(xPos, yPos+2)) {
				return true;
			}*/
			if (shapes.get(i).isPointInside(xPos, yPos))
				return true;
		}
		return false;
	}
	
	public boolean intersect(Shape2D shape){
		return shape.isPointInside(xPos, yPos);
	}
}
