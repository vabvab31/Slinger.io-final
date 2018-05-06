

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet{

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;
	private MenuScreen menu; 
	private InstructionScreen instructions;
	private int screen; // 0 for Menu, 1 for Instructions, 2 for ClassicMap
	private ArrayList<Integer> keys;

	public DrawingSurface() {
		super();
		keys = new ArrayList<Integer>();
		screen = 0;
	}
	
	public void menu() {
		menu = new MenuScreen();
	}
	
	public void instructions() {
		instructions = new InstructionScreen();
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
		
		menu();
		instructions();
		
		scale(ratioX, ratioY);
		if (screen == 0)
			menu.draw(this,mx,my);
		else if (screen == 1)
			instructions.draw(this);

		fill(180, 66, 64);
		rect(mx-2, my-2, 5, 5);
		
		popMatrix();
		
		controls();
	}

	private void controls() {
		if (screen == 0) {
			if (isPressed(LEFT) && menu.inst()) {
				screen = 1;
			}
		}
		if (screen == 1) {
			if (isPressed(RIGHT)) {
				screen = 0;
			}
		}
	}
	
	public void keyPressed() {
		keys.add(keyCode);
	}
	
	public void mousePressed() {
		keys.add(mouseButton);
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

