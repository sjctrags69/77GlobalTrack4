package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;

public class SiriusXMStation implements IObservable {
	private List<ISubscriber> subscribers = new ArrayList<>();
	private String content = "";

	@Override
	public void addObserver(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeObserver(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifyObservers() {
		for (ISubscriber subscriber : subscribers) {
			subscriber.update(content);
		}
	}

	@Override
	public String getContent() {
		return content;
	}

	public void pushContent(String newContent) {
		this.content = newContent;
		notifyObservers();
	}
}
