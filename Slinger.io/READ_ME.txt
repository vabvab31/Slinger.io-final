README


Program Title: Slinger.io 


Authors: Matthew Lee, Lyndon Lee A, Vaibhav Seshadri


Date Created: 04 / 30 / 2018


Description:  
This program is a game based on the classic arcade game: Tanks.  Two slings are positioned at either side of the map, with various obstacles placed throughout the map.  The objective is to shoot the other sling until one sling is left victorious.  On your turn you have the option to either shoot at the enemy or move your sling back and forth.  The bullets include very exciting objects such as tennis balls, basketballs, and watermelons. (etc… ) Each bullet contains different attributes, for example a sling with tennis balls as ammunition can move further than a basketball each time a player decides to move, but an enemy hit will lose less damage to a tennis ball than a basketball and finally a tennis ball will fly faster through the air than a basketball.  Additionally you can customize your sling’s appearance.  There are also “power ups” that fall randomly onto the map, and you can retrieve these “power ups” by either moving your sling toward it, or successfully hitting it with a bullet.  The problem that this program solves is that is provides a much more unique and interesting approach to this renowned arcade game, and thus making it much more fun to play. The people that would enjoy playing Slinger.io are all ages because of the simplicity of the game alongside with the modern interpretation of a classic game.




Instructions: 


If player chooses to move:


LEFT ARROW → sling moves left x # of spaces (Depending on type of projectile)
RIGHT ARROW→ sling moves right x # of spaces (Depending on type of projectile)


If player chooses to shoot: 


MOUSE → user moves mouse to set angle (mouse drag)  and power (mouse wheel), once the user has confirmed the angle and power, he or she must click the mouse to finalize their decision.


SPACE →  After setting the necessary requirements, press space to shoot the bullet.
Classes:  


* Sling  → “has a” projectile
   * Has a color
   * Has a strength
   * Has a size


* Projectile (Abstract)
   * Tennis ball 
   * Basketball
   * Watermelon


* Menu Screen
* Instruction Screen
* Sling Menu
* Map Menu
* Drawing Surface
* Main
* Map (Abstract)
   * Map 1
   * Map 2
   * Map 3


Features:


Must-Have - 
1. Slings with different types of bullets
2. Unique bullets with their own attributes and methods to “upgrade” them
3. Menu Screen
4. Instructions screen
5. One creative map
Want - 
1. Different, more complicated and original maps
2. More types of bullets
3. Currency system for incentives
4. High Score keeping system
5. More ways to upgrade your sling + bullet combo
Stretch -
1. Sound
2. Networking
3. More advanced animations
4. Interactive tutorials
5. AI - computer player for single player play








Responsibility: 


* Matthew: In charge of all the methods in the objects: regarding movement, and fields
* Vaibhav:  Paint methods of all objects, make it look creative and beautiful 
* Lyndon: DrawingSurface to draw all objects on the same screen, intelligently putting together the pieces of the program together in a intriguing fashion


Feedback was given by Shaunak Bhandarkar, Navaneet Kadaba, William Who?










According to your class list, you have two mains. There’s a main in your DrawingSurface and in the Main class. I think you should keep the main in the Main class as it will just be the main.


Maybe you want to add more original features, because this game sounds similar to games I have seen before (Raft Wars Miniclip.com)


Your UML is looking incomplete as of right now. How exactly do you plan to implement the Projectile class? It also seems like you will need other classes to extend the abstract classes that you have right now.