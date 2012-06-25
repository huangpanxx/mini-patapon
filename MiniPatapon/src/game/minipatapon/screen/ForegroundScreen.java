package game.minipatapon.screen;

import game.minipatapon.stage.foreground.ForegroundStage;

public class ForegroundScreen extends NavigateScreen {
	public ForegroundScreen() {
		this.setLayer(ScreenLayer.FOREGROUND);
	}

	@Override
	public void show() {
		super.show();
		this.navigate(new ForegroundStage(getWidth(), getHeight(), false));
	}

}
