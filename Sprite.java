package enrichmentProject2;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sprite {
	/********** READ ***********
	 * The code that can be
	 * shared by all classes is
	 * placed here in the 
	 * sprite class.
	 ***************************/
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean visible;
	protected Image image;
	
	public Sprite(int x, int y) {
		
		//the constructor initiates the x and y coordinates and the visible
		
		this.x = x;
		this.y = y;
		visible = true;
	}
	
	protected void getImageDimensions() {
		
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	
	protected void loadImage(String imageName) {
		
		ImageIcon ii = new ImageIcon("file:///C:/Users/mcelrc1/eclipse-workspace/enrichmentProject2/src/resources/New%20Piskel.png");
		image = ii.getImage();
		
		getImageDimensions();
	}
	
	
	
	public Image getImage() {
		return image;
		
	}
	
	public int getX() {
		return x;
		
	}

	public int getY() {
		return y;
		
	}
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	/* this is used to get the bounds of a rectangle.
	 * useful for collision detection.
	 */
}


