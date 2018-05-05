

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet {

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
		menu();
		instructions();
		
		scale(ratioX, ratioY);
		if (screen == 0)
			menu.draw(this);
		else if (screen == 1)
			instructions.draw(this);

		popMatrix();
	}


	public void keyPressed() {
		keys.add(keyCode);
	}

	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}


}

