package org.ssglobal.training.codes.itemD.observer;

public interface IStation {
	void subscribe(ISubscriber subscriber);

	void unsubscribe(ISubscriber subscriber);

	void notifySubscribers(String content);
}
