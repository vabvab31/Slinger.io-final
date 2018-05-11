
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
		Circle basketBall = new Circle(xPos, yPos, 15);
		
		Line stripe1 = new Line(xPos, yPos - 10, xPos, yPos + 10 );
		Line stripe2 = new Line(xPos - 10, yPos, xPos + 10, yPos);
		Line stripe3 = new Line(xPos - 5, yPos - 10, xPos + 5, yPos + 10 );
		Line stripe4 = new Line(xPos + 5, yPos - 10, xPos + 5, yPos + 10 );
		
		basketBall.setFill(255, 140, 0);
		
		basketBall.draw(p);
		stripe1.draw(p);
		stripe2.draw(p);
		stripe3.draw(p);
		stripe4.draw(p);
		
	}



}
