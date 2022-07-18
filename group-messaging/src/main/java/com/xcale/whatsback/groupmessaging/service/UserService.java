package com.xcale.whatsback.groupmessaging.service;

import com.xcale.whatsback.groupmessaging.dao.model.Group;
import com.xcale.whatsback.groupmessaging.dao.model.User;
import com.xcale.whatsback.groupmessaging.model.MessageDTO;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void notify(Group group, MessageDTO messageDTO) {
        group.getUsers().forEach(user -> notify(user, messageDTO, group) );
    }

    public void notify(User user, MessageDTO messageDTO, Group group) {
        // En este punto podría enviarse un mensaje a algún tópico de kafka, para no realizar de forma sincrónica este proceso, ya que no es algo fundamental en el flujo

        // El mensaje de kafka podría ser consumido para enviar alguna push notification
        // al deviceId del User (no tiene ese atributo, habría que agregarlo o ver si corresponde que el objeto de user lo tenga)
        // El front-end podría consumir el mensaje y mostrar algo similar al siguiente formato:

        /*

        group.name: (user.name + user.surname) - messageDTO.getText()
        Ej.: Grupo amigos: Juan Pérez - Hola Mundo!

         */

        // También podría implementarse un patrón Observer para la lógica de notificaciones, siendo los usuarios los observadores que desean ser notificados
    }

}
