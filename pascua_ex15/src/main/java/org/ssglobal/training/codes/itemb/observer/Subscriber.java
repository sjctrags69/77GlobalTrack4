package org.ssglobal.training.codes.itemb.observer;

public interface Subscriber {
	void update(String content);
	void pullLatestContent(StationPublisher publisher);
}
