package com.xcale.whatsback.groupmessaging.controller;

import com.xcale.whatsback.groupmessaging.mapper.MessageMapper;
import com.xcale.whatsback.groupmessaging.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private static MessageService messageService;

    @Autowired
    private static MessageMapper messageMapper;

    // TODO: Handleo de errores en Controller
    @PostMapping
    public static void postMessage(
            @RequestParam(value = "text") String text,
            @RequestParam(value = "userId") Long userId,
            @RequestParam(value = "groupId") Long groupId
    ) {
        messageService.postMessage(messageMapper.toMessageDTO(text, userId, groupId)); // No pongo los this., pero lo haría dependiendo de la convención de cada equipo
    }

}
