package org.ssglobal.training.codes.itemb;

import java.util.ArrayList;
import java.util.List;

public class SiriusXMStation implements IObservable {
	private List<ISubscriber> subscribers = new ArrayList<>();
	private String latestContent;
	
	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<ISubscriber> subscribers) {
		this.subscribers = subscribers;
	}

	public String getLatestContent() {
		return latestContent;
	}

	public void setLatestContent(String latestContent) {
		this.latestContent = latestContent;
	}
	
	@Override
	public void addSubscriber(ISubscriber observer) {
		
	}
	
	@Override
	public void removeSubscriber(ISubscriber observer) {
		
	}
	
	@Override
	public void notifySubscriber() {
		
	}
	
	@Override
	public String getContent() {
		return null;
	}
}