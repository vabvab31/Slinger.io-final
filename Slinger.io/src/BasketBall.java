
import lyndon.shapes.Circle;
import lyndon.shapes.Line;
import processing.core.PApplet;
/**
 * Extends the Projectile class, one of the three projectiles. Projectile that is equally strong as it is fast.
 * 
 * @author Vaibhav Seshadri
 *
 */
public class BasketBall extends Projectile{

	public BasketBall() {
		super(5, 5, 5,0,0);
	}

	@Override
	public void draw(PApplet p) {
		super.draw(p);
		Circle basketBall = new Circle(xPos, yPos, 18);
		
		Line stripe1 = new Line(xPos, yPos - 9, xPos, yPos + 9 );
		Line stripe2 = new Line(xPos - 9, yPos, xPos + 9, yPos);
		
		
		
		basketBall.setFill(255, 140, 0);
		
		basketBall.draw(p);
		p.noFill();
		p.arc(xPos + 7, yPos, 8, 12, (float) Math.PI/2, (float) (Math.PI/2)*3);
		p.arc(xPos - 7, yPos, 8, 12, (float) (Math.PI/2)*3, (float) ((Math.PI)*2 + (float)Math.PI/2));		
		stripe1.draw(p);
		stripe2.draw(p);
		
		
	}



}
