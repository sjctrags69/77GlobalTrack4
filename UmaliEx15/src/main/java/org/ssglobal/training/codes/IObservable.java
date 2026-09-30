package org.ssglobal.training.codes;

public interface IObservable {
	void subscribe(ISubscriber subscriber);
	void unsubscribe(ISubscriber subscriber);
	void notifySubscribers();
}
