package com.xcale.whatsback.groupmessaging.dao.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Group {

    @Id
    private Long id;
    private String name;
    private String description;

    @JoinColumn(name = "user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<User> users;

    public Group() {
    }

    public Group(Long id) {
        this.id = id;
    }

    public Group(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static Group from(Long groupId) {
        return new Group(groupId);
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
