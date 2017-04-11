package lessons.second;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import sun.rmi.runtime.Log;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Admin on 11.04.2017.
 */
public class Person {
    private static Logger logger = Logger.getLogger(Person.class);
    private Long id;
    private String name;
    private String surname;
    private Address iAddress;

    public IAddress getiAddress() {
        return iAddress;
    }

    public void init() {
        logger.info(" initialization of Person");
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


    public void destroy() throws Exception {
        logger.info("destroy Person finished");
    }

}
