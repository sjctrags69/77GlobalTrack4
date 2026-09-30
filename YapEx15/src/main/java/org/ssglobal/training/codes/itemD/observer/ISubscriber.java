package org.ssglobal.training.codes.itemD.observer;

public interface ISubscriber {
	String getId();

	void update(String content);

	String pullContent(IStation station);
}
