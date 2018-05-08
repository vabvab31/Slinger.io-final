import java.util.ArrayList;

import lyndon.shapes.*;
import processing.core.PApplet;

public abstract class Map {
	private Sling player1, player2;
	private ArrayList<Shape> shapes;
	public Map(Sling player1, Sling player2) {
		this.player1 = player1;
		this.player2 = player2;
		shapes = new ArrayList<Shape>();
	}
	
	public void draw(PApplet p) {
		for (Shape s : shapes) {
			s.draw(p);
		}
		
		p.fill(209, 47, 29);
		p.rect(20, 20, 50, 5);
		p.fill(72, 150, 73);
		p.rect(20, 20, 50*player1.getHealth()/100, 5);
		
		p.fill(209, 47, 29);
		p.rect(730, 20, 50, 5);
		p.fill(72, 150, 73);
		p.rect(730, 20, 50*player2.getHealth()/100, 5);
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}
	
	public Sling player1()
	{
		return player1;
	}
	
	public Sling player2()
	{
		return player2;
	}
}
