package lessons.second;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.Set;

/**
 * Created by Admin on 11.04.2017.
 */
public class Person implements InitializingBean, DisposableBean {
    private static Logger logger = Logger.getLogger(Person.class);
    private Long id;
    private String name;
    private String surname;
    private Address iAddress;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public IAddress getiAddress() {
        return iAddress;
    }


    public void setiAddress(Address iAddress) {
        this.iAddress = iAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
