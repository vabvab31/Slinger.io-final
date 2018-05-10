
import lyndon.shapes.Rectangle;
import processing.core.PApplet;
import processing.core.PFont;
/** The screen for selecting the maps.
 * @author Lyndon Lee A
 */
public class MapMenu {
	private boolean map1, map2, map3;
	public MapMenu() {
		map1 = false;
		map2 = false;
		map3 = false;
	}
	
	public void draw (PApplet p, int mouseX, int mouseY) {
		p.background(60, 61, 68);
		p.textAlign(p.LEFT);
		
		PFont font1 = p.createFont("font1.ttf", 120);
		PFont font2 = p.createFont("font2.ttf", 150);
		
		// Map1
		p.textFont(font1);
		Rectangle m1 = new Rectangle(70, 200, 200, 200);
		m1.setFill(24, 119, 160);
		if (m1.isPointInside(mouseX, mouseY)) {
			m1.setFill(17, 92, 124);
			this.map1 = true;
		}
		else
			this.map1 = false;
		m1.draw(p);
		p.fill(255);
		p.textSize(70);
		p.text("CITY", 130, 320);
		
		// Map2
		Rectangle m2 = new Rectangle(300, 200, 200, 200);
		m2.setFill(24, 119, 160);
		if (m2.isPointInside(mouseX, mouseY)) {
			m2.setFill(17, 92, 124);
			this.map2 = true;
		}
		else
			this.map2 = false;
		m2.draw(p);
		p.fill(255);
		p.text("(map2)", 335, 320);
		
		// Map3
		Rectangle m3 = new Rectangle(530, 200, 200, 200);
		m3.setFill(24, 119, 160);
		if (m3.isPointInside(mouseX, mouseY)) {
			m3.setFill(17, 92, 124);
			this.map3 = true;
		}
		else
			this.map3 = false;
		m3.draw(p);
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