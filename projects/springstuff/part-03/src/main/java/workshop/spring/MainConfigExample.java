package workshop.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import workshop.spring.beans.HelloWorldConfig;
import workshop.spring.beans.KillerApplication;

public class MainConfigExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        KillerApplication killerApplication = context.getBean(KillerApplication.class);
        killerApplication.start();
    }
}
