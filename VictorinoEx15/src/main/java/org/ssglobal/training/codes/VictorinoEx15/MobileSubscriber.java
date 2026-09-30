package org.ssglobal.training.codes.VictorinoEx15;

public class MobileSubscriber implements ISubscriber {

    @Override
    public void update(String news) {
        System.out.println("Mobile received: " + news);
    }
}