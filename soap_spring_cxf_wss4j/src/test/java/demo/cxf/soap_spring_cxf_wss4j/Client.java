package demo.cxf.soap_spring_cxf_wss4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

        HelloService helloService = context.getBean("helloService", HelloService.class);
        String result = helloService.say("world -> spring client");
        System.out.println(result);
    }
}
