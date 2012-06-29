package game.minipatapon.effectpresent.dialog;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Dialog{
	
	protected String text;
	
	BitmapFont bitmapFont = new BitmapFont(Gdx.files.internal("font.fnt"), Gdx.files.internal("font.png"), false);
	
	float x=0f;
	float y=0f;
	
	public Dialog(String name, String text, float x, float y)
	{
		this.text = text;
		
		this.x = x;
		this.y = y;
	}
		
	public void setFont(String fontName)
	{
		bitmapFont = new BitmapFont(Gdx.files.internal(fontName+".fnt"), Gdx.files.internal(fontName+".png"), false);
		
	}	

	public void draw(SpriteBatch batch)
	{
		bitmapFont.draw(batch, text, x, y);
	}
}
