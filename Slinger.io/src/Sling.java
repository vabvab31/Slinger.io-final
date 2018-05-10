import java.awt.Color;
import java.util.ArrayList;

import lyndon.shapes.*;
import processing.core.PApplet;

public class Sling {

		private Projectile p; 
		private Color c;
		private int xPos;
		private int yPos; //not set in the constructor, set after the draw method is run
		private int health; //0-100
		private boolean isDead;
		private ArrayList<Shape> shapes;
		
		

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
			ArrayList<Rectangle> sling = new ArrayList<Rectangle>();
			sling.add(new Rectangle(xPos, 530, 5,5));
			sling.add(new Rectangle(xPos+10, 530, 5,5));
			sling.add(new Rectangle(xPos, 535, 15,5));
			sling.add(new Rectangle(xPos+5, 540, 5,10));
			for(Shape s : sling) {
				((Rectangle)s).setFill(c.getRed(), c.getGreen(), c.getBlue());
				s.setStroke(c.getRed(), c.getGreen(), c.getBlue());
				s.draw(p);
				shapes.add(s);
			}
			p.stroke(0);
		}
		
		/**
		 * Returns true if the current location of the sling is inside one of the shpes in the map shapes array that was passed in.
		 * @param shapes ArrayList of all shapes in the MAP
		 */
		public boolean intersect(ArrayList<Shape2D> shapes )
		{
			
			for(Shape2D s : shapes)
			{
				int x = xPos-2;
				int y = 60;
				
				if(s.isPointInside(xPos, y))
				{
					return true;
				}
			}
			
			return false;
		}
		
}