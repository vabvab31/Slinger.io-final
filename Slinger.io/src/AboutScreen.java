	import lyndon.shapes.Rectangle;
	import processing.core.PApplet;
	import processing.core.PFont;
public class AboutScreen {
	


	
		
	
		
		public AboutScreen() {
		
		}
		
		public void draw (PApplet p, int mouseX, int mouseY) {
			p.background(60, 61, 68);
			PFont font1 = p.createFont("font1.ttf", 70);
			PFont font2 = p.createFont("font2.ttf", 150);
			
						
			// Title
			p.textFont(font2);
			p.fill(101, 155, 123);
			p.text("slinger", 160, 200);
			p.fill(180, 66, 64);
			p.text(".io", 530, 200);
		}
			

}
