package game.minipatapon.effectpresent.dialog;

import game.minipatapon.datasource.assets.TextureAssets;
import game.minipatapon.effectpresent.actor.FlatImage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Dialog {

	protected String text;

	BitmapFont bitmapFont = new BitmapFont(Gdx.files.internal("font.fnt"),
			Gdx.files.internal("font.png"), false);

	float x = 0f;
	float y = 0f;

	float width = 0f;
	float height = 0f;
	
	Texture bg = TextureAssets.GetTex(TextureAssets.DialogBg);

	
	public Dialog(String name, String text, float x, float y) {
		this.text = text;

		this.x = x;
		this.y = y;
	}

	public Dialog(String name, String text, float x, float y, float width, float height) {
		this(name, text, x, y);
		
		this.height = height;
		this.width = width;
	}

	public void setFont(String fontName) {
		bitmapFont = new BitmapFont(Gdx.files.internal(fontName + ".fnt"),
				Gdx.files.internal(fontName + ".png"), false);
	}

	public void draw(SpriteBatch batch) {
		bitmapFont.drawWrapped(batch, text, x, y, width);
	}
	
	public void setDialogBg(Texture bg)
	{
		this.bg = bg;
	}
}
