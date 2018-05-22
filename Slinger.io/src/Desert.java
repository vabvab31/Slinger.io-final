import lyndon.shapes.Circle;
import lyndon.shapes.Ellipse;
import lyndon.shapes.Rectangle;
import processing.core.PApplet;
import processing.core.PImage;
/**
 * 
 * @author Vaibhav Seshadri
 *
 */
public class Desert extends Map{
	
	private int width = 800;
	private int height = 900;
	private PImage photo;

	
	public Desert(Sling player1, Sling player2) {
		super(player1, player2);
		setMap();
	}
	
	public void setMap() {
		
		
		
		
	
		
		Circle dune1 = new Circle(width/2 - 200, 580, 175);
		dune1.setFill(230, 232, 190);
		dune1.setStroke(230, 232, 190);
		add(dune1);
		
		Circle dune2 = new Circle(width/2 + 200, 580, 175);
		dune2.setFill(230, 232, 190);
		dune2.setStroke(230, 232, 190);
		add(dune2);
		
		Circle dune3 = new Circle(width/2 + 110, 570, 205);
		dune3.setFill(230, 232, 190);
		dune3.setStroke(230, 232, 190);
		add(dune3);
		
		Circle dune4 = new Circle(width/2 - 110, 570, 205);
		dune4.setFill(230, 232, 190);
		dune4.setStroke(230, 232, 190);
		add(dune4);
		
		Circle dune5 = new Circle(width/2, 580, 270);
		dune5.setFill(230, 232, 190);
		dune5.setStroke(230, 232, 190);
		add(dune5);
		
		
		
		Rectangle ground = new Rectangle(0,550,900,100); //Ground
		ground.setFill(230, 232, 190);
		ground.setStroke(230, 232, 190);
		add(ground);
		
		//Ellipse ground1 = new Ellipse
		

		
		
		

		
		
		
		
		
	

	
	}
	
//	public void setup(PApplet p) {
//		photo = p.loadImage("Desert.png");
//		photo.resize(800, 600);
//	}
	
	public void draw(PApplet p) {
		//setup(p);
		//p.image(photo, 0, 0);
		
		super.draw(p);
		
	//	p.arc(a, b, c, d, start, stop);
		
		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
	}
	
}
