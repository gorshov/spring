package lessons.second;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 11.04.2017.
 */
@AddressAnnotated
@Getter
@Setter
@Component("iAddress")
public class Address implements IAddress {
    private static Logger logger = Logger.getLogger(Address.class);
    @Value("2")
    private Long id;
    @Value("Pushkina")
    private String street;
    @Value("42")
    private Long home;
  /*  private Collection<String> flats;
    private Set<Object> dwellers;
    private Map<String, Person> personMap;*/

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", home=" + home +
                '}';
    }

    public void getIAddress() {
        System.out.println(street);
    }


}
