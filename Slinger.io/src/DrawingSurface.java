import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import lyndon.shapes.*;
import processing.core.PApplet;
import processing.event.MouseEvent;
/**	The most superior DrawingSurface for all the menus and maps.
 * @author Lyndon Lee A
 */

public class DrawingSurface extends PApplet{

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;
	public Point mouse, mouse2;
	private MenuScreen menu;
	private MapMenu mapMenu;
	private SlingMenu slingMenu;
	private Map[] maps;
	private Sling[] slings;
	private Rectangle screenWindow;
	private InstructionScreen instructions;
	private AboutScreen about;
	private int screen; // 0 for Menu, 1 for Instructions, 2 for Maps, 3 for Slings, 4 for about, 10 for map1, 20 for map2, 30 for map3.
	private ArrayList<Integer> keys;
	private boolean goHome;
	
	/**	Constructor for the DrawingSurface
	 */
	public DrawingSurface() {
		super();
		keys = new ArrayList<Integer>();
		screen = 0;
		slings = new Sling[2];
		maps = new Map[3];
		menu = new MenuScreen();
		instructions = new InstructionScreen();
		about = new AboutScreen();
		mapMenu = new MapMenu();
		slingMenu = new SlingMenu();
		mouse = new Point(-10,-10);
		mouse2 = new Point(-10,-10);
	}
	
	private void setMaps() {
		maps[0] = new City(this,slings[0],slings[1]);
		maps[1] = new Park(slings[0],slings[1]);
		maps[2] = new Desert(slings[0],slings[1]);
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
		screenWindow = new Rectangle(0,0,width,height);
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
			instructions.draw(this);
		else if (screen == 2) 
			mapMenu.draw(this,mx,my);
		else if(screen == 4)
			about.draw(this, mx, my);
		
		else if (screen == 3)
			slingMenu.draw(this,mx,my, slings);
		else if (screen == 10 || screen == 20 || screen == 30) {
			int map = screen/10-1;
			maps[map].draw(this);
			if (maps[map].getTurn() == 1 || maps[map].getTurn() == 2) {
				int turn = maps[map].getTurn()-1;
				if (maps[map].move(turn+1) == 1) {
					if (!maps[map].shooting(turn+1)) {
						if (map == 0) stroke(255);
						slings[turn].getProjectile().setXVelocity((int)(mouse.x/ratioX-slings[turn].xPos())/10);
						slings[turn].getProjectile().setYVelocity((int)(mouse.y/ratioY-535));
						int xVel = slings[turn].getProjectile().getXVelocity();
						int yVel = slings[turn].getProjectile().getYVelocity();
						if (Math.sqrt(xVel*xVel + yVel*yVel) > slings[turn].getProjectile().MAX_VELOCITY) {
							double angle = 0;
							if(xVel!=0)
								angle = Math.atan((-yVel)/(xVel*10.0));

							if (map == 0) stroke(255);
							
							if (turn == 0) {
								slings[turn].getProjectile().setXVelocity((int) ((slings[turn].getProjectile().MAX_VELOCITY*Math.cos(angle))/10));
								slings[turn].getProjectile().setYVelocity(-(int) (slings[turn].getProjectile().MAX_VELOCITY*Math.sin(angle)));
								line(slings[turn].xPos()+7, 535, slings[turn].xPos()+7+(int) ((slings[turn].getProjectile().MAX_VELOCITY*Math.cos(angle))/10)*10,535-(int) (slings[turn].getProjectile().MAX_VELOCITY*Math.sin(angle)));
							}
							else if (turn == 1) {
								slings[turn].getProjectile().setXVelocity(-(int) ((slings[turn].getProjectile().MAX_VELOCITY*Math.cos(angle))/10));
								slings[turn].getProjectile().setYVelocity((int) (slings[turn].getProjectile().MAX_VELOCITY*Math.sin(angle)));
								line(slings[turn].xPos()+7, 535, slings[turn].xPos()+7-(int) ((slings[turn].getProjectile().MAX_VELOCITY*Math.cos(angle))/10)*10,535+(int) (slings[turn].getProjectile().MAX_VELOCITY*Math.sin(angle)));
							}
						}
						else {
							line(slings[turn].xPos()+7, 535, mouse.x/ratioX,mouse.y/ratioY);
						}
						stroke(0);
					}
				}
				else if (maps[map].move(turn+1) == 1) {
					
				}
			}
			Rectangle pause = new Rectangle(390,10,20,20);
			pause.setFill(24, 119, 160);
			if (pause.isPointInside(mx, my)) {
				pause.setFill(17, 92, 124);
				this.goHome = true;
			}
			else this.goHome = false;
			pause.draw(this);
			fill(255);
			rect(396,14,2,12);
			rect(402,14,2,12);
		}
		
		
		

		fill(180, 66, 64);
		rect(mx-2, my-2, 5, 5);
		
		popMatrix();
		
		controls(this);
	}

	private void controls(PApplet p) {
		if (screen == 10 || screen == 20 || screen == 30) {
			int map = screen/10-1;
			if (maps[map].getTurn() == 1) {
				if (maps[map].move(1) == 0) {
					if (isPressed(KeyEvent.VK_D) || isPressed(KeyEvent.VK_A)) {
						maps[map].move(1, 2);
						maps[map].setDistance(1, slings[0].getProjectile().getMaxHorizontalMovement());
					}
					if (isPressed(LEFT))
						maps[map].move(1, 1);
				}
				if (isPressed(LEFT) && maps[map].move(1) == 1) {
					maps[map].move(1, 1);
					mouse = new Point(mouseX,mouseY);
				}
				else if (maps[map].canMove(1)) {
					if (isPressed(KeyEvent.VK_D)) {
						slings[0].move(2);
						slings[0].getProjectile().xMove(2);
						maps[map].walk(1);
					}
					if (isPressed(KeyEvent.VK_A)) {
						slings[0].move(-2);
						slings[0].getProjectile().xMove(-2);
						maps[map].walk(1);
					}
				}
				if (isPressed(KeyEvent.VK_SPACE)) {
					maps[map].shoot(1);
				}
				else {
					if(slings[0].getProjectile().intersect(slings[1].getShapes()))
						maps[map].hit(2);
					else if(slings[0].getProjectile().intersect(maps[map].shapes) || !slings[0].getProjectile().intersect(screenWindow))
						maps[map].notImportantHit(2);
				}
			}
			else if (maps[map].getTurn() == 2) {
				if (maps[map].move(2) == 0) {
					if (isPressed(KeyEvent.VK_D) || isPressed(KeyEvent.VK_A)) {
						maps[map].move(2, 2);
						maps[map].setDistance(2, slings[1].getProjectile().getMaxHorizontalMovement());
					}
					if (isPressed(LEFT))
						maps[map].move(2, 1);
				}
				if (isPressed(LEFT) && maps[map].move(2) == 1) {
					
					maps[map].move(2, 1);
					mouse = new Point(mouseX,mouseY);
				}
				else if (maps[map].canMove(2)) {
					if (isPressed(KeyEvent.VK_D)) {
						slings[1].move(1);
						slings[1].getProjectile().xMove(2);
						maps[map].walk(2);
					}
					if (isPressed(KeyEvent.VK_A)) {
						slings[1].move(-1);
						slings[1].getProjectile().xMove(-2);
						maps[map].walk(2);
					}
				}
				if (isPressed(KeyEvent.VK_SPACE)) {
					maps[map].shoot(2);
				}
				else {
					if(slings[1].getProjectile().intersect(slings[0].getShapes()))
						maps[map].hit(1);
					else if(slings[1].getProjectile().intersect(maps[map].shapes) || !slings[1].getProjectile().intersect(screenWindow))
						maps[map].notImportantHit(1);
				}
			}
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
				if(menu.about())
					screen = 4;
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
				if (mapMenu.map2())
					screen = 20;
				if(mapMenu.map3())
					screen = 30;
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
			}
		}
		if (screen == 4) {
			if (mouseButton == RIGHT) {
				screen = 0;
			}
		}
		if (screen == 10 || screen == 20 || screen == 30) {
			if (goHome) {
				screen = 2;
				setMaps();
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
			else if (slingMenu.proj1() && slingMenu.pro01() + num >= 0 && slingMenu.pro01() + num < 3) {
				slingMenu.changeProjectile(1, num);
			}
			else if (slingMenu.proj2() && slingMenu.pro02() + num >= 0 && slingMenu.pro02() + num < 3) {
				slingMenu.changeProjectile(2, num);
			}
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

