package lessons.second;

import org.apache.log4j.Logger;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 11.04.2017.
 */

public class Address implements IAddress {
    private static Logger logger = Logger.getLogger(Address.class);
    private Long id;
    private String street;
    private Long home;
    private Collection<String> flats;
    private Set<Object> dwellers;
    private Map<String, Person> personMap;

    public Map<String, Person> getPersonMap() {
        return personMap;
    }

    public void setPersonMap(Map<String, Person> personMap) {
        this.personMap = personMap;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", home=" + home +
                ", flats=" + flats +
                ", dwellers=" + dwellers +
                ", personMap=" + personMap +
                '}';
    }

    public Set<Object> getDwellers() {
        return dwellers;
    }

    public void setDwellers(Set<Object> dwellers) {
        this.dwellers = dwellers;
    }

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
