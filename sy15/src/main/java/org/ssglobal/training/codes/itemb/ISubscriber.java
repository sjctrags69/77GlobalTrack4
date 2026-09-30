package org.ssglobal.training.codes.itemb;

public interface ISubscriber {
    void update(String content);
    void pull();
    void signUp();
    void cancelContract();
}