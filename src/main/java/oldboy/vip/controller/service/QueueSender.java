package oldboy.vip.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by peng on 18/6/26.
 */
@Component
public class QueueSender {

    @Autowired
    @Qualifier("queueTemplate")
    private JmsTemplate template;

    public void send(String queueName , final String message){
        template.send(queueName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }

}
