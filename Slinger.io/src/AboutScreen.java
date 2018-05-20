	import lyndon.shapes.Rectangle;
	import processing.core.PApplet;
	import processing.core.PFont;
public class AboutScreen {
	


	
		
	
		
		public AboutScreen() {
		
		}
		
		public void draw (PApplet p, int mouseX, int mouseY) {
			p.background(60, 61, 68);
			PFont font1 = p.createFont("font1.ttf", 25);
			PFont font2 = p.createFont("font2.ttf", 75);
			
						
			// Title
			p.textFont(font2);
			p.fill(101, 155, 123);
			p.text("About The Game", 200, 75);
			
			p.textFont(font1);
			p.fill(180, 66, 64);
			p.text("This program is a game based on the classic arcade game: Tanks.  Two slings are positioned at either", 10, 125);
			p.text("side of the map, with various obstacles placed throughout the map.  The objective is to shoot the", 10, 155);
			p.text("other sling until one sling is left victorious.  On your turn you have the option to either shoot", 10, 185);
			p.text("at the enemy or move your sling back and forth.  The bullets include very exciting objects such as", 10, 215);
			p.text("tennis balls, basketballs, and watermelons. (etc… ) Each bullet contains different attributes,", 10, 245);
			p.text("for example a sling with tennis balls as ammunition can move further than a basketball each time a", 10, 275);
			p.text("player decides to move, but an enemy hit will lose less damage to a tennis ball than a basketball", 10, 305);
			p.text("and finally a tennis ball will fly faster through the air than a basketball.  Additionally you can", 10, 335);
			p.text("customize your sling’s appearance.  There are also “power ups” that fall randomly onto the map,", 10, 365);
			p.text("and you can retrieve these “power ups” by either moving your sling toward it, or successfully", 10, 395);
			p.text("hitting it with a bullet.  The problem that this program solves is that is provides a much more", 10, 425);
			p.text("unique and interesting approach to this renowned arcade game, and thus making it much more fun to", 10, 455);
			p.text("play. The people that would enjoy playing Slinger.io are all ages because of the simplicity of the", 10, 485);
			p.text("game alongside with the modern interpretation of a classic game." , 10, 515);
			
			
			PFont font3 = p.createFont("font2.ttf", 35);
			p.textFont(font3);
			p.fill(101, 155, 123);
			p.text("Matthew Lee     Lyndon Lee     Vaibhav Seshadri     May 2018", 65, 565);
		
			
		
			
			
		}
			

}
