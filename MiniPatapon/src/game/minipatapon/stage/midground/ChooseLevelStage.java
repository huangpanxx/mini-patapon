package game.minipatapon.stage.midground;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actors.Image;

import game.minipatapon.datasource.assets.ResourceLoader;
import game.minipatapon.effectpresent.actor.HighlightItemChangeListener;
import game.minipatapon.effectpresent.actor.LevelImage;
import game.minipatapon.effectpresent.actor.PathViewGroup;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

public class ChooseLevelStage extends BaseStage implements ActorLoader{

	@SuppressWarnings("unused")
	private ContentScreen contentScreen;
	
	public ChooseLevelStage(ContentScreen screen, float width, float height, boolean stretch) {
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
		
		Texture level1 = ResourceLoader.loadTexture("Level/level1.jpg");
		Image level1Image = new LevelImage("level1", level1, 0f, height/2 - level1.getHeight()/2, null);

		
		Texture level2 = ResourceLoader.loadTexture("Level/level2.jpg");
		Image level2Image = new LevelImage("level2", level2, 100f, height/2 - level2.getHeight()/2, null);
		
		Texture level3 = ResourceLoader.loadTexture("Level/level3.jpg");
		Image level3Image = new LevelImage("level3", level3, 200f, height/2 - level3.getHeight()/2, null);
		
		Texture level4 = ResourceLoader.loadTexture("Level/level4.jpg");
		Image level4Image = new LevelImage("level1", level4, 0f, height/2 - level4.getHeight()/2, null);

		
		Texture level5 = ResourceLoader.loadTexture("Level/level5.jpg");
		Image level5Image = new LevelImage("level5", level5, 100f, height/2 - level2.getHeight()/2, null);
		
		Texture level6 = ResourceLoader.loadTexture("Level/level6.jpg");
		Image level6Image = new LevelImage("level3", level6, 200f, height/2 - level6.getHeight()/2, null);
		
		Texture level7 = ResourceLoader.loadTexture("Level/level7.jpg");
		Image level7Image = new LevelImage("level7", level7, 0f, height/2 - level7.getHeight()/2, null);

		
		Texture level8 = ResourceLoader.loadTexture("Level/level8.jpg");
		Image level8Image = new LevelImage("level8", level8, 100f, height/2 - level8.getHeight()/2, null);
		
		Texture level9 = ResourceLoader.loadTexture("Level/level9.jpg");
		Image level9Image = new LevelImage("level3", level9, 200f, height/2 - level9.getHeight()/2, null);
		
		
		
		PathViewGroup group = new PathViewGroup(this);
		group.addActor(level1Image);
		group.addActor(level2Image);
		group.addActor(level3Image);		
		group.addActor(level4Image);		
		group.addActor(level5Image);		
		group.addActor(level6Image);		
		group.addActor(level7Image);		
		group.addActor(level8Image);		
		group.addActor(level9Image);
		
		this.addActor( group );
		
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
