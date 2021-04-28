package part6.object_in_a_list.message_service;

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> msg;

    public MessagingService(){
        this.msg = new ArrayList<>();
    }

    public void add(Message msg){
        if(msg.getContent().length() <= 280){
            this.msg.add(msg);
        }
    }

    public ArrayList<Message> getMessage(){
        return msg;
    }
}
