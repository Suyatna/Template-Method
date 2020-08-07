package com.zuyatna.designpattern;

import com.zuyatna.designpattern.concrete.PaymentConfirmationChat;
import com.zuyatna.designpattern.concrete.ProductChat;
import com.zuyatna.designpattern.concrete.WelcomeChat;
import com.zuyatna.designpattern.interfaces.Chat;

public class ChatFactory {

    public Chat createChat(String intent) {

        if (intent == null) {

            return null;
        }

        return switch (intent) {
            case "confirmation" -> new PaymentConfirmationChat();
            case "product" -> new ProductChat();
            default -> new WelcomeChat();
        };
    }
}
