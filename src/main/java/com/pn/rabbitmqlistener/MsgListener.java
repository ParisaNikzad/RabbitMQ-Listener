package com.pn.rabbitmqlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class MsgListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("message = [" + new String(message.getBody()) + "]");
    }

}
