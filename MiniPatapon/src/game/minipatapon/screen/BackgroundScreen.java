package game.minipatapon.screen;

import game.minipatapon.stage.background.BackgroundStage;
public class BackgroundScreen extends NavigateScreen {
	public BackgroundScreen() {
		this.setLayer(ScreenLayer.BACKGROUDN);
		init();
	}

	
	public void init(){
		this.stage= new BackgroundStage(this, getWidth(), getHeight(), false);
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
