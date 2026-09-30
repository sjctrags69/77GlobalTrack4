package org.ssglobal.training.codes.itemd.b;

public class Subscriber implements ISubscriber{
	private String subscriberName;
    private SiriusXMStation station;

    public Subscriber(String subscriberName, SiriusXMStation station) {
        this.subscriberName = subscriberName;
        this.station = station;
    }

    @Override
    public void update(String content) {
        // Push implementation: receive data pushed by station
        System.out.println(subscriberName + " received pushed content: " + content);
    }

    @Override
    public void update() {
        // Pull implementation: query station for specific content
        String pulledContent = station.getLatestContent();
        System.out.println(subscriberName + " pulled content: " + pulledContent);
    }

    public void signUp() {
        station.signUp(this);
    }

    public void cancelContract() {
        station.cancelContract(this);
    }
}
