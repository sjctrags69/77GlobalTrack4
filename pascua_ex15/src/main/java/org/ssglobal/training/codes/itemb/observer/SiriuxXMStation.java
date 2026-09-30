package org.ssglobal.training.codes.itemb.observer;

import java.util.ArrayList;
import java.util.List;

public class SiriuxXMStation implements StationPublisher {
	private List<Subscriber> subscribers;
	private String latestContent;
	
	public SiriuxXMStation() {
		super();
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void registerSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {}

	@Override
	public void notifySubscribers() {}

	public void publishNewContent(String content) {
		this.latestContent = content;
	}
	
	@Override
	public String getLatestContent() {
		return this.latestContent;
	}
}
