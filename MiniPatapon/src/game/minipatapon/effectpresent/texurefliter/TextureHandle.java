package game.minipatapon.effectpresent.texurefliter;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextureHandle {
	public  static void  TextureFilterLinear(Texture x)
	{
		x.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	}
    public static void TextureFilterLinear(TextureRegion x)
    {
    	x.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
    }
    public static void TextureFilter(Texture x)
    {
    	x.setFilter(TextureFilter.MipMapLinearLinear, TextureFilter.MipMap);
    }
}
