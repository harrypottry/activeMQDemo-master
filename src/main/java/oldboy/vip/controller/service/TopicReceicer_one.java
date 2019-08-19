package oldboy.vip.controller.service;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by peng on 18/6/26.
 */
@Component("topicReceicer_one")
public class TopicReceicer_one implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("topicReceicer_one:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
