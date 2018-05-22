import lyndon.shapes.*;
import java.awt.geom.Ellipse2D;

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
		
		
		
		Ellipse cactus1 = new Ellipse(width/2, 330, 50, 200);
		cactus1.setFill(54, 135, 40);
		cactus1.setStroke(54, 135, 40);
		add(cactus1);
		
		Ellipse cactus2 = new Ellipse(width/2 + 25, 350, 50, 30);
		cactus2.setFill(54, 135, 40);
		cactus2.setStroke(54, 135, 40);
		add(cactus2);
		
		Ellipse cactus3 = new Ellipse(width/2 + 47, 320, 20, 70);
		cactus3.setFill(54, 135, 40);
		cactus3.setStroke(54, 135, 40);
		add(cactus3);

		Ellipse cactus4 = new Ellipse(width/2 - 25, 310, 50, 30);
		cactus4.setFill(54, 135, 40);
		cactus4.setStroke(54, 135, 40);
		add(cactus4);
		
		Ellipse cactus5 = new Ellipse(width/2 - 47, 280, 20, 70);
		cactus5.setFill(54, 135, 40);
		cactus5.setStroke(54, 135, 40);
		add(cactus5);
		
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
