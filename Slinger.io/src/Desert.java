import lyndon.shapes.Circle;
import lyndon.shapes.Ellipse;
import lyndon.shapes.Rectangle;
import processing.core.PApplet;
import processing.core.PImage;
/**
 * 
 * @author matthewlee
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
		
		Ellipse dune1 = new Ellipse(width/2 - 200, 580, 200, 150);
		dune1.setFill(230, 232, 190);
		dune1.setStroke(230, 232, 190);
		add(dune1);
		
		Ellipse dune2 = new Ellipse(width/2 + 200, 580, 200, 150);
		dune2.setFill(230, 232, 190);
		dune2.setStroke(230, 232, 190);
		add(dune2);
		
		Ellipse dune3 = new Ellipse(width/2 + 110, 570, 190, 220);
		dune3.setFill(230, 232, 190);
		dune3.setStroke(230, 232, 190);
		add(dune3);
		
		Ellipse dune4 = new Ellipse(width/2 - 110, 570, 190, 220);
		dune4.setFill(230, 232, 190);
		dune4.setStroke(230, 232, 190);
		add(dune4);
		
		Ellipse dune5 = new Ellipse(width/2, 580, 220, 320);
		dune5.setFill(230, 232, 190);
		dune5.setStroke(230, 232, 190);
		add(dune5);
		
		
		
		Rectangle ground = new Rectangle(0,550,900,100); //Ground
		ground.setFill(230, 232, 190);
		ground.setStroke(230, 232, 190);
		add(ground);
		
		//Ellipse ground1 = new Ellipse
		
		Rectangle bark = new Rectangle(width/2- 12, 480, 25, 50);
		bark.setFill(93, 172, 92);
		bark.setStroke(93, 172, 92);
		add(bark);
		
		Rectangle cactus1 = new Rectangle(width/2 - 70 , 490, 70, 20);
		cactus1.setFill(93, 172, 92);
		cactus1.setStroke(93, 172, 92);
		add(cactus1);
		
		Rectangle vertical1 = new Rectangle(width/2 - 70 , 370, 15, 60);
		vertical1.setFill(93, 172, 92);
		vertical1.setStroke(93, 172, 92);
		add(vertical1);
		
		Rectangle vertical2 = new Rectangle(width/2 - 15 , 310, 15, 90);
		vertical2.setFill(93, 172, 92);
		vertical2.setStroke(93, 172, 92);
		add(vertical2);
		
		Rectangle vertical3 = new Rectangle(width/2 + 70 - 30, 340, 15, 75);
		vertical3.setFill(93, 172, 92);
		vertical3.setStroke(93, 172, 92);
		add(vertical3);

		
		
		
		
		
		
		
	

	
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
