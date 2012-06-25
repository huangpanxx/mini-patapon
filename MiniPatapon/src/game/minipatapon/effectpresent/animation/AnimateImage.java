package game.minipatapon.effectpresent.animation;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Stage;


import game.minipatapon.effectpresent.action.FlatImage;

public class AnimateImage extends FlatImage{

	private ArrayList<TextureRegion> regions;
	Animation animation;
	float stateTime;
	float platTime;
	
	public AnimateImage(ArrayList<TextureRegion> regions, float x, float y, Stage stage, float playTime)
	{
		super(regions.get(0), x, y, stage);
		
		animation = new Animation(playTime/regions.size(), regions);
	} 
	
	@Override
    public void draw(SpriteBatch batch, float parentAlpha) {
        stateTime += Gdx.graphics.getDeltaTime();
        TextureRegion currentFrame = animation.getKeyFrame(stateTime, true);
        
        float ox = 0;
        float oy = 0;
        if( this.scaleX!=0 )
        {
        	ox = this.width*this.scaleX;
        }
        if( this.scaleY!=0 )
        {
        	oy = this.width*this.scaleY;
        }
        batch.draw(currentFrame, this.x, this.y, ox/2, oy/2, currentFrame.getRegionWidth(), currentFrame.getRegionHeight(), this.scaleX, this.scaleY, this.rotation);    
    }
	

}
