package lessons.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 08.04.2017.
 */
public class MyMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");
        SenderService service = context.getBean("senderService", SenderService.class);
        service.sendMessage(new Message(), "hello world");
    }
}
