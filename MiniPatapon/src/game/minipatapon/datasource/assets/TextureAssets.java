package game.minipatapon.datasource.assets;

import game.minipatapon.logger.DefaultLogger;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextureAssets {
	// public static ArrayList<String> ;

	private static Map<String, Texture> m_texMap = new HashMap<String, Texture>();
	private static Map<ArrayList<String>, ArrayList<TextureRegion>> m_texregionMap = new HashMap<ArrayList<String>, ArrayList<TextureRegion>>();

	// StatAnimationStage
	public final static ArrayList<String> UniversalImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("universal");
		}
	};

	public final static ArrayList<String> TweenImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("tween");
		}
	};

	public final static ArrayList<String> EngineImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("engine");
		}
	};

	public final static ArrayList<String> LogoImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("logo");
		}
	};

	public final static ArrayList<String> StripImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("white");
		}
	};

	public final static ArrayList<String> PoweredImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("powered");
		}
	};

	public final static ArrayList<String> GdxImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("gdxblur");
		}
	};

	public final static ArrayList<String> VeilImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("white");
		}
	};

	public final static ArrayList<String> GdxTexImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("gdx");
		}
	};
	
	public final static ArrayList<String> BlackBgImg = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("StartAnimation/StartAnimationPack");
			add("blackBg");
		}
	};
	
	
	
	
	// MainMenuStage
	public final static ArrayList<String> StandardBearer_right_Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("flagman1");
			add("flagman2");
		}
	};
	public final static ArrayList<String> ShieldSoldier_right_Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("shieldSoldiers");
			add("shieldSoldiers2");
		}
	};
	public final static ArrayList<String> Swordman_right_Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("swordsman1");
			add("swordsman2");
		}
	};
	public final static ArrayList<String> Swordman2_right_Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("holdKnife2");
			add("holdKnife1");
		}
	};
	public final static ArrayList<String> StandardBearer_left_Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("holdFlag1");
			add("holdFlag2");
			add("holdFlag3");
			add("holdFlag4");
		}
	};
	public final static ArrayList<String> Archer_left_Img = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("archer1");
			add("archer2");
		}
	};
	public final static ArrayList<String> ShieldSoldier_left_Img = new ArrayList<String>() {
		private static final long serialVersionUID = 5626720953104329290L;

		{
			add("MainMenuPack");
			add("shieldSoldier1");
			add("shieldSoldier2");
		}
	};
	public final static ArrayList<String> ShieldSoldier3_left_Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("Yaripon");
			add("Yaripon1");
			add("Yaripon2");
			add("Yaripon4");
		}
	};
	public final static ArrayList<String> GameName1Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("GameName1");
		}
	};
	public final static ArrayList<String> GameName2Img = new ArrayList<String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add("MainMenuPack");
			add("GameName2");
		}
	};
	public final static String Altar_Img = "altar.png";

	// HelpStage
	public final static String AboutUsImage = "about us.png";
	public final static String QuitImage = "quitbutton.png";

	public static Texture GetTex(String texStr) {
		// MusicAssets.GetMusic(MusicAssets.exampleMusicStr);
		while (!m_texMap.containsKey(texStr)) {
			LoadTexture(texStr);
		}
		return m_texMap.get(texStr);
	}

	public static ArrayList<TextureRegion> GetTextureRegionsFromPacker(
			ArrayList<String> str) {
		while (!m_texregionMap.containsKey(str)) {
			LoadTextureRegion(str);
		}
		return m_texregionMap.get(str);
	}

	public static TextureRegion GetTextureRegionFromPacker(ArrayList<String> str) {
		ArrayList<TextureRegion> regions = TextureAssets
				.GetTextureRegionsFromPacker(str);
		if (regions.size() > 0)
			return regions.get(0);
		else
		{
			DefaultLogger.getDefaultLogger().logWithSignature(TextureAssets.class, "资源[]没有找到", str.toString());
			return null;
		}
			
	}

	public static void LoadTextureRegion(ArrayList<String> str) {
		ArrayList<TextureRegion> temp = ResourceLoader
				.loadTextureRegionFromPacker(str);
		m_texregionMap.put(str, temp);
	}

	public static void LoadTexture(String texStr) {
		Texture temp = ResourceLoader.loadTexture(texStr);
		m_texMap.put(texStr, temp);
	}

	public static void LoadTexture(ArrayList<String> texStrs) {

		for (String texStr : texStrs) {
			Texture temp = ResourceLoader.loadTexture(texStr);
			m_texMap.put(texStr, temp);
		}

	}
}
