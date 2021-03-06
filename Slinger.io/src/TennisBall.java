
import lyndon.shapes.Circle;
import processing.core.PApplet;
/**
 * Extends the Projectile class, one of the three projectiles. Weakest but fastest projectile
 * 
 * @author Vaibhav Seshadri
 *
 */
public class TennisBall extends Projectile{
	
	public TennisBall() {
		super(-60,7, 70,20,330); //default
	}
	
	

	@Override
	public void draw(PApplet p) {
		super.draw(p);
		Circle tennisBall =  new Circle(xPos,yPos,8);
		tennisBall.setFill(160, 185, 40);

		p.arc(xPos - 4, yPos, 4, 4, 0, (float) (Math.PI/2));
		 

		tennisBall.draw(p);

	}


	
}
