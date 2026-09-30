package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;

public class SiriusXM implements IObservable {
	private List<ISubscriber> subscribers = new ArrayList<>();
	private String content = "";
	
	public SiriusXM(String content) {
		this.content = content;
	}
	
	@Override
	public void subscribe(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers() {
		for (ISubscriber subscriber : subscribers) {
			subscriber.update(content);
		}
	}

	public void setContent(String content) {
		this.content = content;
		notifySubscribers();
	}
}
