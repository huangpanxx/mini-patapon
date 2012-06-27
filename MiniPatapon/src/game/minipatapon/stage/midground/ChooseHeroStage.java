package game.minipatapon.stage.midground;

import game.minipatapon.datasource.assets.ResourceLoader;
import game.minipatapon.effectpresent.actor.FlatImage;
import game.minipatapon.effectpresent.actor.HighlightItemChangeListener;
import game.minipatapon.effectpresent.actor.RotateGroup;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actors.Image;

public class ChooseHeroStage extends BaseStage implements ActorLoader{
	@SuppressWarnings("unused")
	private ContentScreen contentScreen;
	
	public ChooseHeroStage(ContentScreen screen, float width, float height, boolean stretch) {
		super(width, height, stretch);
		// TODO Auto-generated constructor stub
		
		this.loadContent(screen);
		this.init();
	}

	@Override
	public void loadContent(ContentScreen screen) {
		// TODO Auto-generated method stub
		
		this.contentScreen = screen;
		
	}


	@Override
	public void init() {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		float width = this.width;
		float height = this.height;
		
		Texture level1 = ResourceLoader.loadTexture("hero/hero1/lowlight_up.png");
		Image level1Image = new FlatImage("level1", level1, 0f, height/2 - level1.getHeight()/2, null);

		
		Texture level2 = ResourceLoader.loadTexture("hero/hero2/lowlight_up.png");
		Image level2Image = new FlatImage("level2", level2, 100f, height/2 - level2.getHeight()/2, null);
		
		Texture level3 = ResourceLoader.loadTexture("hero/hero3/lowlight_up.png");
		Image level3Image = new FlatImage("level3", level3, 200f, height/2 - level3.getHeight()/2, null);
		

		
		
		RotateGroup group = new RotateGroup(this, level1Image, level2Image, level3Image);

		
		this.addActor( group );
		this.root.keyboardFocus(group);
		
		group.setCurrentItemChangeListener( new HighlightItemChangeListener(){

			@Override
			public void onItemChange(Actor actor) {
				// TODO Auto-generated method stub
				DefaultLogger.getDefaultLogger().logWithSignature(this, "curent level name:%s", actor.name );
			}
			
		});
		
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
