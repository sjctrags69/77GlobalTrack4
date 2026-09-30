package org.ssglobal.training.codes;

public class SiriusSubscriber implements ISubscriber {
	private String name;
	private IObservable station;

	public SiriusSubscriber(String name, IObservable station) {
		this.name = name;
		this.station = station;
	}

	public void signUp() {
		station.addObserver(this);
	}

	public void cancelContract() {
		station.removeObserver(this);
	}

	@Override
	public void update(String content) {
		showContent("pushed", content);
	}

	public void pullContent() {
		showContent("pulled", station.getContent());
	}

	private void showContent(String mode, String content) {
		System.out.printf("%s %s: %s\n", name, mode, content);
	}
}
