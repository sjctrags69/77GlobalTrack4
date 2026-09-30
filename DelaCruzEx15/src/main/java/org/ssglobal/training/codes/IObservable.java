package org.ssglobal.training.codes;

public interface IObservable {
	void addObserver(ISubscriber subscriber);

	void removeObserver(ISubscriber subscriber);

	void notifyObservers();

	String getContent();
}
