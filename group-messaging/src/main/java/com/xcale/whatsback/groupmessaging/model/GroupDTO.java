package com.xcale.whatsback.groupmessaging.model;

import com.xcale.whatsback.groupmessaging.dao.model.Group;

public class GroupDTO {

    private Long id;
    private String name;
    private String description;

    public GroupDTO() {
    }

    public GroupDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static GroupDTO from(Group group) {
        return new GroupDTO(group.getId(), group.getName(), group.getDescription());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
