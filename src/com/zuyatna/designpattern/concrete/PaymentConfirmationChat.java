package com.zuyatna.designpattern.concrete;

import com.zuyatna.designpattern.interfaces.Chat;

public class PaymentConfirmationChat implements Chat {

    private String orderNum;

    public void setOrderNum(String orderNum) {

        this.orderNum = orderNum;
    }

    @Override
    public String getResponseText() {

        return orderNum;
    }
}
