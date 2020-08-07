package com.zuyatna.designpattern.concrete;

import com.zuyatna.designpattern.interfaces.Chat;

public class WelcomeChat implements Chat {

    @Override
    public String getResponseText() {

        return "welcome to chit-chat, may i help you? ";
    }
}
