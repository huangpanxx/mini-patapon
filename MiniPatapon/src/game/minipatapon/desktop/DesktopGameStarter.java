/** 
 * @description	: desktop GameStarter
 * @author		: 黄攀
 * @created		: 2012-1-2
 */

package game.minipatapon.desktop;

import com.badlogic.gdx.backends.jogl.JoglApplication;
//import game.minipatapon.application.EggSnakeManager;
import game.minipatapon.application.MiniPataponManager;
import game.minipatapon.logger.ConsoleLogger;
import game.minipatapon.logger.DefaultLogger;
import game.minipatapon.logger.Loggable;
import game.minipatapon.logger.WatcherLogger;

public class DesktopGameStarter {
	/**
	 * 桌面程序启动�?
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) {
		// 设置日志方式
//		DefaultLogger.setInnerLogger(new ConsoleLogger());
		DefaultLogger.setInnerLogger( new WatcherLogger() );
		DefaultLogger.setEnable(true);

		// 标记启动
		Loggable logger = DefaultLogger.getDefaultLogger();
		logger.logWithSignature("DesktopStarter", "Enter from desktop");

		try {
			// 获得管理�?
			MiniPataponManager manager = MiniPataponManager.getInstance();
			// 启动管理�?
			new JoglApplication(manager, "MiniPatapon", 480, 320, true);
		} catch (Exception e) {
			logger.logWithSignature("DesktopStarter", 1, "程序运行出错:%1$s",
					e.getMessage());
		}
	}
}
