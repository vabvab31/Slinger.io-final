
import processing.core.PApplet;
import processing.core.PFont;
import lyndon.shapes.Ellipse;
import lyndon.shapes.Rectangle;
/** The screen for the instructions.
 * @author Vaibhav Seshadri
 */
public class InstructionScreen {
	
	private int width = 800;
	private int height = 600;
	
	public InstructionScreen(){
		
	}
	
	public void draw(PApplet p) {
		
		p.background(60, 61, 68);
		
		PFont font1 = p.createFont("font2.ttf", 70);
		PFont font2 = p.createFont("font2.ttf", 40);
		PFont font3 = p.createFont("font1.ttf", 30);
		PFont font4 = p.createFont("font1.ttf", 20);
		
		Ellipse line = new Ellipse(width/2, 350, 5, 300);
		line.setFill(180, 66, 64);
		line.setStroke(180, 66, 64);
		line.draw(p);
		
		p.textFont(font1);
		p.fill(101, 155, 123);
		p.text("How To Play", width/2 - 140, 80);
		
		p.textFont(font2);
		p.fill(180, 66, 64);
		
		p.text("Shoot", 150, 180);
		
		p.text("Move", 570, 180);
		
		p.textFont(font3);
		
		p.fill(255,255,255);
		p.text("MOUSE - click and drag to", 50, 300);
		p.text("set power and angle", 126, 340);

		p.text("SPACEBAR - shoot", 50, 425);
		
		p.text("A - move to the left", width/2 + 100, 300);
		p.text("D - move to the right", width/2 + 100, 425);
		

		p.textFont(font4);
		
		Rectangle fullHealth = new Rectangle(10, height - 60, 40, 40);
		fullHealth.setFill(255,0,0);
		fullHealth.draw(p);
		
		p.fill(255,255,255);
		p.text("- Gives sling full health", 60, height - 35);
		
		Rectangle IncreaseSlingRange = new Rectangle(290, height - 60, 40, 40);
		IncreaseSlingRange.setFill(0,255,0);
		IncreaseSlingRange.draw(p);
		
		p.fill(255,255,255);
		p.text("- Increases sling range", 340, height - 35);
		
		Rectangle halfHealth1 = new Rectangle(570, height - 60, 20, 40);
		halfHealth1.setFill(255,0,0);
		halfHealth1.draw(p);
		
		Rectangle halfHealth2 = new Rectangle(590, height - 60, 20, 40);
		halfHealth2.setFill(0,0,255);
		halfHealth2.draw(p);
		
		p.fill(255,255,255);
		p.text("- Gives sling half health", 620, height - 35);
		
		p.text("Right Click to return to main menu", 10, 35);
		
	}
	
}