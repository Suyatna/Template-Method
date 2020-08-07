package com.zuyatna.designpattern.intent;

public class IntentClassifierDemo {

    public static void main(String[] args) {

        final IntentClassifier intentClassifier = IntentClassifier.getInstance();

        intentClassifier.classify("halo");
    }
}
