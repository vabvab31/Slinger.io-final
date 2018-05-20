
import processing.core.PApplet;
import processing.core.PFont;
import lyndon.shapes.Ellipse;
/** The screen for the instructions.
 * @author Vaibhav Seshadri
 */
public class InstructionScreen {
	
	private int width = 800;
	private int height = 900;
	
	public InstructionScreen(){
		
	}
	
	public void draw(PApplet p) {
		
		p.background(196, 218, 255);
		
		PFont font1 = p.createFont("font2.ttf", 70);
		PFont font2 = p.createFont("font2.ttf", 40);
		PFont font3 = p.createFont("font1.ttf", 30);
		
		p.fill(0,0,0);
		
		Ellipse line = new Ellipse(width/2, 350, 5, 300);
		line.setFill(255, 112, 126);
		line.setStroke(255, 112, 126);
		line.draw(p);
		
		p.textFont(font1);
		p.fill(255, 112, 126);
		p.text("How To Play", width/2 - 140, 80);
		
		p.textFont(font2);
		
		p.text("Shoot", 150, 180);
		
		p.text("Move", 570, 180);
		
		p.textFont(font3);
		
		p.fill(0,0,0);
		p.text("MOUSE - click and drag to", 50, 300);
		p.text("set power and angle", 126, 340);

		p.text("SPACEBAR - shoot", 50, 425);
	}
	
}