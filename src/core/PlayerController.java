package core;

import event.EventBase;

/**
 * ���״̬����ÿ�����״̬�ı䶼�ɴ���֪ͨ���������
 * @author Leo
 *
 */
public class PlayerController extends BaseController {

	public PlayerController() {
		String[] eventArr = {Notifier.USER_READY_EVENT,Notifier.USER_ENTER_EVENT};
		this.registerEvents(eventArr,this);
	}
	
}
