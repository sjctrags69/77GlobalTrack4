package org.ssglobal.training.codes.itemb.observer;

public interface StationPublisher {
	void registerSubscriber(Subscriber subscriber);
	void removeSubscriber(Subscriber subscriber);
	void notifySubscribers();
	String getLatestContent();
}