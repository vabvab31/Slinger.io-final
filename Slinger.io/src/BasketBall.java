import lyndon.shapes.Circle;
import processing.core.PApplet;

public class BasketBall extends Projectile{

	public BasketBall() {
		super(5, 5, 5,0,0);
	}

	@Override
	public void paint(PApplet p) {

		Circle basketBall = new Circle(xPos, yPos, 10);
		basketBall.setFill(255, 140, 0);
		
		basketBall.draw(p);
	}



}
