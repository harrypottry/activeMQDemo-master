package oldboy.vip.controller.service;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by peng on 18/6/26.
 */
@Component("topicReceicer_two")
public class TopicReceicer_two implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("topicReceicer_two:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
