package game.minipatapon.stage.background;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.actors.Image;
import game.minipatapon.event.EventAggregator;
import game.minipatapon.event.EventListener;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.logger.Loggable;
import game.minipatapon.screen.NavigateScreen;
//import game.minipatapon.service.ResourceLoader;
import game.minipatapon.stage.base.BaseStage;

public class BackgroundStage extends BaseStage  {

	public BackgroundStage(float width, float height, boolean stretch) {
		super(width, height, stretch);
		// TODO Auto-generated constructor stub
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

	/*Loggable logger = null;
	NavigateScreen screen = null;
	Image backgroundImage = null;
	String backgroundImageName = null;

	*/public BackgroundStage(NavigateScreen _screen, float width, float height,
			boolean stretch) {
		super(width, height, stretch);
		
		
	}
/*
	private void loadBackground(String name) {
		//�?��是否重复设置
		if (this.backgroundImage != null) {
			if (this.backgroundImageName.equals(name)) {
				return;
			}
		}
		//加载
		Texture texture ;//= ResourceLoader.loadTexture(name);
		
		//若成功加载纹理则移除旧背�?
		if (backgroundImage != null) {
			this.removeActor(backgroundImage);
			backgroundImage = null;
		}
		
		//加载成功后更新最近背景名�?
		this.backgroundImageName = name;
		
		//创建新的背景
		//backgroundImage = new Image("Quit", texture);
		backgroundImage.x = 0;
		backgroundImage.y = 0;
		this.addActor(backgroundImage);
	}

	public void hide() {
		// TODO Auto-generated method stub

	}

	public void pause() {
		// TODO Auto-generated method stub

	}

	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	public void resume() {
		// TODO Auto-generated method stub
	}

	public void show() {

	}

	@Override
	public void onEventReceived(RequstChangeBackgroundEventArg arg) {
		// TODO Auto-generated method stub
		try {
			this.loadBackground(arg.path);
		} catch (Exception e) {
			logger.logWithSignature(this, "背景切换请求失败:%1$s", arg.path);
		}

	}*/

}
