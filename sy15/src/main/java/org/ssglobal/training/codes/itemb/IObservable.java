package org.ssglobal.training.codes.itemb;

public interface IObservable {
    void addSubscriber(ISubscriber observer);
    void removeSubscriber(ISubscriber observer);
    void notifySubscriber();
    String getContent();
}