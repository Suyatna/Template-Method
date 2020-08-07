package com.zuyatna.designpattern.intent;

public class IntentClassifier {

    private static IntentClassifier instance;

    private IntentClassifier() {

    }

    public static IntentClassifier getInstance() {

        if (instance == null) {

            instance = new IntentClassifier();
        }

        return instance;
    }

    public String classify(String message) {

        if (message.contains("halo")) {

            return "welcome";
        }
        else if (message.contains("product")) {

            return "product";
        }
        else if (message.contains("payment")) {

            return "confirmation";
        }

        return null;
    }
}
