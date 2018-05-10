import java.util.ArrayList;

import lyndon.shapes.Shape2D;
import processing.core.PApplet;

public abstract class Projectile {
	
	public static final int maxPower = 10; //filler
	protected int yMovement; //1-10
	protected int xMovement; //1-
	protected int maxHorizontalMovement; //for the sling
	protected int xPos; 
	protected int yPos;
	
	
	public Projectile(int velocity, int horz, int power, int x, int y) {
		this.xMovement = velocity;
		this.yMovement = horz;
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
		if(xMovement<10)
		{
			xMovement++;
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
		if(yMovement<10)
		{
			yMovement++;
		}
	}
	
	public int getXVelocity()
	{
		return this.xMovement;
	}
	
	public int getMaxHorizontalMovement()
	{
		return this.maxHorizontalMovement;
	}
	
	public int getHorizontalVelocity()
	{
		return this.yMovement;
	}
	
	public void setXVelocity(int i)
	{
		xMovement = i;
	}
	
	public void setMaxHorizontalMovement(int i)
	{
		maxHorizontalMovement = i;
	}
	
	public void setYMovement(int i)
	{
		yMovement = i;
	}
	
	public void draw(PApplet p) {
		xMovement++;
		yPos += xMovement/4;
		xPos += yMovement;
	}
	
	
	/**
	 * Returns true if the current location of the sling is inside one of the shpes in the map shapes array that was passed in.
	 * @param shapes ArrayList of all shapes in the MAP and all shapes in the otherSling
	 */
	public boolean intersect(ArrayList<Shape2D>slingShapes, ArrayList<Shape2D>shapes)
	{
		
	}
}
