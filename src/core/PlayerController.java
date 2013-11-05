package core;

import event.EventBase;

/**
 * 玩家状态管理，每次玩家状态改变都由此类通知其他相关类
 * @author Leo
 *
 */
public class PlayerController extends BaseController {

	public PlayerController() {
		String[] eventArr = {Notifier.USER_READY_EVENT,Notifier.USER_ENTER_EVENT};
		this.registerEvents(eventArr,this);
	}
	
}
