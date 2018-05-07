import lyndon.shapes.Circle;
import processing.core.PApplet;

public class TennisBall extends Projectile{

	public TennisBall() {
		super(7,7, 2,0,0); //default
	}
	
	

	@Override
	public void paint(PApplet p) {
		
		Circle tennisBall =  new Circle(xPos,yPos,3);
		tennisBall.setFill(80, 100, 0);
		 
		
		tennisBall.draw(p);

	}


	
}
