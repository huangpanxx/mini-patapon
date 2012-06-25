package game.minipatapon.datasource.assets;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import com.badlogic.gdx.audio.Music;


public class MusicAssets {
	public static String exampleMusicStr;
	
	private static Map<String , Music> m_musicMap = new HashMap<String, Music>();
	
	public static  Music GetMusic(String musicStr)
	{
		//MusicAssets.GetMusic(MusicAssets.exampleMusicStr);
		while(!m_musicMap.containsKey(musicStr))
		{
			LoadMusic(musicStr);
		}
		return m_musicMap.get(musicStr);
	}
	
	public static void LoadMusic(String musicStr)
	{
		Music temp=ResourceLoader.loadMusic(musicStr);
		m_musicMap.put(musicStr, temp);
	}
	
	public static void LoadMusic(ArrayList<String> musicStrs)
	{
		
		for (String musicStr : musicStrs) {
			Music temp=ResourceLoader.loadMusic(musicStr);
			m_musicMap.put(musicStr, temp);
		}
		
	}
}
