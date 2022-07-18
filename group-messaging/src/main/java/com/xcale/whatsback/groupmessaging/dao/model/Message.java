package com.xcale.whatsback.groupmessaging.dao.model;

import com.xcale.whatsback.groupmessaging.model.MessageDTO;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    private Long id;
    private String text;

    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(name = "group_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Group group;

    public Message() {
    }

    public Message(String text, User user, Group group) {
        this.text = text;
        this.user = user;
        this.group = group;
    }

    public static Message from(MessageDTO messageDTO) {
        return new Message(
                messageDTO.getText(),
                User.from(messageDTO.getUserId()),
                Group.from(messageDTO.getGroupId())
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
