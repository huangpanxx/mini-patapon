package game.minipatapon.stage.midground;

import game.minipatapon.datasource.assets.ResourceLoader;
import game.minipatapon.datasource.assets.TextureAssets;
import game.minipatapon.effectpresent.actor.Image;
import game.minipatapon.effectpresent.actor.LevelImage;
import game.minipatapon.effectpresent.actor.PathViewGroup;
import game.minipatapon.effectpresent.actor.PathViewGroup2;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.MoveTo;

public class ChooseLevelStage extends BaseStage implements ActorLoader {

	private ContentScreen contentScreen;
//	private Image oneImage ;
//	private Image twoImage;
//	private Image threeImage;
//	private Image fourImage;
//	private Image fiveImage;
//	private Image sixImage;
//	private Image sevenImage;
//	private Image eightImage;
//	private Image nineImage;
//
	private Image backImage = new Image("backgroud",
			TextureAssets.GetTex(TextureAssets.BackgroundImg));

	public ChooseLevelStage(ContentScreen screen, float width, float height,
			boolean stretch) {
		super(width, height, stretch);
		// TODO Auto-generated constructor stub

		DefaultLogger.getDefaultLogger().logWithSignature(this, "enter ChooseLevelStage");
		
		this.loadContent(screen);
		this.load();
	}

	@Override
	public void loadContent(ContentScreen screen) {
		// TODO Auto-generated method stub

		this.contentScreen = screen;
	}

	private void setUnVisible() {
//		this.oneImage.visible = false;
//		this.twoImage.visible = false;
//		this.threeImage.visible = false;
//		this.fourImage.visible = false;
//		this.fiveImage.visible = false;
//		this.sixImage.visible = false;
//		this.sevenImage.visible = false;
//		this.eightImage.visible = false;
//		this.nineImage.visible = false;
	}

	public void load() {
		// TODO Auto-generated method stub
		
		DefaultLogger.getDefaultLogger().logWithSignature(this, "enter ChooseLevelStage.load()");
		
		//Texture tex = new Texture(Gdx.files.internal("data/images/GameGround1_1024_512.png"));
		
		DefaultLogger.getDefaultLogger().logWithSignature(this, "texture loded)");
		
		
		
		backImage.width = width;
		backImage.height = height;
		this.addActor(backImage);
//
//		// // the expression of the level title
//		// Texture level = ResourceLoader.loadTexture("Level/level.png");
//		// final Image levelImage = new LevelImage("level", level, 100f,
//		// height / 6, this);
//		// levelImage.action(MoveTo.$(80f, height * 5 / 6, 0f));
//
//		Texture one = ResourceLoader.loadTexture("Level/one.png");
//		oneImage = new LevelImage("one", one, 250f, height * 5 / 6, this);
//
//		Texture two = ResourceLoader.loadTexture("Level/two.png");
//		twoImage = new LevelImage("two", two, 250f, height * 5 / 6, this);
//
//		Texture three = ResourceLoader.loadTexture("Level/three.png");
//		threeImage = new LevelImage("three", three, 250f, height * 5 / 6, this);
//
//		Texture four = ResourceLoader.loadTexture("Level/four.png");
//		fourImage = new LevelImage("four", four, 250f, height * 5 / 6, this);
//
//		Texture five = ResourceLoader.loadTexture("Level/five.png");
//		fiveImage = new LevelImage("five", five, 250f, height * 5 / 6, this);
//
//		Texture six = ResourceLoader.loadTexture("Level/six.png");
//		sixImage = new LevelImage("six", six, 250f, height * 5 / 6, this);
//
//		Texture seven = ResourceLoader.loadTexture("Level/seven.png");
//		sevenImage = new LevelImage("seven", seven, 250f, height * 5 / 6, this);
//
//		Texture eight = ResourceLoader.loadTexture("Level/eight.png");
//		eightImage = new LevelImage("eight", eight, 250f, height * 5 / 6, this);
//
//		Texture nine = ResourceLoader.loadTexture("Level/nine.png");
//		nineImage = new LevelImage("nine", nine, 250f, height * 5 / 6, this);
//
//		this.setUnVisible();
//
//		// // 将play按钮加载进来
//		// Texture playButton =
//		// ResourceLoader.loadTexture("Level/playButton.png");
//		// final Image playButtonImage = new LevelImage("playButton",
//		// playButton,
//		// 170f, height / 24, this);
//		//
//		// // 将quit按钮加载进来
//		// Texture quitButton =
//		// ResourceLoader.loadTexture("Level/quitButton.png");
//		// final Image quitButtonImage = new LevelImage("quitButton",
//		// quitButton,
//		// 400f, height / 32, this);
//
		// 关卡图加载
//		Texture level1 = ResourceLoader.loadTexture("Level/level1.png");
//		final Image level1Image = new LevelImage("level1", level1, -1000f,
//				height / 2 - level1.getHeight() / 2, null);
//
//		Texture level2 = ResourceLoader.loadTexture("Level/level2.png");
//		final Image level2Image = new LevelImage("level2", level2, 100f, height
//				/ 2 - level2.getHeight() / 2, null);
//
//		Texture level3 = ResourceLoader.loadTexture("Level/level3.png");
//		final Image level3Image = new LevelImage("level3", level3, 200f, height
//				/ 2 - level3.getHeight() / 2, null);
//
//		Texture level4 = ResourceLoader.loadTexture("Level/level4.png");
//		Image level4Image = new LevelImage("level4", level4, 0f, height / 2
//				- level4.getHeight() / 2, null);
//
//		Texture level5 = ResourceLoader.loadTexture("Level/level5.png");
//		Image level5Image = new LevelImage("level5", level5, 100f, height / 2
//				- level2.getHeight() / 2, null);
//
//		Texture level6 = ResourceLoader.loadTexture("Level/level6.png");
//		Image level6Image = new LevelImage("level6", level6, 200f, height / 2
//				- level6.getHeight() / 2, null);
//
//		Texture level7 = ResourceLoader.loadTexture("Level/level7.png");
//		Image level7Image = new LevelImage("level7", level7, 0f, height / 2
//				- level7.getHeight() / 2, null);
//
//		Texture level8 = ResourceLoader.loadTexture("Level/level8.png");
//		Image level8Image = new LevelImage("level8", level8, 100f, height / 2
//				- level8.getHeight() / 2, null);
//
//		Texture level9 = ResourceLoader.loadTexture("Level/level9.png");
//		Image level9Image = new LevelImage("level9", level9, 200f, height / 2
//				- level9.getHeight() / 2, null);
////
//////		PathViewGroup2 group = new PathViewGroup2(this, level1Image,
//////				level2Image, level3Image, level4Image, level5Image,
//////				level6Image, level7Image, level8Image, level9Image);
////		
//		PathViewGroup group = new PathViewGroup(this);
//		 group.addActor(level1Image);
//		 group.addActor(level2Image);
//		 group.addActor(level3Image);
//		 group.addActor(level4Image);
//		 group.addActor(level5Image);
//		 group.addActor(level6Image);
//		 group.addActor(level7Image);
//		 group.addActor(level8Image);
//		 group.addActor(level9Image);
//
//		this.addActor(group);

		// group.setCurrentItemChangeListener( new PathViewItemChangeListener(){
		//
		// @Override
		// public void onItemChange(Actor actor) {
		// // TODO Auto-generated method stub
		// DefaultLogger.getDefaultLogger().logWithSignature(this,
		// "curent level name:%s", actor.name );
		// int levelnumber = Integer.parseInt(actor.name.substring(5, 6));
		// setUnVisible();
		// switch(levelnumber){
		// case 1:
		// oneImage.visible = true;
		// break;
		// case 2:
		// twoImage.visible = true;
		// break;
		// case 3:
		// threeImage.visible = true;
		// break;
		// case 4:
		// fourImage.visible = true;
		// break;
		// case 5:
		// fiveImage.visible = true;
		// break;
		// case 6:
		// sixImage.visible = true;
		// break;
		// case 7:
		// sevenImage.visible = true;
		// break;
		// case 8:
		// eightImage.visible = true;
		// break;
		// case 9:
		// nineImage.visible = true;
		// break;
		// default: break;
		// }
		// }
		//
		// });

		DefaultLogger.getDefaultLogger().logWithSignature(this, "end ChooseLevelStage.load()");
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

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
