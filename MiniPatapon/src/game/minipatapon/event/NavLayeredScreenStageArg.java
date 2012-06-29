package game.minipatapon.event;



import game.minipatapon.application.MiniPataponManager;
import game.minipatapon.stage.base.BaseStage;

public class NavLayeredScreenStageArg extends EventArg{

	public int m_screenLayer;
	public Class<? extends BaseStage> m_class;
	
	public NavLayeredScreenStageArg(int screenLayer, Class<? extends BaseStage> cls){
	     m_class=cls;
	     m_screenLayer=screenLayer;
	     Init();
	}
	public void Init()
	{
		try {
			EventAggregator.getInstance().getEvent(NavLayeredScreenStageEvent.class).subscribe(MiniPataponManager.getInstance().getLayeredScreen());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void EventArgSent() {
		// TODO Auto-generated method stub
		try {
			EventAggregator.getInstance().getEvent(NavLayeredScreenStageEvent.class).EventArgRec(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
