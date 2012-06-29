package game.minipatapon.stage.midground;


import game.minipatapon.datasource.assets.TextureAssets;
import game.minipatapon.effectpresent.actor.FlatImage;
import game.minipatapon.effectpresent.actor.Image;
import game.minipatapon.effectpresent.animation.AnimateImage;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.MoveTo;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleTo;

public class MainMenuStage extends BaseStage implements ActorLoader {

	private float scaleX = 1f;
	private float scaleY = 1f;

	private float actorDistance = 5f;

	private AnimateImage standardBearer_right_Img;
	private AnimateImage shieldSoldier_right_Img;
	private AnimateImage swordman_right_Img;
	private AnimateImage swordman2_right_Img;

	private AnimateImage shieldSoldier_left_Img;
	private AnimateImage standardBearer_left_Img;
	private AnimateImage shieldSoldier3_left_Img;
	private AnimateImage archer_left_Img;

	private Image altarImg; // 祭坛

	private FlatImage gameName1Img;
	private FlatImage gameName2Img;

	@SuppressWarnings("unused")
	private ContentScreen contentScreen;

	public MainMenuStage(ContentScreen screen, float width, float height,
			boolean stretch) {
		super(width, height, stretch);
		// TODO Auto-generated constructor stub

		this.loadContent(screen);
		this.init();
	}

	@Override
	public void loadContent(ContentScreen screen) {
		// TODO Auto-generated method stub
		this.contentScreen = screen;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

		this.loadAltarImg();

		this.loadShieldSoldier3_left_Img();
		this.loadShieldSoldier_left_Img();
		this.loadArcher_left_Img();
		this.loadStandardBearer_left_Img();

		this.loadSwordman2_right_Img();
		this.loadSwordman_right_Img();
		this.loadShieldSoldier_right_Img();
		this.loadStandardBearer_right_Img();

		this.loadGameName1Img();
		this.loadGameName2Img();

		this.InitAction();
	
	}

	//
	// /** Renders the stage */
	// @Override
	// public void draw () {
	// camera.update();
	// batch.setProjectionMatrix(camera.combined);
	// batch.begin();
	// root.draw(batch, 1);
	// //batch.draw(archerImg.region, 100, 100, 0, 0, archerImg.width,
	// archerImg.height, archerImg.scaleX, archerImg.scaleY, 0);
	// batch.end();
	//
	//
	// }

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

	private void loadStandardBearer_left_Img() {
		ArrayList<String> picNames = TextureAssets.StandardBearer_left_Img;
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.standardBearer_left_Img = new AnimateImage(regions, -100f, 0f,
				this, 0.5f);

		this.standardBearer_left_Img.scaleX = scaleX;
		this.standardBearer_left_Img.scaleY = scaleY;

		float movex = this.actorDistance * 4
				+ this.shieldSoldier3_left_Img.getScaledWidth()
				+ this.shieldSoldier_left_Img.getScaledWidth()
				+ this.archer_left_Img.getScaledWidth();

		this.standardBearer_left_Img.action(MoveTo.$(movex, 0f, 4f));

	}

	private void loadArcher_left_Img() {
		ArrayList<String> picNames = TextureAssets.Archer_left_Img;
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.archer_left_Img = new AnimateImage(regions, -100f, 0f, this, 0.5f);

		this.archer_left_Img.scaleX = scaleX;
		this.archer_left_Img.scaleY = scaleY;

		float movex = this.actorDistance * 3
				+ this.shieldSoldier3_left_Img.getScaledWidth()
				+ this.shieldSoldier_left_Img.getScaledWidth();

		this.archer_left_Img.action(MoveTo.$(movex, 0f, 4f));

	}

	private void loadShieldSoldier_left_Img() {
		ArrayList<String> picNames = TextureAssets.ShieldSoldier_left_Img;

		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.shieldSoldier_left_Img = new AnimateImage(regions, -100f, 0f,
				this, 0.5f);

		this.shieldSoldier_left_Img.scaleX = scaleX;
		this.shieldSoldier_left_Img.scaleY = scaleY;

		float movex = this.actorDistance * 2
				+ this.shieldSoldier3_left_Img.getScaledWidth();

		this.shieldSoldier_left_Img.action(MoveTo.$(movex, 0f, 4f));
	}

	private void loadShieldSoldier3_left_Img() {
		ArrayList<String> picNames = TextureAssets.ShieldSoldier3_left_Img;

		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.shieldSoldier3_left_Img = new AnimateImage(regions, -100f, 0f,
				this, 0.5f);

		this.shieldSoldier3_left_Img.scaleX = scaleX;
		this.shieldSoldier3_left_Img.scaleY = scaleY;

		float movex = this.actorDistance;

		this.shieldSoldier3_left_Img.action(MoveTo.$(movex, 0f, 4f));
	}

	private void loadStandardBearer_right_Img() {
		ArrayList<String> picNames = TextureAssets.StandardBearer_right_Img;
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.standardBearer_right_Img = new AnimateImage(regions,
				Gdx.graphics.getWidth(), 0f, this, 0.5f);

		this.standardBearer_right_Img.scaleX = this.scaleX;
		this.standardBearer_right_Img.scaleY = this.scaleY;

		float movex = this.actorDistance * 4
				+ this.swordman2_right_Img.getScaledWidth()
				+ this.swordman_right_Img.getScaledWidth()
				+ this.shieldSoldier_right_Img.getScaledWidth()
				+ this.standardBearer_right_Img.getScaledWidth();

		this.standardBearer_right_Img.action(MoveTo.$(Gdx.graphics.getWidth()
				- movex, 0f, 4f));
		this.standardBearer_right_Img.action(ScaleTo.$(scaleX, scaleY, 0f));
	}

	private void loadShieldSoldier_right_Img() {
		ArrayList<String> picNames = TextureAssets.ShieldSoldier_left_Img;
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.shieldSoldier_right_Img = new AnimateImage(regions,
				Gdx.graphics.getWidth(), 0f, this, 0.5f);

		this.shieldSoldier_right_Img.scaleX = this.scaleX;
		this.shieldSoldier_right_Img.scaleY = this.scaleY;

		float movex = this.actorDistance * 3
				+ this.swordman2_right_Img.getScaledWidth()
				+ this.swordman_right_Img.getScaledWidth()
				+ this.shieldSoldier_right_Img.getScaledWidth();

		this.shieldSoldier_right_Img.action(MoveTo.$(Gdx.graphics.getWidth()
				- movex, 0f, 4f));
		this.shieldSoldier_right_Img.action(ScaleTo.$(scaleX, scaleY, 0f));
	}

	private void loadSwordman_right_Img() {
		ArrayList<String> picNames = TextureAssets.Swordman_right_Img;
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.swordman_right_Img = new AnimateImage(regions,
				Gdx.graphics.getWidth(), 0f, this, 0.5f);

		this.swordman_right_Img.scaleX = this.scaleX;
		this.swordman_right_Img.scaleY = this.scaleY;

		float movex = this.actorDistance * 2
				+ this.swordman2_right_Img.getScaledWidth()
				+ this.swordman_right_Img.getScaledWidth();

		this.swordman_right_Img.action(MoveTo.$(
				Gdx.graphics.getWidth() - movex, 0f, 4f));
	}

	private void loadSwordman2_right_Img() {
		ArrayList<String> picNames = TextureAssets.Swordman2_right_Img;
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(picNames);

		this.swordman2_right_Img = new AnimateImage(regions,
				Gdx.graphics.getWidth(), 0f, this, 0.5f);

		this.swordman2_right_Img.scaleX = this.scaleX;
		this.swordman2_right_Img.scaleY = this.scaleY;

		float movex = this.actorDistance
				+ this.swordman2_right_Img.getScaledWidth();

		this.swordman2_right_Img.action(MoveTo.$(Gdx.graphics.getWidth()
				- movex, 0f, 4f));

	}

	private void loadAltarImg() {

		Texture maskTexture = TextureAssets.GetTex(TextureAssets.Altar_Img);
		this.altarImg = new FlatImage(maskTexture, 0, -100f, this);

		//
		// this.altarImg.scaleX = this.scaleX;
		// this.altarImg.scaleY = this.scaleY;

		this.altarImg.action(MoveTo.$(0, 0f, 2f));
	}

	private void loadGameName1Img() {

		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(TextureAssets.GameName1Img);

		this.gameName1Img = new FlatImage(regions.get(0),
				Gdx.graphics.getWidth(), Gdx.graphics.getHeight() / 2, this);

		this.gameName1Img.scaleX = 0.5f;
		this.gameName1Img.scaleY = 0.5f;

	}

	private void loadGameName2Img() {

		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(TextureAssets.GameName2Img);
		this.gameName2Img = new FlatImage(regions.get(0),
				Gdx.graphics.getWidth(), Gdx.graphics.getHeight() / 2, this);

		this.gameName2Img.scaleX = 0.5f;
		this.gameName2Img.scaleY = 0.5f;
	}

	private void InitAction() {
		float gameNameWIdth = this.gameName1Img.getScaledWidth()
				+ this.gameName2Img.getScaledWidth();

		Action action = MoveTo.$(Gdx.graphics.getWidth() / 2 - gameNameWIdth
				/ 2, this.gameName1Img.y, 3f);
		action.setCompletionListener(gameName2Img);

		this.gameName1Img.action(action);

		this.gameName2Img.setActionOncompleted(action, MoveTo.$(
				Gdx.graphics.getWidth() / 2 - gameNameWIdth / 2
						+ this.gameName1Img.getScaledWidth(),
				this.gameName2Img.y, 0.5f));

		// this.gameName2Img.action( MoveTo.$(Gdx.graphics.getWidth()/2 -
		// gameNameWIdth/2 + this.gameName1Img.getScaledWidth(),
		// this.gameName2Img.y, 3f) );
	}

}
