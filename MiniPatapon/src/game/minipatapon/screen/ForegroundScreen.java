package game.minipatapon.screen;

import game.minipatapon.stage.background.BackgroundStage;
import game.minipatapon.stage.foreground.ForegroundStage;
import game.minipatapon.stage.midground.TestSpriterImport;

public class ForegroundScreen extends NavigateScreen {
	public ForegroundScreen() {
		this.setLayer(ScreenLayer.FOREGROUND);
		init();
	}
	
	
	public void init(){
		this.stage= new ForegroundStage(getWidth(), getHeight(), false);
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
