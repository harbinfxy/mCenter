package main.message.messagetype;

import main.message.Message;
import main.message.MessageType;

/**
 * Created by fanxingyu on 2019/8/5.
 */
public class HiMessage extends Message {

    public HiMessage(String sendPerson, String receivePerson, String messageContent) {
        this.sendPerson = sendPerson;
        this.receivePerson = receivePerson;
        this.messageContent = messageContent;
        this.type = MessageType.Hi.toString();
    }
}
