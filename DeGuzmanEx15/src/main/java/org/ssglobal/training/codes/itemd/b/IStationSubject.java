package org.ssglobal.training.codes.itemd.b;

public interface IStationSubject {
	public void signUp(ISubscriber subscriber);
    public void cancelContract(ISubscriber subscriber);
    public void notifySubscribers();
}
