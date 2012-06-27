/** 
 * @description	: the content layer of the screen
 * @author		: 黄攀
 * @created		: 2012-1-4
 */

package game.minipatapon.screen;

//import game.minipatapon.stage.midground.MainMenuStage;
//import game.minipatapon.stage.midground.StartMenuStage;
import game.minipatapon.stage.midground.StartAnimationStage;

public class ContentScreen extends NavigateScreen {

	public ContentScreen() {
		this.setLayer(ScreenLayer.CONTENT);
	}

	@Override
	public void show() {
		super.show();
//		this.navigate(new StartMenuStage(this, getWidth(), getHeight(), true));
//		this.navigate(new MainMenuStage(this, getWidth(), getHeight(), true));
		this.navigate(new StartAnimationStage(this, getWidth(), getHeight(), true));
	}
}
