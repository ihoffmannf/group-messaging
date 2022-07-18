package com.xcale.whatsback.groupmessaging.service;

import com.xcale.whatsback.groupmessaging.dao.MessageDao;
import com.xcale.whatsback.groupmessaging.dao.model.Message;
import com.xcale.whatsback.groupmessaging.exception.UnprocessableEntityException;
import com.xcale.whatsback.groupmessaging.model.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    @Autowired
    private MessageDao messageDao;

    @Autowired
    private GroupService groupService;

    private final Long TEXT_LENGHT = 140L; // TODO: Podría asignarse desde un archivo de property

    public void postMessage(MessageDTO message) {
        validate(message);
        messageDao.save(Message.from(message));
        groupService.notify(message);
    }

    private void validate(MessageDTO message) {
        if (message.getText().length() > TEXT_LENGHT)
            throw new UnprocessableEntityException("El largo del mensaje excede el límite de " + TEXT_LENGHT + "caracteres");
        if (message.getText().isEmpty())
            throw new UnprocessableEntityException("El mensaje no puede estar vacío");
        // TODO: Más validaciónes de negocio...
    }

}
