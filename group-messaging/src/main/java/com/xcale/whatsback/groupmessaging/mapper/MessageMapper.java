package com.xcale.whatsback.groupmessaging.mapper;

import com.xcale.whatsback.groupmessaging.model.MessageDTO;

public class MessageMapper {

    public MessageDTO toMessageDTO(String text, Long userId, Long groupId) {
        return new MessageDTO(text, userId, groupId);
    }

}
