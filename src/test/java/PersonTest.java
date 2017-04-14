import lessons.second.Person;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 11.04.2017.
 */
public class PersonTest {
    private static Logger log = Logger.getLogger(PersonTest.class);

    @Test
    public void getInstaceTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("second-config.xml");
        Person person = (Person) context.getBean("person");
        person.perform();
        log.info(person.getSurname());
        /*((ClassPathXmlApplicationContext) context).destroy();*/
        /*Address address = (Address) context.getBean("address");
        log.info("----------------------------------------------------");
        log.info(address.getHome());
        log.info(address.getStreet());
        for (String result : address.getFlats()) {
            log.info("flats number: " + result);
        }

        for (Object res : address.getDwellers()) {
            log.info("Dwellers: " + res);
        }

        for (Map.Entry<String, Person> entry : address.getPersonMap().entrySet()) {
            log.info(entry.getKey() + " : - " + entry.getValue().getName());
        }*/
        log.info(person);
        ((ClassPathXmlApplicationContext) context).destroy();
    }
}
