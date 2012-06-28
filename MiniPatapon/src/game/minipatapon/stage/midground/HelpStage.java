package game.minipatapon.stage.midground;

import game.minipatapon.datasource.assets.ResourceLoader;
import game.minipatapon.effectpresent.actor.FlatImage;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.actors.Image;


/**
 * @description : HelpStage继承自BaseStage
 * @author ZhangY
 * 
 */
public class HelpStage extends BaseStage implements ActorLoader
{
	@SuppressWarnings("unused")
	private Image quitImage;
	private Image aboutUsImage;

	@SuppressWarnings("unused")
	private ContentScreen contentScreen;

	public HelpStage(ContentScreen screen, float width, float height, boolean stretch)
	{
		super(width, height, stretch);
		this.loadContent(screen);
		this.init();
	}

	@Override
	public void loadContent(ContentScreen screen)
	{
		this.contentScreen = screen;
	}

	@Override
	public void init()
	{
		this.loadAboutUsImage();
		this.loadQuitImage();
	}

	@Override
	public void hide()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void pause()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void resume()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void show()
	{
		// TODO Auto-generated method stub

	}

	private void loadAboutUsImage()
	{
		Texture aboutUsTexture = ResourceLoader.loadTexture("about us.png");
		this.aboutUsImage = new FlatImage(aboutUsTexture, 0f, 0f, this);
		this.aboutUsImage.width = this.width;
		this.aboutUsImage.height = this.height;
	}

	private void loadQuitImage()
	{
//		Texture quitTexture = ResourceLoader.loadTexture("quitbutton.png");
//		this.quitImage = new NavigatorImage(contentScreen, this, EnumDestStage.MAINMENUSTAGE, quitTexture, 390f, 10f);
	}
}
