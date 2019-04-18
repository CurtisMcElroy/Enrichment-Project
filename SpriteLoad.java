package enrichmentProject2;



public class SpriteLoad extends Sprite {

	
	public SpriteLoad(int x, int y) {
		super(x,y);
		
		 initSpriteLoad();
		
	}
	
	private void initSpriteLoad() {
		
		hubRoom();
		
		//make a class to sort out the sprites, then call on the classes here to load them.
		
	}

	private void hubRoom() {
		//loads everything for the main hub.
		
		loadImage("src/resources/EPBottomRightCorner.png");
		loadImage("src/resources/EPBottomWallBorder.png");
		loadImage("src/resources/EPBottomRightCorner.png");
		loadImage("src/resources/EPLeftWallBorder.png");
		loadImage("src/resources/EPTopRightCorner.png");
		loadImage("src/resources/EPTopWallBorder.png");
		loadImage("src/resources/EPTopRightCorner.png");
		loadImage("src/resources/EPLeftWallBorder.png");
		loadImage("src/resources/EPWall.png");
		loadImage("src/resources/EPFill.png");
		loadImage("src/resources/EpFloor.png");
		getImageDimensions();
	}

}
