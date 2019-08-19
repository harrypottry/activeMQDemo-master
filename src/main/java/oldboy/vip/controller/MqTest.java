package oldboy.vip.controller;

import oldboy.vip.controller.service.QueueSender;
import oldboy.vip.controller.service.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peng on 18/6/26.
 */
@Controller
@RequestMapping("mq")
public class MqTest {

    @Autowired
    private QueueSender queueSender;

    @Autowired
    private TopicSender topicSender;


    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        queueSender.send("oldboy.queue","oldboy");//oldboy.queue和配置文件中destination对应
        topicSender.send("oldboy.topic","oldboy");//oldboy.topic和配置文件中destination对应

        return "oldboy.vip";
    }

}
