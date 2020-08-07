package com.zuyatna.designpattern.interfaces;

public interface BaseViewTemplate {

    public void onCreated();
    public void onMessageReceived(String message);
    public void onDestroyed() throws Throwable;
}
