import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class DrawingSurface extends PApplet{

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;
	public Point mouse;
	private MenuScreen menu; 
	private MapMenu mapMenu;
	private SlingMenu slingMenu;
	private Map[] maps;
	private Sling[] slings;
	private InstructionScreen instructions;
	private int screen; // 0 for Menu, 1 for Instructions, 2 for Maps, 3 for Slings, 10 for map1, 20 for map2, 30 for map3.
	private ArrayList<Integer> keys;

	public DrawingSurface() {
		super();
		keys = new ArrayList<Integer>();
		screen = 0;
		slings = new Sling[2];
		maps = new Map[3];
		menu = new MenuScreen();
		instructions = new InstructionScreen();
		mapMenu = new MapMenu();
		slingMenu = new SlingMenu();
		mouse = new Point(-10,-10);
	}
	
	private void setMaps() {
		maps[0] = new Map1(slings[0],slings[1]);
	}
	
	public void runMe() {
		runSketch();
	}

	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() {
		background(255);   

		pushMatrix();

		float ratioX = (float)width/DRAWING_WIDTH;
		float ratioY = (float)height/DRAWING_HEIGHT;
		int mx = (int)(mouseX/ratioX);
		int my = (int)(mouseY/ratioY);
		
		scale(ratioX, ratioY);
		if (screen == 0) {
			menu.draw(this,mx,my);
		}
		else if (screen == 1)
			instructions.draw(this, mx, my);
		else if (screen == 2) 
			mapMenu.draw(this,mx,my);
		else if (screen == 3)
			slingMenu.draw(this,mx,my, slings);
		else if (screen == 10) {
			maps[0].draw(this);
			line(slings[0].xPos()+7, 535, mouse.x/ratioX,mouse.y/ratioY);
			if (!maps[0].shooting(1)) {
				slings[0].getProjectile().setRange((int)(mouse.x/ratioX-20)/10);
				slings[0].getProjectile().setVelocity((int)(mouse.y/ratioY-535));
			}
		}
			

		fill(180, 66, 64);
		rect(mx-2, my-2, 5, 5);
		
		popMatrix();
		
		controls(this);
	}

	private void controls(PApplet p) {
		if (screen == 10) {
			if (isPressed(LEFT)) {
				mouse = new Point(mouseX,mouseY);
			}
			if (isPressed(KeyEvent.VK_D)) {
				slings[0].move(2);
			}
			if (isPressed(KeyEvent.VK_A)) {
				slings[0].move(-2);
			}
			if (isPressed(KeyEvent.VK_SPACE)) {
				maps[0].shoot(1);
			}
			else
				if(slings[0].getProjectile().xPos > 800 || slings[0].getProjectile().yPos > 600)
					maps[0].hit(1);
		}
	}
	
	public void keyPressed() {
		keys.add(keyCode);
	}
	public void mouseClicked() {
		if (screen == 0) {
			if (mouseButton == LEFT) {
				if (menu.inst())
					screen = 1;
				if (menu.start())
					screen = 3;
			}
		}
		if (screen == 1) {
			if (mouseButton == RIGHT) {
				screen = 0;
			}
		}
		if (screen == 2) {
			if (mouseButton == LEFT) {
				if (mapMenu.map1())
					screen = 10;
			}
			if (mouseButton == RIGHT) {
				screen = 3;
			}
		}
		if (screen == 3) {
			if (mouseButton == LEFT) {
				if (slingMenu.done()) {
					setMaps();
					screen = 2;
				}
				if (slingMenu.proj1())
					slingMenu.press(0);
				if (slingMenu.proj2())
					slingMenu.press(1);
			}
			if (mouseButton == RIGHT) {
				screen = 0;
			}
		}
	}
	public void mousePressed() {
		keys.add(mouseButton);
	}
	
	public void mouseWheel(MouseEvent event) {
		int num = event.getCount();
		if (screen == 3) {
			if (slingMenu.red1() && slingMenu.getRed1()+num >= 0 && slingMenu.getRed1()+num <= 255)
				slingMenu.red1(num);
			else if (slingMenu.green1() && slingMenu.getGreen1()+num >= 0 && slingMenu.getGreen1()+num <= 255)
				slingMenu.green1(num);
			else if (slingMenu.blue1() && slingMenu.getBlue1()+num >= 0 && slingMenu.getBlue1()+num <= 255)
				slingMenu.blue1(num);
			else if (slingMenu.red2() && slingMenu.getRed2()+num >= 0 && slingMenu.getRed2()+num <= 255)
				slingMenu.red2(num);
			else if (slingMenu.green2() && slingMenu.getGreen2()+num >= 0 && slingMenu.getGreen2()+num <= 255)
				slingMenu.green2(num);
			else if (slingMenu.blue2() && slingMenu.getBlue2()+num >= 0 && slingMenu.getBlue2()+num <= 255)
				slingMenu.blue2(num);
		}
	}
	
	public void mouseReleased() {
		while(keys.contains(mouseButton))
			keys.remove(new Integer(mouseButton));
	}

	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	
	
	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}


}

