import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<Message>();
    }

    public void add(Message message) {
        String messageContent = message.getContent();
        int messageLength = messageContent.length();
        if (messageLength <= 280) {
            this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
