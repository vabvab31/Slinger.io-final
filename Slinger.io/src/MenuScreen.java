
import lyndon.shapes.Rectangle;
import processing.core.PApplet;
import processing.core.PFont;

/** The start screen with the option to start the game, get instructions, or select the about screen.
 * @author Lyndon Lee A
 */
public class MenuScreen {
	
	private boolean start, inst, about;
	
	public MenuScreen() {
		start = false;
		inst = false;
		about = false;
	}
	
	public void draw (PApplet p, int mouseX, int mouseY) {
		p.background(60, 61, 68);
		PFont font1 = p.createFont("font1.ttf", 70);
		PFont font2 = p.createFont("font2.ttf", 150);
		
		// Start
		p.textFont(font1);
		Rectangle start = new Rectangle(70, 250, 200, 100);
		start.setFill(24, 119, 160);
		if (start.isPointInside(mouseX, mouseY)) {
			start.setFill(17, 92, 124);
			this.start = true;
		}
		else
			this.start = false;
		start.draw(p);
		p.fill(255);
		p.text("Start", 107, 320);
		
		// Instructions
		Rectangle inst = new Rectangle(300, 250, 200, 100);
		inst.setFill(24, 119, 160);
		if (inst.isPointInside(mouseX, mouseY)) {
			inst.setFill(17, 92, 124);
			this.inst = true;
		}
		else
			this.inst = false;
		inst.draw(p);
		p.fill(255);
		p.textSize(60);
		p.text("Tutorial", 322, 320);
		
		// About
		Rectangle about = new Rectangle(530, 250, 200, 100);
		about.setFill(24, 119, 160);
		if (about.isPointInside(mouseX, mouseY)) {
			about.setFill(17, 92, 124);
			this.about = true;
		}
		else
			this.about = false;
		about.draw(p);
		p.fill(255);
		p.textSize(70);
		p.text("About", 567, 320);
		
		// Title
		p.textFont(font2);
		p.fill(101, 155, 123);
		p.text("slinger", 160, 200);
		p.fill(180, 66, 64);
		p.text(".io", 530, 200);
	}
	
	public boolean start() {
		return start;
	}

	public boolean inst() {
		return inst;
	}
	
	public boolean about() {
		return about;
	}
	
}