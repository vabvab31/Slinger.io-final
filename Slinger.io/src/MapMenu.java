import lyndon.shapes.Rectangle;
import processing.core.PApplet;
import processing.core.PFont;

public class MapMenu {
	private boolean map1, map2, map3;
	public MapMenu() {
		map1 = false;
		map2 = false;
		map3 = false;
	}
	
	public void draw (PApplet p, int mouseX, int mouseY) {
		p.background(60, 61, 68);
		
		PFont font1 = p.createFont("font1.ttf", 120);
		PFont font2 = p.createFont("font2.ttf", 150);
		
		// Start
		p.textFont(font1);
		Rectangle start = new Rectangle(70, 200, 200, 200);
		start.setFill(24, 119, 160);
		if (start.isPointInside(mouseX, mouseY)) {
			start.setFill(17, 92, 124);
			this.map1 = true;
		}
		else
			this.map1 = false;
		start.draw(p);
		p.fill(255);
		p.textSize(70);
		p.text("(map1)", 107, 320);
		
		// Instructions
		Rectangle inst = new Rectangle(300, 200, 200, 200);
		inst.setFill(24, 119, 160);
		if (inst.isPointInside(mouseX, mouseY)) {
			inst.setFill(17, 92, 124);
			this.map2 = true;
		}
		else
			this.map2 = false;
		inst.draw(p);
		p.fill(255);
		p.text("(map2)", 335, 320);
		
		// About
		Rectangle about = new Rectangle(530, 200, 200, 200);
		about.setFill(24, 119, 160);
		if (about.isPointInside(mouseX, mouseY)) {
			about.setFill(17, 92, 124);
			this.map3 = true;
		}
		else
			this.map3 = false;
		about.draw(p);
		p.fill(255);
		p.text("(map3)", 567, 320);
		
		
		
		// Title
		p.textFont(font1);
		p.fill(101, 155, 123);
		p.text("choose your map", 90, 150);
	}
	
	
	public boolean map1() {
		return map1;
	}

	public boolean map2() {
		return map2;
	}
	
	public boolean map3() {
		return map3;
	}
}