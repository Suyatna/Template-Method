package com.zuyatna.designpattern;

import com.zuyatna.designpattern.concrete.PaymentConfirmationChat;
import com.zuyatna.designpattern.concrete.ProductChat;
import com.zuyatna.designpattern.intent.IntentClassifier;
import com.zuyatna.designpattern.interfaces.BaseViewTemplate;
import com.zuyatna.designpattern.interfaces.Chat;

import java.util.Arrays;
import java.util.Scanner;

public class BaseView implements BaseViewTemplate {

    private final IntentClassifier intentClassifier = IntentClassifier.getInstance();

    private final ChatFactory factory = new ChatFactory();

    @Override
    public void onCreated() {

        System.out.print("amy i help you? > ");
        Scanner scanner = new Scanner(System.in);
        String inputMessage = "";

        while (!inputMessage.equals("quit")) {

            inputMessage = scanner.nextLine();
            onMessageReceived(inputMessage);

            System.out.println();
            System.out.print("please ask me clearly > ");
        }

        System.out.println("thank you, come again :) ");
    }

    @Override
    public void onMessageReceived(String message) {

        String intent = intentClassifier.classify(message);
        Chat chat = factory.createChat(intent);

        try {

            if (chat instanceof ProductChat) {

                ((ProductChat) chat).setProducts(Arrays.asList("entertainment", "information", "fashion"));
            }
            else if (chat instanceof PaymentConfirmationChat) {

                ((PaymentConfirmationChat) chat).setOrderNum("your payment confirmation 0001");
            }

            System.out.println(chat.getResponseText());
        }
        catch (Exception e) {

            System.out.println("I don't understand :( " + e);
        }
    }

    @Override
    public void onDestroyed() throws Throwable {

        finalize();
    }
}
