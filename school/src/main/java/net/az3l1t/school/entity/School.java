package net.az3l1t.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class School {
    @Id
    private Integer id;
    private String name;
    private String email;

    public School() {
    }

    public School(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public School(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
