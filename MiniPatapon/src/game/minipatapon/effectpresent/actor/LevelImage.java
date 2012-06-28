package game.minipatapon.effectpresent.actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class LevelImage extends FlatImage{

	public LevelImage(String name, TextureRegion region, float x, float y,
			Stage stage) {
		super(name, region, x, y, stage);
		// TODO Auto-generated constructor stub
	}
	
	public LevelImage(String name, Texture texture, float x, float y, Stage stage ) 
	{
		super(name, texture, x, y, stage);
	}
	
}
