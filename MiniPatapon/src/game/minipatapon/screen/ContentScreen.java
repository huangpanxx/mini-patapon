/** 
 * @description	: the content layer of the screen
 * @author		: 黄攀
 * @created		: 2012-1-4
 */

package game.minipatapon.screen;

//import game.minipatapon.stage.midground.MainMenuStage;
//import game.minipatapon.stage.midground.StartMenuStage;
import game.minipatapon.stage.midground.ChooseLevelStage;
import game.minipatapon.stage.midground.MainMenuStage;
import game.minipatapon.stage.midground.StartAnimationStage;
import game.minipatapon.stage.midground.TestSpriterImport;

public class ContentScreen extends NavigateScreen {

	public ContentScreen() {
		this.setLayer(ScreenLayer.CONTENT);
		init();
	}
  
	public void init(){
		this.stage= new ChooseLevelStage(this, getWidth(), getHeight(), true);
	}
	
	@Override
	public void show() {
		super.show();
//		this.navigate(new StartMenuStage(this, getWidth(), getHeight(), true));
//		this.navigate(new MainMenuStage(this, getWidth(), getHeight(), true));
//		this.navigate(new ChooseLevelStage(this, getWidth(), getHeight(), true));
//		this.navigate(new StartAnimationStage(this, getWidth(), getHeight(), true));
	//	this.navigate(new TestSpriterImport(this, getWidth(), getHeight(), true));
		this.navigate(stage);
	}
}
