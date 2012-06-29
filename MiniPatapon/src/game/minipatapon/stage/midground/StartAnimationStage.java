package game.minipatapon.stage.midground;

import com.badlogic.gdx.Gdx;

import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Back;
import aurelienribon.tweenengine.equations.Cubic;
import aurelienribon.tweenengine.equations.Quad;
import aurelienribon.tweenengine.equations.Quart;
import aurelienribon.tweenengine.equations.Quint;

import game.minipatapon.datasource.assets.TextureAssets;
import game.minipatapon.effectpresent.action.ActorAccessor;
import game.minipatapon.effectpresent.actor.FlatImage;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.screen.ContentScreen;
import game.minipatapon.stage.base.BaseStage;

public class StartAnimationStage extends BaseStage implements ActorLoader {


	@SuppressWarnings("unused")
	private ContentScreen contentScreen = null;

	

	private final FlatImage universalImg = new FlatImage("universalImg",
			TextureAssets
					.GetTextureRegionFromPacker(TextureAssets.MiniImg));
	private final FlatImage tweenImg = new FlatImage("tweenImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.PataImg));
	private final FlatImage engineImg = new FlatImage("engineImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.PonImg));
	private final FlatImage stripImg = new FlatImage("stripImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.StripImg));
	private final FlatImage logoImg = new FlatImage("logoImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.LogoImg));
	private final FlatImage poweredImg = new FlatImage("poweredImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.PoweredImg));
	private final FlatImage gdxImg = new FlatImage("gdxImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.GdxImg));
	private final FlatImage veilImg = new FlatImage("veilImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.VeilImg));
	private final FlatImage gdxTexImg = new FlatImage("gdxTexImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.GdxTexImg));
	private final FlatImage blackBgImg = new FlatImage("blackBgImg",
			TextureAssets.GetTextureRegionFromPacker(TextureAssets.BlackBgImg));
	
	private final TweenManager tweenManager = new TweenManager();

	public StartAnimationStage(ContentScreen screen, float width, float height,
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
		
		DefaultLogger.getDefaultLogger().logWithSignature(this, "graphics-size: %d, %d", Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		DefaultLogger.getDefaultLogger().logWithSignature(this, "stage-size: %f, %f", this.width, this.height);
		DefaultLogger.getDefaultLogger().logWithSignature(this, "camera-size: %f, %f", camera.viewportWidth, camera.viewportHeight);


		Tween.registerAccessor(FlatImage.class, new ActorAccessor());

		float wpw = this.width;
		float wph = this.height;

		FlatImage[] images = new FlatImage[] { blackBgImg, stripImg,
				universalImg, tweenImg, engineImg, logoImg, poweredImg, gdxImg };
		for (FlatImage image : images) {

			image.setOrigin(image.width / 2, image.height / 2);
			this.addActor(image);

		}

		blackBgImg.setPosition(0, 0);
		blackBgImg.setSize(wpw, wph);

		universalImg.setPosition(wpw / 2 - tweenImg.width, wph);
		tweenImg.setPosition(0, wph / 2 - tweenImg.height);
		engineImg.setPosition(wpw, wph / 2 - engineImg.height);
		logoImg.setPosition(wpw / 2 + engineImg.width - logoImg.width,
				wph * 0.55f);

		stripImg.setSize(wpw, wph);
		stripImg.setOrigin(wpw / 2, wph / 2);
		stripImg.setPosition(0, 0);

		poweredImg.setPosition(wpw / 2 - 1.2f*poweredImg.width, wph / 2
				- poweredImg.height);
		poweredImg.setScale(1.2f, 1.2f);
		gdxImg.setPosition(wpw / 2, wph / 2 - gdxImg.height / 2);

		veilImg.setSize(wpw, wph);
		veilImg.setPosition(-wpw / 2, -wph / 2);
		veilImg.setColor(1, 1, 1, 0);

		Tween.setWaypointsLimit(1);
		
		Timeline.createSequence()
				.push(Tween.set(tweenImg, ActorAccessor.POS_XY).targetRelative(
						-tweenImg.width, wph * 0))
				.push(Tween.set(engineImg, ActorAccessor.POS_XY)
						.targetRelative(0, 0))
				.push(Tween.set(universalImg, ActorAccessor.POS_XY)
						.targetRelative(0, 0))
				.push(Tween.set(logoImg, ActorAccessor.SCALE_XY).target(7, 7))
				.push(Tween.set(logoImg, ActorAccessor.OPACITY).target(0))
				.push(Tween.set(stripImg, ActorAccessor.SCALE_XY).target(1, 0))
				.push(Tween.set(poweredImg, ActorAccessor.OPACITY).target(0))
				.push(Tween.set(gdxImg, ActorAccessor.OPACITY).target(0))

				// 开始 需要暂停一下，因为紫云加载的时候 deltatime 很长，前面的动画会直接从 开始值 跳到 结束值
				.pushPause(2f)
				.push(Tween.to(stripImg, ActorAccessor.SCALE_XY, 0.8f)
						.target(1, 0.6f).ease(Quart.OUT))
				.push(Tween.to(tweenImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 0.5f, 0).ease(Quart.OUT))
				.push(Tween.to(engineImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * -0.5f, 0).ease(Quart.OUT))
				.push(Tween.to(universalImg, ActorAccessor.POS_XY, 0.6f)
						.targetRelative(0, wph * -0.45f).ease(Quint.OUT))
				.pushPause(-0.3f)

				.beginParallel()
				.push(Tween.set(logoImg, ActorAccessor.OPACITY).target(1))
				.push(Tween.to(logoImg, ActorAccessor.SCALE_XY, 0.5f)
						.target(1, 1).ease(Back.OUT))
				.end()
				.push(Tween.to(stripImg, ActorAccessor.SCALE_XY, 0.5f)
						.target(1, 1).ease(Back.IN))
				.pushPause(0.3f)

				.beginParallel()
				.push(Tween.to(tweenImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 1, 0).ease(Back.IN))
				.push(Tween.to(engineImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 1, 0).ease(Back.IN))
				.push(Tween.to(universalImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 1, 0).ease(Back.IN))
				.push(Tween.to(logoImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 1, 0).ease(Back.IN))
				.end()

				.pushPause(-0.3f)
				.push(Tween.to(poweredImg, ActorAccessor.OPACITY, 0.3f).target(
						1))

				.beginParallel()
				.push(Tween.to(gdxImg, ActorAccessor.OPACITY, 1.5f).target(1)
						.ease(Cubic.IN))
				.push(Tween.to(gdxImg, ActorAccessor.ROTATION, 2.0f)
						.target(360 * 15).ease(Quad.OUT))
				.end()

				.pushPause(0.3f)
				.push(Tween.to(gdxImg, ActorAccessor.SCALE_XY, 0.6f)
						.waypoint(1.6f, 0.4f).target(1.2f, 1.2f).ease(Cubic.OUT))

				.pushPause(0.3f)
				.beginParallel()
				.push(Tween.to(poweredImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 1, 0).ease(Back.IN))
				.push(Tween.to(gdxImg, ActorAccessor.POS_XY, 0.5f)
						.targetRelative(wpw * 1, 0).ease(Back.IN)).end()
				.pushPause(0.3f)

				.start(tweenManager);

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

	public void draw() {

		tweenManager.update(Gdx.graphics.getDeltaTime());

		if (gdxImg.rotation > 360*15-20) gdxImg.setRegion(gdxTexImg.region);

		super.draw();
	}

	public void dispose() {
		tweenManager.killAll();
		super.dispose();
	}

}
