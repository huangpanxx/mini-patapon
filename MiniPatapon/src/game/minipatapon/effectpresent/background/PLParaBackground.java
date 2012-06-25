package game.minipatapon.effectpresent.background;
//import javax.swing.text.PlainDocument;
//import javax.xml.soap.Text;

import com.badlogic.gdx.Gdx; 
import com.badlogic.gdx.graphics.GL10; 
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
public class PLParaBackground {
 
    //protected OrthographicCamera camera; 
    //protected Box2DDebugRenderer renderer; // 测试用绘制器 
    //private World world;
    //int count=0;
	static private PLParaBackground m_background =null;
	
	public static PLParaBackground GetInstance()
	{
		if(null==m_background)
			m_background = new PLParaBackground();
		
		return m_background;
		
	}
	
	private PLParaBackground()
	{
		create();
		
		
	}
	
	public PLParallaxBackground rbg;

	public Texture texture1;
	public Texture texture2;
	public Texture texture3;
	TextureRegion bg1;
	TextureRegion bg2;
	TextureRegion bg3;
	TextureRegion bg4;
	TextureRegion bg5;
	//public SpriteBatch m_spriteBatch;
	
	
  
    public void create() { 
        //camera = new OrthographicCamera(48, 32); 
        //camera.position.set(24, 16, 0); 
        //renderer = new Box2DDebugRenderer(); 
    	 
//        Texture m_texture1 = new Texture(Gdx.files.internal("data/startgame_256_256.png"));
 //       Texture m_texture2 = new Texture(Gdx.files.internal("data/setting_256_256.png"));
 //       Texture m_texture3 = new Texture(Gdx.files.internal("data/rank_256_256.png"));
 //       Texture m_texture4 = new Texture(Gdx.files.internal("data/exit_256_256.png"));
 //       Texture m_texture5 = new Texture(Gdx.files.internal("data/help_256_256.png"));
        
         
        //world = new World(new Vector2(0, -9.8f), true); // 一般标准重力场 
     /*   BodyDef bd = new BodyDef(); //声明物体定义 
        bd.position.set(2f, 16.1f); 
        bd.type=BodyType.DynamicBody; 
        Body b = world.createBody(bd); //通过world创建一个物体 
        PolygonShape box=new PolygonShape();
        box.setAsBox(3, 3);
        b.createFixture(box, 1f); //将形状和密度赋给物体 
        b.setFixedRotation(true);
        
        BodyDef wallBodyDef=new BodyDef();
        wallBodyDef.position.set(24,16);
        wallBodyDef.type=BodyType.StaticBody;
        Body wallBody=world.createBody(wallBodyDef);
        
        wallBody.createFixture(box, 1f);
        wallBody.setFixedRotation(true);
       */ 
        
       // m_spriteBatch=new SpriteBatch();
		texture1=new Texture(Gdx.files.internal("data/GameGround1_1024_512.png"));
		texture2=new Texture(Gdx.files.internal("data/GameGround2_512_256.png"));
		texture3=new Texture(Gdx.files.internal("data/GameGround3_1024_1024.png"));
		
        bg1=new TextureRegion(texture1,4,2,410,139);
        bg4=new TextureRegion(texture2,0,0,511,169);
        
        bg2=new TextureRegion(texture2,1,173,355,29);
        bg3=new TextureRegion(texture2,1,203,470,52);
        bg5=new TextureRegion(texture3,0,0,483,315);
        
       bg1.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
       bg2.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
       bg3.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
       bg4.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
       bg5.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
        
		rbg = new PLParallaxBackground(new PLParallaxLayer[]{
	            new PLParallaxLayer(bg5,new Vector2(0.8f,0f),new Vector2(0,140),new Vector2(0, 0)),
	            new PLParallaxLayer(bg4,new Vector2(0.9f,0f),new Vector2(0,140),new Vector2(0, 800)),
	            new PLParallaxLayer(bg3,new Vector2(1f,0f),new Vector2(0,140),new Vector2(0,800)),
	            new PLParallaxLayer(bg2,new Vector2(1.5f,0f),new Vector2(0,140),new Vector2(0,800)),
	            new PLParallaxLayer(bg1,new Vector2(1.5f,0f),new Vector2(0,0),new Vector2(0,800)),
	      },Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),new Vector2(10,0));
       // b.setActive(true);
        //b.setAwake(true);
        //b.setLinearVelocity(30f, 10f);
    }
 
  
    public void dispose() {       
        //renderer.dispose(); 
        //world.dispose();
 
        //renderer = null; 
        //world = null; 
    }
 
   
    public void pause() { 
        // TODO Auto-generated method stub
 
    }
 
   
    public void render() { 
        //world.step(0.015f, 8, 10); 
        GL10 gl = Gdx.app.getGraphics().getGL10(); 
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT); 
        
    //    m_spriteBatch.begin();
        
        //m_spriteBatch.draw(bg1,10,20, 415, 145);
        //m_spriteBatch.draw(bg3,10,20, 483, 318);
   //     m_spriteBatch.draw(bg5,0,bg1.getRegionHeight(),bg5.getRegionWidth(), bg5.getRegionHeight());
   //     m_spriteBatch.draw(bg4,0,bg1.getRegionHeight(),bg4.getRegionWidth(), bg4.getRegionHeight());
   //     m_spriteBatch.draw(bg3,0,bg1.getRegionHeight(),bg3.getRegionWidth(), bg3.getRegionHeight());
   //     m_spriteBatch.draw(bg2,0,bg1.getRegionHeight(),bg2.getRegionWidth(), bg2.getRegionHeight());
   //     m_spriteBatch.draw(bg1,0,0,bg1.getRegionWidth(), bg1.getRegionHeight());
   //     m_spriteBatch.end();
        //camera.update(); 
        //camera.apply(gl); 
        /*count++;
        if(count==1){
        	world.getBodies().next().setLinearVelocity(30f, 10f);
        }*/
        rbg.render(Gdx.app.getGraphics().getDeltaTime());
        //renderer.render(world, camera.combined); 
    }
 
  
    public void resize(int width, int height) { 
        // TODO Auto-generated method stub
 
    }
 
    public void resume() { 
        // TODO Auto-generated method stub
 
    }
    
}