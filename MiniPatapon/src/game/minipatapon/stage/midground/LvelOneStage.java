package game.minipatapon.stage.midground;


import game.minipatapon.datasource.assets.TextureAssets;
import game.minipatapon.effectpresent.actor.Image;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

public class LvelOneStage extends BaseStage implements ActorLoader{

	
	private ContentScreen contentScreen;
	
	private Image backImage = new Image("backgroud",
			TextureAssets.GetTex(TextureAssets.BackgroundImg));
	
	public LvelOneStage(ContentScreen screen, float width, float height, boolean stretch) {
		super(width, height, stretch);
		// TODO Auto-generated constructor stub
		
		loadContent(screen);
		init();
	}

	@Override
	public void loadContent(ContentScreen screen) {
		// TODO Auto-generated method stub
		this.contentScreen = screen;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
		DefaultLogger.getDefaultLogger().logWithSignature(this, "enter ChooseLevelStage.load()");
		
		backImage.width = width;
		backImage.height = height;
		this.addActor(backImage);
		
		
		
		
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
