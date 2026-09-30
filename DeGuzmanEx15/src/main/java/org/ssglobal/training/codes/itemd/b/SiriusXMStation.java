package org.ssglobal.training.codes.itemd.b;

import java.util.ArrayList;
import java.util.List;

public class SiriusXMStation implements IStationSubject{
	private List<ISubscriber> subscribers = new ArrayList<>();
	private String latestContent;

	@Override
    public void signUp(ISubscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber signed up successfully.");
    }

    @Override
    public void cancelContract(ISubscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber contract canceled.");
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(latestContent); 
        }
    }
	
	public void publishContent(String content) {
        this.latestContent = content;
        notifySubscribers();
    }

    // Used by subscribers during Pull operations
    public String getLatestContent() {
        return latestContent;
    }
}
