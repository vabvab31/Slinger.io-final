import lyndon.shapes.Circle;
import lyndon.shapes.Rectangle;
import processing.core.PApplet;

public class Watermelon extends Projectile{

	public Watermelon() {
		super(2,3,9,0,0);
	}

	@Override
	public void paint(PApplet p) {
		
		Circle Watermelon = new Circle(xPos, yPos, 12);
		Circle redPart = new Circle(xPos, yPos, 9);
		Watermelon.setFill(0, 100, 0);
		redPart.setFill(100, 0, 0);
		
		
		Watermelon.draw(p);
		redPart.draw(p);
	}



}
