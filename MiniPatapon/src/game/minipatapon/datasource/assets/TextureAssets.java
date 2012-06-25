package game.minipatapon.datasource.assets;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class TextureAssets {
	//public static ArrayList<String> ;
	
	private static Map<String , Texture> m_texMap = new HashMap<String, Texture>();
	private static Map<ArrayList<String>, ArrayList<TextureRegion>> m_texregionMap = new HashMap<ArrayList<String>, ArrayList<TextureRegion>>(); 
	
	public final static ArrayList<String>  StandardBearer_right_Img = 
			new ArrayList<String>(){{ add("MainMenuPack");add( "standard-bearer-right-1" );add( "standard-bearer-right-2" );}};
	public final static ArrayList<String>  ShieldSoldier_right_Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "ShieldSoldier-1" );add( "ShieldSoldier-2" );}};
	public final static ArrayList<String>  Swordman_right_Img =
			new ArrayList<String>(){{ add("MainMenuPack");add( "swordman-1" );add( "swordman-2" );}};
	public final static ArrayList<String>  Swordman2_right_Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "swordman2-1" );add( "swordman2-2" );}};
	public final static ArrayList<String>  StandardBearer_left_Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "standard-bearer-left-1" );add( "standard-bearer-left-2" );}};
	public final static ArrayList<String>  Archer_left_Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "Archer-1" );add( "Archer-2" );}};
	public final static ArrayList<String>  ShieldSoldier_left_Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "ShieldSoldier2-1" );add( "ShieldSoldier2-2" );}};
	public final static ArrayList<String>  ShieldSoldier3_left_Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "ShieldSoldier3-1" );add( "ShieldSoldier3-2" );}};
	public final static ArrayList<String>  GameName1Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "GameName1" );}};
	public final static ArrayList<String>  GameName2Img=
			new ArrayList<String>(){{ add("MainMenuPack");add( "GameName2" );}};
	
	public final static String Altar_Img =  "altar.png" ;
	
	public static  Texture GetTex(String texStr)
	{
		//MusicAssets.GetMusic(MusicAssets.exampleMusicStr);
		while(!m_texMap.containsKey(texStr))
		{
			LoadTexture(texStr);
		}
		return m_texMap.get(texStr);
	}
	
	public static ArrayList<TextureRegion> GetTextureRegionFromPacker(ArrayList<String> str)
	{
		while(!m_texregionMap.containsKey(str))
		{
			LoadTextureRegion(str);
		}
		return m_texregionMap.get(str);
		
	}
	
	public static void LoadTextureRegion(ArrayList<String> str)
	{
		ArrayList<TextureRegion> temp =ResourceLoader.loadTextureRegionFromPacker(str);
		m_texregionMap.put(str, temp);
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
