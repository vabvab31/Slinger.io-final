import lyndon.shapes.Circle;
import processing.core.PApplet;

public class TennisBall extends Projectile{

	public TennisBall() {
		super(-60,7, 2,20,330); //default
	}
	
	

	@Override
	public void draw(PApplet p) {
		super.draw(p);
		Circle tennisBall =  new Circle(xPos,yPos,5);
		tennisBall.setFill(160, 185, 40);
		 
		
		tennisBall.draw(p);

	}


	
}
