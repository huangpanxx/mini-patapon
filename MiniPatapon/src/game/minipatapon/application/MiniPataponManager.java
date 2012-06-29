package game.minipatapon.application;



import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;


import game.minipatapon.localization.Language;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.logger.Loggable;
import game.minipatapon.screen.LayeredScreen;





public class MiniPataponManager implements ApplicationListener, ScreenManageable{

	public int appWidth = 0;
	public int appHeight = 0;
	
	// The only instance
	private static MiniPataponManager instance = null;

	private LayeredScreen screen = null;

	public static MiniPataponManager getInstance() {
		
		if (instance == null)
			instance = new MiniPataponManager();
		return instance;
	}

	Loggable logger;
	public LayeredScreen getLayeredScreen()
	{
		return screen;
	}

	// Private constructor
	private MiniPataponManager() {
		// Here for local test!
		logger = DefaultLogger.getDefaultLogger();
		logger.logWithSignature(this, "语言测试:%1$s",
				Language.translate("MiniPatapon"));
		init();
	}

	@Override
	public void create() {
		logger.logWithSignature(this, "create");
		//MusicManager.setBackgroundMusic("background.ogg");
		//MusicManager.play(true);
		this.navigate(screen);
	}
	private void init(){
		screen = new LayeredScreen();
	}

	@Override
	public void dispose() {
		logger.logWithSignature(this, "dispose");
		if (screen != null)
			this.screen.dispose();
	}

	@Override
	public void pause() {
		logger.logWithSignature(this, "pause");

		if (screen != null)
			this.screen.pause();
	}

	@Override
	public void render() {

		if (screen != null) {
			Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
			float dt = Gdx.graphics.getDeltaTime();
			this.screen.render(dt);
		}
	}

	@Override
	public void resize(int width, int height) {
		logger.logWithSignature(this, "resize(%1$d,%2$d)",
				width, height);
		if (screen != null)
			this.screen.resize(width, height);
	}

	@Override
	public void resume() {
		logger.logWithSignature(this, "resume");
		if (screen != null)
			this.screen.resume();
	}

	@Override
	public void navigate(LayeredScreen screen) {
		logger.logWithSignature(this, "navigate(%1$s)", screen
				.getClass().getSimpleName());
		this.screen = screen;
		Gdx.input.setInputProcessor(screen);
		if (screen != null)
			screen.show();
	}

	

}
