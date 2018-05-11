
import java.awt.Color;

import lyndon.shapes.*;
import processing.core.PApplet;
import processing.core.PFont;
/** The screen for selecting the maps.
 * @author Lyndon Lee A
 */
public class SlingMenu {
	private boolean canMoveOn, red1, red2, green1, green2, blue1, blue2, proj1, proj2;
	private int red01, red02, green01, green02, blue01, blue02, pro01, pro02;
	private Projectile pro1, pro2;
	public SlingMenu() {
		canMoveOn = false;
		red1 = false;
		red2 = false;
		green1 = false;
		green2 = false;
		blue1 = false;
		blue2 = false;
		proj1 = false;
		proj2 = false;
		red01 = (int)(Math.random() * 255);
		red02 = (int)(Math.random() * 255);
		green01 = (int)(Math.random() * 255);
		green02 = (int)(Math.random() * 255);
		blue01 = (int)(Math.random() * 255);
		blue02 = (int)(Math.random() * 255);
		pro01 = (int)(Math.random() * 3);
		pro02 = (int)(Math.random() * 3);
	}
	
	public void draw (PApplet p, int mouseX, int mouseY, Sling[] slings) {
		p.background(60, 61, 68);
		p.textAlign(p.LEFT);
		
		PFont font1 = p.createFont("font1.ttf", 120);

		// Next
		Rectangle done = new Rectangle(320, 480, 160, 100);
		done.setFill(24, 119, 160);
		
		if (done.isPointInside(mouseX, mouseY)) {
			done.setFill(17, 92, 124);
			this.canMoveOn = true;
		}
		else
			this.canMoveOn = false;
		done.draw(p);
		p.fill(255);
		p.textSize(70);
		p.text("next", 355, 555);
		
		// Title
		p.textFont(font1);
		p.fill(101, 155, 123);
		p.text("choose your slings", 70, 150);
		
		// Divider
		p.stroke(100);
		p.strokeWeight(2);
		p.line(400, 200, 400, 440);
		p.textSize(30);
		p.textAlign(p.CENTER, p.CENTER);
		
		// Sling 1
		Rectangle red1 = new Rectangle(120, 200, 50, 30);
		red1.setFill(234, 51, 51);
		if (red1.isPointInside(mouseX, mouseY)) {
			red1.setFill(209, 48, 48);
			this.red1 = true;
		}
		else
			this.red1 = false;
		red1.draw(p);
		p.fill(255);
		p.text(red01, 145, 212);
		
		Rectangle green1 = new Rectangle(180, 200, 50, 30);
		green1.setFill(48, 165, 57);
		if (green1.isPointInside(mouseX, mouseY)) {
			green1.setFill(39, 137, 47);
			this.green1 = true;
		}
		else
			this.green1 = false;
		green1.draw(p);
		p.fill(255);
		p.text(green01, 205, 212);
		
		Rectangle blue1 = new Rectangle(240, 200, 50, 30);
		blue1.setFill(56, 158, 226);
		if (blue1.isPointInside(mouseX, mouseY)) {
			blue1.setFill(48, 135, 193);
			this.blue1 = true;
		}
		else
			this.blue1 = false;
		blue1.draw(p);
		p.fill(255);
		p.text(blue01, 265, 212);
		
		p.fill(red01, green01, blue01);
		p.rect(320, 200, 30, 30);
		
		// Sling 2
		Rectangle red2 = new Rectangle(510, 200, 50, 30);
		red2.setFill(234, 51, 51);
		if (red2.isPointInside(mouseX, mouseY)) {
			red2.setFill(209, 48, 48);
			this.red2 = true;
		}
		else
			this.red2 = false;
		red2.draw(p);
		p.fill(255);
		p.text(red02, 535, 212);
		
		Rectangle green2 = new Rectangle(570, 200, 50, 30);
		green2.setFill(48, 165, 57);
		if (green2.isPointInside(mouseX, mouseY)) {
			green2.setFill(39, 137, 47);
			this.green2 = true;
		}
		else
			this.green2 = false;
		green2.draw(p);
		p.fill(255);
		p.text(green02, 595, 212);
		
		Rectangle blue2 = new Rectangle(630, 200, 50, 30);
		blue2.setFill(56, 158, 226);
		if (blue2.isPointInside(mouseX, mouseY)) {
			blue2.setFill(48, 135, 193);
			this.blue2 = true;
		}
		else
			this.blue2 = false;
		blue2.draw(p);
		p.fill(255);
		p.text(blue02, 655, 212);
		
		p.fill(red02, green02, blue02);
		p.rect(450, 200, 30, 30);
		
		
		// Projectiles
		p.textSize(20);
		Circle proj1 = new Circle(205, 312, 100);
		Color normal = new Color(160, 185, 40);
		Color on = new Color(135, 155, 34);
		if (pro01 == 0) {
			pro1 = new TennisBall();
		}
		else if (pro01 == 1) {
			pro1 = new Watermelon();
			normal = new Color(0, 100, 0);
			on = new Color(0,63,0);
		}
		else if (pro01 == 2) {
			pro1 = new BasketBall();
			normal = new Color(255, 140, 0);
			on = new Color(224, 123, 0);
		}
		
		proj1.setFill(normal.getRed(), normal.getGreen(), normal.getBlue());
		if (proj1.isPointInside(mouseX, mouseY)) {
			proj1.setFill(on.getRed(), on.getGreen(), on.getBlue());
			this.proj1 = true;
		}
		else
			this.proj1 = false;

		proj1.draw(p);
		p.fill(255);
		if (pro01 == 0) {
			p.text("Tennis Ball", 205, 312);
		}
		else if (pro01 == 1) {
			p.text("Watermelon", 205, 312);
		}
		else if (pro01 == 2) {
			p.text("Basketball", 205, 312);
		}
		
		Circle proj2 = new Circle(595, 312, 100);
		Color normal2 = new Color(160, 185, 40);
		Color on2 = new Color(135, 155, 34);
		if (pro02 == 0) {
			pro2 = new TennisBall();
		}
		else if (pro02 == 1) {
			pro2 = new Watermelon();
			normal2 = new Color(0, 100, 0);
			on2 = new Color(0,63,0);
		}
		else if (pro02 == 2) {
			pro2 = new BasketBall();
			normal2 = new Color(255, 140, 0);
			on2 = new Color(224, 123, 0);
		}
		
		proj2.setFill(normal2.getRed(), normal2.getGreen(), normal2.getBlue());
		if (proj2.isPointInside(mouseX, mouseY)) {
			proj2.setFill(on2.getRed(), on2.getGreen(), on2.getBlue());
			this.proj2 = true;
		}
		else
			this.proj2 = false;

		proj2.draw(p);
		p.fill(255);
		if (pro02 == 0) {
			p.text("Tennis Ball", 595, 312);
		}
		else if (pro02 == 1) {
			p.text("Watermelon", 595, 312);
		}
		else if (pro02 == 2) {
			p.text("Basketball", 595, 312);
		}
		
		if (canMoveOn) {
			slings[0] = new Sling(pro1, new Color(red01,green01,blue01), 20);
			slings[1] = new Sling(pro2, new Color(red02,green02,blue02), 750);
		}
		
		
	}
	
	
	public boolean done() {
		return canMoveOn;
	}
	
	public boolean red1() {
		return red1;
	}
	
	public void red1(int change) {
		red01 += change;
	}
	public int getRed1() {
		return red01;
	}
	
	public boolean green1() {
		return green1;
	}
	
	public void green1(int change) {
		green01 += change;
	}
	public int getGreen1() {
		return green01;
	}
	
	public boolean blue1() {
		return blue1;
	}
	
	public void blue1(int change) {
		blue01 += change;
	}
	public int getBlue1() {
		return blue01;
	}
	
	public boolean red2() {
		return red2;
	}
	
	public void red2(int change) {
		red02 += change;
	}
	public int getRed2() {
		return red02;
	}
	
	public boolean green2() {
		return green2;
	}
	
	public void green2(int change) {
		green02 += change;
	}
	public int getGreen2() {
		return green02;
	}
	
	public boolean blue2() {
		return blue2;
	}
	
	public void blue2(int change) {
		blue02 += change;
	}
	public int getBlue2() {
		return blue02;
	}
	
	public boolean proj1() {
		return proj1;
	}
	
	public boolean proj2() {
		return proj2;
	}
	
	public int pro01() {
		return pro01;
	}
	
	public int pro02() {
		return pro02;
	}
	
	public void changeProjectile(int i, int num) {
		if (i == 1) {
			pro01 += num;
		}
		else if (i == 2) {
			pro02 += num;
		}
	}
}
