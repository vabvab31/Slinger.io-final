import lyndon.shapes.Circle;
import lyndon.shapes.Line;
import processing.core.PApplet;

public class BasketBall extends Projectile{

	public BasketBall() {
		super(5, 5, 5,0,0);
	}

	@Override
	public void paint(PApplet p) {

		Circle basketBall = new Circle(xPos, yPos, 10);
		
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
