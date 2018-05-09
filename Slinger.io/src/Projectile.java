import processing.core.PApplet;

public abstract class Projectile {
	
	protected int velocity; //1-10
	protected int rangeOfMovement; //1-
	protected int power; //max power
	protected int xPos;
	protected int yPos;
	
	
	public Projectile(int velocity, int range, int power, int x, int y) {
		this.velocity = velocity;
		this.rangeOfMovement = range;
		this.power = power;
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
		if(velocity<10)
		{
			velocity++;
		}
	}
	
	/**
	 * Adds 1 more unit to the power field
	 * Doesn't add if the power is already at 10
	 */
	public void upgradePower()
	{
		if(power<10)
		{
			power++;
		}
	}
	
	/**
	 * Adds 1 more unit to the range field
	 * Doesn't add if the range is already at 10
	 */
	public void upgradeRange()
	{
		if(rangeOfMovement<10)
		{
			rangeOfMovement++;
		}
	}
	
	public int getVelocity()
	{
		return this.velocity;
	}
	
	public int getPower()
	{
		return this.power;
	}
	
	public int getRange()
	{
		return this.rangeOfMovement;
	}
	
	public void setVelocity(int i)
	{
		velocity = i;
	}
	
	public void setPower(int i)
	{
		power = i;
	}
	
	public void setRange(int i)
	{
		rangeOfMovement = i;
	}
	
	public void draw(PApplet p) {
		velocity++;
		yPos += velocity/4;
		xPos += rangeOfMovement;
	}
}
