package game.minipatapon.datasource.assets;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;


public class TextureAssets {
	//public static ArrayList<String> ;
	
	private static Map<String , Texture> m_texMap = new HashMap<String, Texture>();
	
	public static  Texture GetMusic(String texStr)
	{
		//MusicAssets.GetMusic(MusicAssets.exampleMusicStr);
		while(!m_texMap.containsKey(texStr))
		{
			LoadTexture(texStr);
		}
		return m_texMap.get(texStr);
	}
	
	public static void LoadTexture(String texStr)
	{
		Texture temp=ResourceLoader.loadTexture(texStr);
		m_texMap.put(texStr, temp);
	}
	
	public static void LoadTexture(ArrayList<String> texStrs)
	{
		
		for (String texStr : texStrs) {
			Texture temp=ResourceLoader.loadTexture(texStr);
			m_texMap.put(texStr, temp);
		}
		
	}
}
