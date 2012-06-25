package game.minipatapon.datasource.assets;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class ResourceLoader {

	private static final String TEXTURE_DIR = "data/images";
	private static final String DEFAULT_TEXTURE_NAME = "default.png";

	private static final String SOUND_DIR = "data/sounds";
	private static final String DEFAULT_SOUND_NAME = "default.ogg";

	private static final String MUSIC_DIR = "data/musics";
	private static final String DEFAULT_MUSIC_NAME = "default.ogg";

	private static final String Font_DIR = "data/fonts";
	private static final String DEFAULT_FONT_FILE = "Segoe.fnt";
	private static final String DEFAULT_FONT_BITMAP = "Segoe.png";

	private static final String PARTICLE_DIR = "data/particles";
	private static final String DEFAULT_PARTICLE_FILE = "default.p";
	private static final String DEFAULT_PARTICLE_DIR = "";

	private static final String MAP_DIR = "data/maps";
	
	private static final String MAP_DICTIONARY_FILE = "index.json";

	private static TextureLoader textureLoader = null;
	private static SoundLoader soundLoader = null;
	private static MusicLoader musicLoader = null;
	private static FontLoader fontLoader = null;
	private static ParticleLoader particleLoader = null;
	//private static MapLoader worldLoader = null;
	//private static GateLoader gateLoader = null;
	
	
//	public static ArrayList<Image> loadImageFromPacker( String packerName, ArrayList<String> picNames, float scaleWidth=1, float scaleHeight=1)
//	{
//		
//		ArrayList<Image>  images= new ArrayList<Image>();
//		
//		ArrayList<TextureRegion> regions = loadTextureRegionFromPacker(packerName, picNames);
//		
//		for(int i=0; i<regions.size(); i++)
//		{
//			Image image = new Image( regions.get(i), scaleWidth, scaleHeight);
//			images.add( image );
//		}
//		
//		return images;
//	}
	
	
	public static ArrayList<TextureRegion> loadTextureRegionFromPacker( String packerName, ArrayList<String> picNames)
	{
		ArrayList<TextureRegion> regions = new ArrayList<TextureRegion>();
		
		TextureAtlas atlas=new TextureAtlas(Gdx.files.internal("data/images/" + packerName)); 
		
		for( int i=0; i<picNames.size(); i++ )
		{
			regions.add( atlas.findRegion( picNames.get(i) ) );
		}
		
		return regions;
	}
	
	public static Texture loadTexture(String relativePath) {
		if (ResourceLoader.textureLoader == null) {
			ResourceLoader.textureLoader = new TextureLoader(TEXTURE_DIR,
					DEFAULT_TEXTURE_NAME);
		}
		return ResourceLoader.textureLoader.loadTexture(relativePath);
	}
	

	public static Sound loadSound(String relativePath) {
		if (ResourceLoader.soundLoader == null) {
			ResourceLoader.soundLoader = new SoundLoader(SOUND_DIR,
					DEFAULT_SOUND_NAME);
		}
		return ResourceLoader.soundLoader.loadSound(relativePath);
	}

	public static Music loadMusic(String relativePath) {
		if (ResourceLoader.musicLoader == null) {
			ResourceLoader.musicLoader = new MusicLoader(MUSIC_DIR,
					DEFAULT_MUSIC_NAME);
		}
		return ResourceLoader.musicLoader.loadMusic(relativePath);
	}

	public static BitmapFont loadFont(String fileName, String bitmapName) {
		if (ResourceLoader.fontLoader == null)
			ResourceLoader.fontLoader = new FontLoader(Font_DIR,
					DEFAULT_FONT_FILE, DEFAULT_FONT_BITMAP);
		return ResourceLoader.fontLoader.loadFont(fileName, bitmapName);
	}

	public static ParticleEffect loadParticle(String fileName,
			String particleDir) {
		if (ResourceLoader.particleLoader == null)
			ResourceLoader.particleLoader = new ParticleLoader(PARTICLE_DIR,
					DEFAULT_PARTICLE_FILE, DEFAULT_PARTICLE_DIR);
		return ResourceLoader.particleLoader
				.loadParticle(fileName, particleDir);
	}

	/*public static World loadWorld(String mapPath) {
		if (ResourceLoader.worldLoader == null)
			ResourceLoader.worldLoader = new MapLoader(MAP_DIR);
		return ResourceLoader.worldLoader.loadWorld(mapPath);
	}

	public static Body loadBody(String mapPath, World world) {
		if (ResourceLoader.worldLoader == null)
			ResourceLoader.worldLoader = new MapLoader(MAP_DIR);
		return ResourceLoader.worldLoader.loadBody(mapPath, world);
	}
	
	public static World loadGate(int index) throws Exception{
		if(ResourceLoader.gateLoader==null)
			ResourceLoader.gateLoader = new GateLoader(MAP_DIR,MAP_DICTIONARY_FILE);
		return ResourceLoader.gateLoader.loadGate(index);
	}*/

}
