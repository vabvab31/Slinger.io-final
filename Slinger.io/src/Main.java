import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




import javax.swing.JFrame;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

/** The main class that runs the program.
 * @author Lyndon Lee A
 */
public class Main {
	public static void main(String[] args) 
	{
		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[]{""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();
		
		window.setLocation(0, 0);
		window.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setCursor(window.getToolkit().createCustomCursor(
                 new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),
                 new Point(),
                 null ) );

		window.setVisible(true);
	
	
	}
	
	
  
}