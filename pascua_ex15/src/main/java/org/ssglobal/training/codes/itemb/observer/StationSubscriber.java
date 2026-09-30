package org.ssglobal.training.codes.itemb.observer;

public class StationSubscriber implements Subscriber {
	private String subscriberName;
	private String currentData;
	
	public StationSubscriber(String subscriberName, String currentData) {
		this.subscriberName = subscriberName;
		this.currentData = currentData;
	}

	@Override
	public void update(String content) {}

	@Override
	public void pullLatestContent(StationPublisher publisher) {}

	public String getSubscriberName() {
		return subscriberName;
	}

	public String getCurrentData() {
		return currentData;
	}	
}
