package lessons.second;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 14.04.2017.
 */
@Component

public class Main {
    @Autowired
    private PersonService personService;
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext("lessons.second");

        Main main = context.getBean(Main.class);
        System.out.println("Name = " + main.personService.getPersonName());


    }
}
