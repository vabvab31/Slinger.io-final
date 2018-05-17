import lyndon.shapes.Circle;
import lyndon.shapes.Rectangle;
import processing.core.PApplet;

/**
 * Represents the second Map: Park
 * @author matthewlee
 *@version 5-10-18
 */
public class Park extends Map{
	
	private int width = 800;
	private int height = 900;
	
	public Park(Sling player1, Sling player2) {
		super(player1, player2);
		setMap();
	}
	
	public void setMap() {
		
		
		Rectangle ground = new Rectangle(0,550,900,100); //Ground
		ground.setFill(63, 54, 43);
		add(ground);
		
		
		
		Rectangle bark = new Rectangle(width/2- 25, 400, 50, 150);
		bark.setFill(87, 58, 43);
		bark.setStroke(87, 58, 43);
		add(bark);
		
		Circle tree1 = new Circle(width/2 - 35, 400, 50);
		tree1.setFill(42, 201, 52);
		tree1.setStroke(42, 201, 52);
		add(tree1);
		
		Circle tree2 = new Circle(width/2, 400, 50);
		tree2.setFill(42, 201, 52);
		tree2.setStroke(42, 201, 52);
		add(tree2);
		
		Circle tree3 = new Circle(width/2 + 35, 400, 50);
		tree3.setFill(42, 201, 52);
		tree3.setStroke(42, 201, 52);
		add(tree3);
		
		Circle tree4 = new Circle(width/2 + 45, 370, 50);
		tree4.setFill(42, 201, 52);
		tree4.setStroke(42, 201, 52);
		add(tree4);
		
		Circle tree5 = new Circle(width/2 - 45, 370, 50);
		tree5.setFill(42, 201, 52);
		tree5.setStroke(42, 201, 52);
		add(tree5);
		
		Circle tree8 = new Circle(width/2, 370, 80);
		tree8.setFill(42, 201, 52);
		tree8.setStroke(42, 201, 52);
		add(tree8);
		
		Circle tree6 = new Circle(width/2 - 35, 340, 50);
		tree6.setFill(42, 201, 52);
		tree6.setStroke(42, 201, 52);
		add(tree6);
		
		Circle tree7 = new Circle(width/2 + 35, 340, 50);
		tree7.setFill(42, 201, 52);
		tree7.setStroke(42, 201, 52);
		add(tree7);
		
		Circle tree9 = new Circle(width/2, 320, 50);
		tree9.setFill(42, 201, 52);
		tree9.setStroke(42, 201, 52);
		add(tree9);
		
		
		
		
		
		
//		Rectangle tree1 = new Rectangle(width/2 - 90 , 410, 180, 40);
//		tree1.setFill(87, 191, 43);
//		tree1.setStroke(87, 191, 43);
//		add(tree1);
//		
//		Rectangle tree2 = new Rectangle(width/2 - 70 , 370, 140, 40);
//		tree2.setFill(87, 191, 43);
//		tree2.setStroke(87, 191, 43);
//		add(tree2);
//		
//		Rectangle tree3 = new Rectangle(width/2 - 50 , 330, 100, 40);
//		tree3.setFill(87, 191, 43);
//		tree3.setStroke(87, 191, 43);
//		add(tree3);
//		
//		Rectangle tree4 = new Rectangle(width/2 - 30 , 290, 60, 40);
//		tree4.setFill(87, 191, 43);
//		tree4.setStroke(87, 191, 43);
//		add(tree4);
//		
//		Rectangle tree5 = new Rectangle(width/2 - 10 , 250, 20, 40);
//		tree5.setFill(87, 191, 43);
//		tree5.setStroke(87, 191, 43);
//		add(tree5);
		
		Circle sun = new Circle(150, 150, 70);
		sun.setFill(252, 252, 43);
		sun.setStroke(252, 252, 43);
		add(sun);
		
		
		Circle cloud1 = new Circle(640,160,40);
		cloud1.setStroke(255, 255, 255);
		cloud1.setFill(255, 255, 255);
		add(cloud1);
		
		Circle cloud2 = new Circle(660,160,40);
		cloud2.setStroke(255, 255, 255);
		cloud2.setFill(255, 255, 255);
		add(cloud2);
		
		Circle cloud3 = new Circle(640,140,40);
		cloud3.setStroke(255, 255, 255);
		cloud3.setFill(255, 255, 255);
		add(cloud3);
		
		Circle cloud4 = new Circle(660,140,40);
		cloud4.setStroke(255, 255, 255);
		cloud4.setFill(255, 255, 255);
		add(cloud4);
		
		Circle cloud5 = new Circle(650,150,40);
		cloud5.setStroke(255, 255, 255);
		cloud5.setFill(255, 255, 255);
		add(cloud5);
		
		
		
		
		
		
		
		
	
		
	
	
	}
	

	public void draw(PApplet p) {
		p.background(137, 203, 248);
		super.draw(p);
		if (player1.getHealth() > 0) player1.draw(p);
		if (player2.getHealth() > 0) player2.draw(p);
	}

}
