package com.xcale.whatsback.groupmessaging.service;

import com.xcale.whatsback.groupmessaging.dao.GroupDao;
import com.xcale.whatsback.groupmessaging.dao.model.Group;
import com.xcale.whatsback.groupmessaging.dao.model.User;
import com.xcale.whatsback.groupmessaging.model.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupService {

    @Autowired
    private GroupDao groupDao;

    @Autowired
    private UserService userService;

    public void notify(MessageDTO messageDTO) {
        userService.notify(
                findBy(messageDTO.getGroupId()),
                messageDTO
            );
    }

    private Group findBy(Long id) {
        return groupDao.findBy(id);
    }

}
