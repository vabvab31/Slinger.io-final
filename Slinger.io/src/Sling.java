import java.awt.Color;

import processing.core.PApplet;

public class Sling {

		private Projectile p; 
		private Color c;
		private int xPos;
		private int health; //0-100
		private boolean isDead;
		
		

		/**
		 * 
		 * @param p - The type of projectile this sling has
		 * @param c - The color type this sling is
		 * @param x - The x position of the sling on the game
		 */
		public Sling (Projectile p, Color c, int xPos)
		{
			this.p = p;
			this.c = c;
			this.xPos = xPos;
			health = 100;
			isDead = false;
			p.setXY(xPos, 0);
		}
		
		/**
		 * 
		 * @return - the projectile the sling has
		 */
		public Projectile getProjectile()
		{
			return p;
		}
		
		/**
		 * 
		 * @return - the color type the swing is
		 */
		public Color getColor()
		{
			return c;
		}
		
		
		/**
		 * 
		 * @return - the x position the swing currently is at
		 */
		public int xPos()
		{
			return xPos;
		}
		
		
		/**
		 * This method returns the 
		 * @param amount - number of units to move by
		 */
		public void move(int amount)
		{
			xPos+=amount;
		}
		
		
		/**
		 * Restored health to max
		 */
		public void restoreHealth()
		{
			health = 100;
		}
		
		
		/**
		 * 
		 */
		public void increaseProjectileStrength()
		{
			//p.increasePower(10);
		}
		
		
		public void decreaseHealth(int amount)
		{
			health-=amount;
			if(health<=0)
			{
				isDead = true;
			}
		
		}
		
		public int getHealth() 
		{
			return health;
		}
		
		public void draw(PApplet p) {
			p.rect(0, 0, 10, 10);
		}
		
}