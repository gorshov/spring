package lessons.first;

/**
 * Created by Admin on 08.04.2017.
 */
public class SenderService {
    private Isender isender;

    public SenderService() {
    }

    public SenderService(Isender isender) {
        this.isender = isender;
    }

    public void sendMessage(Message message, String string) {

        isender.send(message, string);

    }

    public Isender getIsender() {
        return isender;
    }

    public void setIsender(Isender isender) {
        this.isender = isender;
    }
}
