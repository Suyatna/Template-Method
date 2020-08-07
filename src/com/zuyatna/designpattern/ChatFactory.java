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

        if (intent.equalsIgnoreCase("halo")) {

            return new WelcomeChat();
        }

        if (intent.equalsIgnoreCase("product")) {

            return new ProductChat();
        }

        if (intent.equalsIgnoreCase("payment")) {

            return new PaymentConfirmationChat();
        }

        return null;
    };
}
