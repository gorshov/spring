package lessons.second;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 14.04.2017.
 */
@Getter
@Setter
public class CompanyAddress implements IAddress {
    private Long id;
    private Long home;
    private String street;
    private String email;


    @Override
    public String toString() {
        return "CompanyAddress{" +
                "id=" + id +
                ", home=" + home +
                ", street='" + street + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void getIAddress() {

    }
}
