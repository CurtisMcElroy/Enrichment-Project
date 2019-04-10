package enrichmentProject2;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;



public class Player extends Sprite {

	
	private int dx;
	private int dy;
	//add any sprite pertaining to the player here as a "private List<x>"
	
	public Player(int x, int y) {
		super(x, y);
		
		initPlayer();
	}
	
	private void initPlayer() {
		
		/******************************************** IMPORTANT *******************************************
		This is the sprite loader. Change the Image icon to change the image.
		Change the 'w' an 'h' integers to change the size of the sprite. - need to implement
		This loads the player model.
		**************************************************************************************************/
		
		loadImage("src/resources/New Piskel.png");
		getImageDimensions();
		
	}
	
	public void move() {
		//This is to add screen bounds for the player.
		x += dx;
		y += dy;
		
		if (x < 200) {
			x = 200;
		}
		
		if (y < 200) {
			y = 200;
		}
		
		if (x > 1460) {
			x = 1460;
		}
		
		if (y > 770) {
			y = 770;
		}
	}
	
	/*********** READ ME ***********
	 * The following lines, to line 97, 
	 * are to reset the sprite's movement, .
	 *causing it to stop moving
	 */
	
	public void keyPressed(KeyEvent e) {
	
		int key = e.getKeyCode();
	
		if (key == KeyEvent.VK_A) {
			dx = -6;
		}
	
		if (key == KeyEvent.VK_D) {
			dx = 6;
		}
	
		if (key == KeyEvent.VK_W) {
			dy = -6;
		}
	
		if (key == KeyEvent.VK_S) {
			dy = 6;
		}
	}
//change the values of dy & dx to change speed of player
	
	public void keyReleased(KeyEvent e) {
	
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_A) {
			    dx = 0;
		}
	     if (key == KeyEvent.VK_D) {
	            dx = 0;
	    }

	     if (key == KeyEvent.VK_W) {
	            dy = 0;
	    }

	     if (key == KeyEvent.VK_S) {
	            dy = 0;
	    }
	}
	
	public void HubWall(KeyEvent e) {
		if(y == 200 && x == 200) {
			dy = 0;
			dx = 0;
		}
	}
}
