package org.ssglobal.training.codes.VictorinoEx15;

import java.util.ArrayList;
import java.util.List;

public class SirusXim implements IStation {

    private List<ISubscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber registered.");
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed.");
    }

    @Override
    public void notifySubscribers(String news) {

        for (ISubscriber subscriber : subscribers) {
            subscriber.update(news);
        }

    }
}