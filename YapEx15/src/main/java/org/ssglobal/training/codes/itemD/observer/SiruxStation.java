package org.ssglobal.training.codes.itemD.observer;

import java.util.ArrayList;
import java.util.List;

public class SiruxStation implements IStation {
	private List subscribers = new ArrayList<>();

	@Override
	public void subscribe(ISubscriber subscriber) {
		// add subscriber to list
	}

	@Override
	public void unsubscribe(ISubscriber subscriber) {
		// remove subscriber from list
	}

	@Override
	public void notifySubscribers(String content) {
		// call subscriber.update() method on all subscribers
	}
}
