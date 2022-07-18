package com.xcale.whatsback.groupmessaging.dao;


import com.xcale.whatsback.groupmessaging.dao.model.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageDao {
    public void save(Message message) {
        message.save(); // TODO: Persistencia JPA
    }
}
