package com.xcale.whatsback.groupmessaging.model;

public class MessageDTO {

    private Long id;
    private String text;
    private Long userId;
    private Long groupId;

    public MessageDTO(Long id, String text, Long userId, Long groupId) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.groupId = groupId;
    }

    public Long getId() { return id; }

    public String getText() {
        return text;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getGroupId() {
        return groupId;
    }

}
