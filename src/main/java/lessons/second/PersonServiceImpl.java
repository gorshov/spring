package lessons.second;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 14.04.2017.
 */

@Getter
@Setter
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;

    public String getPersonName() {
        return person.getName();
    }
}
