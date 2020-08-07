package com.zuyatna.designpattern;

public class TemplateDemo {

    public static void main(String[] args) throws Throwable {

        BaseView baseView = new BaseView();
        baseView.onCreated();
        baseView.onDestroyed();
    }
}
