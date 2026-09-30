package org.ssglobal.training.codes.VictorinoEx15;

public interface IStation {
    void subscribe(ISubscriber subscriber);
    void unsubscribe(ISubscriber subscriber);
    void notifySubscribers(String news);

}