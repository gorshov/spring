import lessons.second.Address;
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
        Address address = (Address) context.getBean(Address.class);
        log.info("----------------------------------------------------");
        log.info(address.getHome());
        log.info(address.getStreet());
        for (String result : address.getFlats()) {
            log.info("flats number: " + result);
        }
        ((ClassPathXmlApplicationContext) context).destroy();
    }
}
