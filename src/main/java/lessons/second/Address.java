package lessons.second;

import org.apache.log4j.Logger;

import java.util.Collection;

/**
 * Created by Admin on 11.04.2017.
 */

public class Address implements IAddress {
    private static Logger logger = Logger.getLogger(Address.class);
    private Long id;
    private String street;
    private Long home;
    private Collection<String> flats;

    public Collection<String> getFlats() {
        return flats;
    }

    public void setFlats(Collection<String> flats) {
        this.flats = flats;
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
