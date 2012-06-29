package game.minipatapon.effectpresent.spriter.util;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;

import game.minipatapon.effectpresent.spriter.SpriterObject;
import game.minipatapon.effectpresent.spriter.util.SpriterDrawer;

public class ScaleSpriterDrawer extends SpriterDrawer {

	public static void draw(float scaleX, float scaleY, Stage stage,
			SpriteBatch spriteBatch, SpriterObject spriterObject,
			String animationName, float keyTime, float offsetX, float offsetY,
			boolean repeatAnimation, boolean doTweening) {
        Camera originCamera = stage.getCamera();
		OrthographicCamera camera = new OrthographicCamera(1 / scaleX
				* originCamera.viewportWidth, 1 / scaleY
				* originCamera.viewportHeight);

		camera.position.set(originCamera.position);

		
		offsetX *= 1 / scaleY;
		offsetY *= 1 / scaleY;

		camera.update();
		spriteBatch.setProjectionMatrix(camera.combined);

		spriteBatch.begin();
		SpriterDrawer.draw(spriteBatch, spriterObject, animationName, keyTime,
				offsetX, offsetY, repeatAnimation, doTweening);

		spriteBatch.end();
	}
}
