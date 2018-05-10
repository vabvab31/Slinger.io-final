import java.util.ArrayList;

import lyndon.shapes.*;
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
	


	public boolean intersect(ArrayList<Shape2D> shapes){
		
		for(int i = 0; i < shapes.size(); i++) {
			if(shapes.get(i).isPointInside(xPos-2, yPos) || shapes.get(i).isPointInside(xPos+2, yPos) || shapes.get(i).isPointInside(xPos, yPos-2) || shapes.get(i).isPointInside(xPos, yPos+2)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean intersect(Shape2D shape){
		return shape.isPointInside(xPos, yPos);
	}
}
