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
		Change the 'w' an 'h' integers to change the size of the sprite.
		IN THE FINAL VERSION, DO NOT PUT A PLAYER SPRITE INTO THIS VOID. YOU PUT THE WORLD INTO THIS VOID.
		**************************************************************************************************/
		
		loadImage("file:///C:/Users/mcelrc1/eclipse-workspace/enrichmentProject2/src/resources/New%20Piskel.png");
		getImageDimensions();
		
	}
	
	public void move() {
		//This is to start to move the sprite.
		x += dx;
		y += dy;
		
		if (x < 1) {
			x = 1;
		}
		
		if (y < 1) {
			y = 1;
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
			dx = -1;
		}
	
		if (key == KeyEvent.VK_D) {
			dx = 1;
		}
	
		if (key == KeyEvent.VK_W) {
			dy = -1;
		}
	
		if (key == KeyEvent.VK_S) {
			dy = 1;
		}
	}

	public void keyReleased(KeyEvent e) {
	
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_A) {
			    dx = 0;
		}
	     if (key == KeyEvent.VK_RIGHT) {
	            dx = 0;
	    }

	     if (key == KeyEvent.VK_UP) {
	            dy = 0;
	    }

	     if (key == KeyEvent.VK_DOWN) {
	            dy = 0;
	    }
	}
}


