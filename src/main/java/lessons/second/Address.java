package lessons.second;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Admin on 11.04.2017.
 */

public class Address implements IAddress {
    private static Logger logger = Logger.getLogger(Address.class);
    private Long id;
    private String street;
    private Long home;

    public void init(){
        logger.info("start init Address");
    }

    public void destroy(){
        logger.info("destroy finished Address");
    }

    public void getIAddress() {
        System.out.println(street);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getHome() {
        return home;
    }

    public void setHome(Long home) {
        this.home = home;
    }

}
