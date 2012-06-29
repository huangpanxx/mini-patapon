package game.minipatapon.stage.midground;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

<<<<<<< HEAD
//import game.minipatapon.effectpresent.spriter.BaseSpriterDrawer;
=======
>>>>>>> origin/master
import game.minipatapon.effectpresent.spriter.SpriterObject;
import game.minipatapon.effectpresent.spriter.TextureProvider;
import game.minipatapon.effectpresent.spriter.util.ScaleSpriterDrawer;
import game.minipatapon.effectpresent.spriter.util.SpriterDrawer;
import game.minipatapon.effectpresent.spriter.util.SpriterImporter;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

public class TestSpriterImport extends BaseStage implements ActorLoader, TextureProvider{

	private ContentScreen contentScreen;
	private SpriterObject spriterObjectHero;
	private float timeElapsed = 0;
	
	private final Map<String, Texture> textures = new HashMap<String, Texture>();
	
	public TestSpriterImport(ContentScreen screen, float width, float height,
			boolean stretch) {
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
		
		secondCamera.position.set(240, 160, 0);
		try {
			spriterObjectHero = SpriterImporter.importFile(
			          Gdx.files.internal("data/images/hero/BetaFormatHero.SCML"), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		     spriterObjectHero.getAllTextures();
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

	OrthographicCamera secondCamera = new OrthographicCamera(480*2f, 320*2f);
	
	
	public void draw() {
		
		this.timeElapsed += Gdx.graphics.getDeltaTime();
		
		camera.update();
		secondCamera.update();
		
		
//		ScaleSpriterDrawer.draw(0.2f, 0.2f, camera, batch, spriterObjectHero, "walk", timeElapsed * 100, 0, 0, true,
//		        true);
//		
//		ScaleSpriterDrawer.draw(0.3f, 0.3f, camera, batch, spriterObjectHero, "walk", timeElapsed * 100, 0, 0, true,
//		        true);
//		
//		ScaleSpriterDrawer.draw(0.5f, 0.5f, camera, batch, spriterObjectHero, "walk", timeElapsed * 100, 0, 0, true,
//		        true);
		
		ScaleSpriterDrawer.draw(0.2f, 0.2f, this, batch, spriterObjectHero, "walk", timeElapsed * 100,
		        150 + (timeElapsed * 120 % 250), 50, true, true);
		
		ScaleSpriterDrawer.draw(0.3f, 0.3f, this, batch, spriterObjectHero, "walk", timeElapsed * 100,
		        150 + (timeElapsed * 120 % 250), 50, true, true);
		
		ScaleSpriterDrawer.draw(0.5f, 0.5f, this, batch, spriterObjectHero, "walk", timeElapsed * 100,
		        150 + (timeElapsed * 120 % 250), 50, true, true);
		
		
		

//		batch.setProjectionMatrix( secondCamera.combined);
//		
//	
//		batch.begin();
//	
//	    SpriterDrawer.draw(batch, spriterObjectHero, "walk", timeElapsed * 100, 300, 200, true,
//	        true);
//	    SpriterDrawer.draw(batch, spriterObjectHero, "walk", timeElapsed * 100,
//	        150 + (timeElapsed * 120 % 250), 50, true, true);
//
//		batch.end();
//		
//		batch.setProjectionMatrix( camera.combined);
		
		batch.begin();
//		SpriterDrawer.draw(batch, spriterObjectHero, "idle_healthy", timeElapsed * 100, 0, 0,
//		        true, true);
//		SpriterDrawer.draw(batch, spriterObjectHero, "walk", timeElapsed * 100,
//		        150 + (timeElapsed * 120 % 250), 50, true, true);
		root.draw(batch, 1);
		
		batch.end();
	}

	@Override
	  public Texture getTexture(String filename) {
	    if (!textures.containsKey(filename)) {
	      textures.put(filename, new Texture(Gdx.files.internal(filename)));
	      System.out.println("Texture " + filename + " loaded");
	    }
	    return textures.get(filename);

	  }

	  @Override
	  public void disposeTexture(String filename) {
	    textures.get(filename).dispose();
	    textures.remove(filename);
	    System.out.println("Texture " + filename + " disposed");
	  }

}
