package lessons.second;

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

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("lessons.second");

        Main main = context.getBean(Main.class);
        System.out.println("Name = " + main.personService.getPersonName());
    }
}
