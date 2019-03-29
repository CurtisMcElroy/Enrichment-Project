package enrichmentProject2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;


/*************************** Summary Of Program **************************
 * This class uses methods of other methods to pull them up on screen.
 * It has elements of the Player.java class and the Sprite.java class.
 * 
 *************************************************************************/



public class SpriteMovement extends JFrame {

	public SpriteMovement() {
		
		initUI();
		
	}
	
	private void initUI() {
		
		add(new Base());
		setTitle("'Untitled'");
		setSize(800,500);
		setBackground(Color.white);
		
		
		
		
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			SpriteMovement ex = new SpriteMovement();
			ex.setVisible(true);
		});
	}
}


