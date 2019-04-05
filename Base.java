package enrichmentProject2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Base extends JPanel implements ActionListener {

	private Timer timer;
	private Player player;
	private boolean ingame;
	private final int PLAYER_X = 400;
	private final int PLAYER_Y = 250;
	private final int DELAY = 15;

	
	public Base() {
		
		initBase();
	}
	
	private void initBase() {
		
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.WHITE);
		ingame = true;
		// initiate any enemy sprites here.
		
		player = new Player(PLAYER_X, PLAYER_Y);
		
		
		
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (ingame) {
			
			drawObjects(g);
			
		} else {
			
			drawDeathScreen(g);
		}
		
		Toolkit.getDefaultToolkit().sync();
		
	}
	
	private void drawObjects(Graphics g) { //Draws the sprite 'player'
		
		if (player.isVisible()) {
		g.drawImage(player.getImage(),
				player.getX(), player.getY(), this);
		g.setColor(Color.black);
		}
		
		
		healthBar(g);
		inventoryHotBar(g);
		//add any other sprite here
	}
	
	private void inventoryHotBar(Graphics g) {
		g.setColor(Color.black);
		g.drawRoundRect(10, 10, 30, 30, 15, 15);
		g.drawString("1",30, 35);
		g.drawRoundRect(45, 10, 30, 30, 15, 15);
		g.drawString("2",65, 35);
		g.drawRoundRect(80, 10, 30, 30, 15, 15);
		g.drawString("3",100,35);
		g.drawRoundRect(115, 10, 30, 30, 15, 15);
		g.drawString("4",135, 35);
		g.drawRoundRect(150, 10, 30, 30, 15, 15);
		g.drawString("5",170, 35);
		g.drawRoundRect(185, 10, 30, 30, 15, 15);
		g.drawString("6",205, 35);
		g.drawRoundRect(220, 10, 30, 30, 15, 15);
		g.drawString("7",240, 35);
		g.drawRoundRect(255, 10, 30, 30, 15, 15);
		g.drawString("8",275, 35);
		g.drawRoundRect(290, 10, 30, 30, 15, 15);
		g.drawString("9",310, 35);
		g.drawRoundRect(325, 10, 30, 30, 15, 15);
		g.drawString("0",345, 35);
	}
	
	private void healthBar(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(630, 10, 100, 10);
			g.setColor(Color.black);
			g.drawString("HP" , 600 , 20);
			g.drawRect(630, 10, 100, 10);
		}
	
	private void drawDeathScreen(Graphics g) {
		
		String msg = "You Died";
		Font small = new Font("Helvetica", Font.BOLD, 15);
		FontMetrics fm = getFontMetrics(small);
		
		g.setColor(Color.black);
		g.setFont(small);
		g.drawString(msg,  (69 - fm.stringWidth(msg)) / 2,
				69 / 2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		updatePlayer();
		
		repaint();
		
	}
	
	private void updatePlayer() { //this moves the sprite and repaints the part of the board from where it has moved.
		
		if (player.isVisible()) {
		player.move();
		}
	}
	
	private class TAdapter extends KeyAdapter {
		
		@Override
		public void keyReleased(KeyEvent e) {
			player.keyReleased(e);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}
	}
}
