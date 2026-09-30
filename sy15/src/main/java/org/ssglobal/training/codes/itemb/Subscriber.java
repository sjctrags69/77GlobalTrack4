package org.ssglobal.training.codes.itemb;

public class Subscriber implements ISubscriber {
	private IObservable station;
	
	public IObservable getStation() {
		return station;
	}

	public void setStation(IObservable station) {
		this.station = station;
	}

	@Override
	public void update(String content) {
	}

	@Override
	public void pull() {
	}

	@Override
	public void signUp() {
	}

	@Override
	public void cancelContract() {
	}
}