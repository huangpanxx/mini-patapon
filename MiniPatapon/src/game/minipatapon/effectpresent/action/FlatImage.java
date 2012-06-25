package game.minipatapon.effectpresent.action;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.OnActionCompleted;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actors.Image;
import game.minipatapon.event.EventBase;
import game.minipatapon.event.EventListener;
//import game.minipatapon.event.RequstChangeBackgroundEventArg;
import game.minipatapon.logger.DefaultLogger;

public class FlatImage extends Image implements
	OnActionCompleted{
	
	HashMap<Action,Action> actionMap = new HashMap<Action,Action>();

	/**
	 * 
	 * @param texture
	 * @param x
	 * @param y
	 * @param stage
	 */
	public FlatImage(Texture texture, float x, float y, Stage stage) {
		super("default", texture);
		this.setPosition(x, y);
		stage.addActor(this);
		
		
	}

	/**
	 * 
	 * @param region
	 * @param x
	 * @param y
	 * @param stage
	 */
	public FlatImage(TextureRegion region, float x, float y, Stage stage) {
		super("default", region);
		this.setPosition(x, y);
		stage.addActor(this);


	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	private void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getScaledWidth()
	{
		return this.width * this.scaleX;
	}
	
	public float getScaledHeight()
	{
		return this.height * this.scaleY;
	}

	public void act (float delta) {
		actions.iter();
		Action action;

		while ((action = actions.next()) != null) {
			action.act(delta);
			if (action.isDone()) {
				action.finish();
				actions.remove();
			}
		}
		
		//DefaultLogger.getDefaultLogger().log("act");
	}

	@Override
	public void completed(Action action) {
		// TODO Auto-generated method stub
		
		if( actionMap.containsKey(action) )
		{
			this.action( actionMap.get( action ) );
		}
		
	}

	public void setActionOncompleted(Action firstAction, Action secondAction)
	{
		actionMap.put( firstAction, secondAction);
	}
	
}
