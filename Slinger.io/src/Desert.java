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
	private int height = 600;
	private float x = 1 , y = 400;
	private float r = 204, g = 238, b = 255;
	private boolean isDay = true, isNight = false;
	private PImage photo;
	



	public Desert(Sling player1, Sling player2) {
		super(player1, player2);
		setMap();
	}

	public void setMap() {


		Circle cactus1 = new Circle(width/2, 400, 100);
		cactus1.setFill(37, 122, 43);
		cactus1.setStroke(37, 122, 43);
		add(cactus1);

		Circle cactus2 = new Circle(width/2 + 52, 340, 75);
		cactus2.setFill(37, 122, 43);
		cactus2.setStroke(37, 122, 43);
		add(cactus2);

		Circle cactus3 = new Circle(width/2 + 16, 295, 50);
		cactus3.setFill(37, 122, 43);
		cactus3.setStroke(37, 122, 43);
		add(cactus3);

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



		for (int i = 0; i < 20; i ++) {

			int x = (int) (Math.random()* 80 + 360);
			int y = (int) (Math.random()* 80 + 360);

			Rectangle spike = new Rectangle(x,y,3,3);
			add(spike);


		}

		for (int i = 0; i < 14; i ++) {

			int x = (int) (Math.random()* 55 + 425);
			int y = (int) (Math.random()* 55 + 305);

			Rectangle spike = new Rectangle(x,y,3,3);
			add(spike);


		}

		for (int i = 0; i < 10; i ++) {

			int x = (int) (Math.random()* 30 + 401);
			int y = (int) (Math.random()* 30 + 280);

			Rectangle spike = new Rectangle(x,y,3,3);
			add(spike);


		}











	}

	//	public void setup(PApplet p) {
	//		photo = p.loadImage("Desert.png");
	//		photo.resize(800, 600);
	//	}

	public void draw(PApplet p) {
		
		
		
		
		if(isDay == true) {
		
			p.background(r, g, b);
			p.fill(244, 249, 99);
			p.stroke(244, 249, 99);
			p.ellipse(x, y, 80, 80);
			
			r = (float) (r- 0.02);
		
			
			g = (float) (g- 0.02);
		
			
			b = (float) (b- 0.02);
			
		
		
			x = (float) (x + 0.1);
			
			y = (float) (y- 0.1);
			
		
			if(x > 400.00) {
			y =  (float) (y + 0.2);
			
			}
		
		}
		
		if(x > 780) {
			isDay = false;
			isNight = true;
		}
		
		if(x < 20) {
			isDay = true;
			isNight = false;
		}
		
		if(isNight == true) {
			
			p.background(r, g, b);
			p.fill(254, 252, 215);
			p.stroke(254, 252, 215);
			p.ellipse(x, y, 80, 80);
			
			r = (float) (r + 0.02);
			
			
			g = (float) (g + 0.02);
			
			
			b = (float) (b + 0.02);
			
		
		
			x = (float) (x - 0.1);
	
			y = (float) (y - 0.1);
			
		
			if(x < 400.00) {
			y =  (float) (y + 0.2);
			
			}
		
		}
		
		
		super.draw(p);





		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
	}

}
