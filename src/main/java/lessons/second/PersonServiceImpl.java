package lessons.second;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 14.04.2017.
 */
@Service
@Getter
@Setter
public class PersonServiceImpl implements PersonService {
    private Person person;

    public String getPersonName() {
        return person.getName();
    }
}
