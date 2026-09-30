package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.SiriusSubscriber;
import org.ssglobal.training.codes.SiriusXMStation;

public class TestObserver {

	@Test
	public void testPushContent() {
		SiriusXMStation station = new SiriusXMStation();
		SiriusSubscriber juan = new SiriusSubscriber("Juan", station);
		SiriusSubscriber maria = new SiriusSubscriber("Maria", station);
		juan.signUp();
		maria.signUp();
		station.pushContent("Top 40 Hits");
	}

	@Test
	public void testPullContent() {
		SiriusXMStation station = new SiriusXMStation();
		SiriusSubscriber juan = new SiriusSubscriber("Juan", station);
		SiriusSubscriber maria = new SiriusSubscriber("Maria", station);
		station.pushContent("Evening News");
		juan.pullContent();
		maria.pullContent();
	}

	@Test
	public void testCancelContract() {
		SiriusXMStation station = new SiriusXMStation();
		SiriusSubscriber juan = new SiriusSubscriber("Juan", station);
		SiriusSubscriber maria = new SiriusSubscriber("Maria", station);
		juan.signUp();
		maria.signUp();
		station.pushContent("Classic Rock Hour");
		juan.cancelContract();
		station.pushContent("Jazz Night");
	}
}
