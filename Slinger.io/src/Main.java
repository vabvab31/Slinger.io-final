import javax.swing.*;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;

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
		window.setResizable(false);
		window.setCursor(window.getToolkit().createCustomCursor(
                 new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ),
                 new Point(),
                 null ) );

		window.setVisible(true);
	}
  
}