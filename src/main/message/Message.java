package main.message;

/**
 * Created by fanxingyu on 2019/8/5.
 */
public abstract class Message {
    protected String sendPerson;
    protected String receivePerson;
    protected String messageContent;
    protected String type;

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.type + "{messageContent='" + messageContent + "\', sendPerson='"
                + sendPerson + "\', receivePerson='" + receivePerson + "\'}";
    }
}
