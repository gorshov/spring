package lessons.second;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Admin on 11.04.2017.
 */
@Getter
@Setter
@Component
public class Person implements InitializingBean, DisposableBean {

    private static Logger logger = Logger.getLogger(Person.class);
    @Value("1")
    private Long id;
    @Value("Kirk")
    private String name;
    @Value("Hammet")
    private String surname;
    /*@Autowired*/
    /*@Qualifier("companyAddress")
    */
    /*@Inject*/
    /*@Company*/
    /*@Named("secondAddress")*/
    /*@Value("#{iAddress}")*/
    @Autowired(required = false)
    private IAddress iAddress;

    /*private Address iAddress;*/
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", iAddress=" + iAddress +
                '}';
    }

    /* public IAddress getiAddress() {
        return iAddress;
    }*/


    public void perform() {
        System.out.println("Hello " + name);
    }

    public void initMethod() {
        logger.info("Initialization Person xml-method");
    }

    public void destroyMethod() {
        logger.info("Destroy Person with xml-method");
    }

    @PreDestroy
    public void destroyAnnotation() throws Exception {
        logger.info("Destroy Person annotation method");
    }

    @PostConstruct
    public void init() {
        logger.info("Initialization of Person with annotation method");
    }

    public void destroy() throws Exception {
        logger.info("Destroy Person implements method");
    }

    public void afterPropertiesSet() throws Exception {
        logger.info("Initialization Person with implement method");
    }
}
