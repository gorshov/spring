/**
 * Created by Admin on 08.04.2017.
 */
public class EmailSender implements Isender {

    public void send(Message message, String string) {
        message.send(string);
    }
}
