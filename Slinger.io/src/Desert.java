import lyndon.shapes.Circle;
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
		Rectangle ground = new Rectangle(0,550,900,100); //Ground
		ground.setFill(162, 165, 72);
		ground.setStroke(162, 165, 72);
		add(ground);
		
		Rectangle bark = new Rectangle(width/2-50 + 25, 450, 50, 100);
		bark.setFill(93, 172, 92);
		bark.setStroke(93, 172, 92);
		add(bark);
		
		Rectangle cactus1 = new Rectangle(width/2 - 70 , 410, 140, 40);
		cactus1.setFill(93, 172, 92);
		cactus1.setStroke(93, 172, 92);
		add(cactus1);
		
		Rectangle vertical1 = new Rectangle(width/2 - 70 , 290, 30, 120);
		vertical1.setFill(93, 172, 92);
		vertical1.setStroke(93, 172, 92);
		add(vertical1);
		
		Rectangle vertical2 = new Rectangle(width/2 - 15 , 230, 30, 180);
		vertical2.setFill(93, 172, 92);
		vertical2.setStroke(93, 172, 92);
		add(vertical2);
		
		Rectangle vertical3 = new Rectangle(width/2 + 70 - 30, 260, 30, 150);
		vertical3.setFill(93, 172, 92);
		vertical3.setStroke(93, 172, 92);
		add(vertical3);
		
		
		
		
		
	
	
	}
	
	public void setup(PApplet p) {
		photo = p.loadImage("Desert.png");
		photo.resize(800, 600);
	}
	
	public void draw(PApplet p) {
		setup(p);
		p.image(photo, 0, 0);
		
		super.draw(p);
		
		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
	}
	
}
