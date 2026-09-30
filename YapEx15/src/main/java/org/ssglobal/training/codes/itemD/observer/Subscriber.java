package org.ssglobal.training.codes.itemD.observer;

public class Subscriber implements ISubscriber {
	private String id;

	public Subscriber(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		// return id
		return null;
	}

	@Override
	public void update(String content) {
		// custom update action
	}

	@Override
	public String pullContent(IStation station) {
		// send request to station
		return null;
	}

}
