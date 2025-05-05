package com.security_project.securityproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(name = "pass", nullable = false)
    private String pass;

    public User() {

    }

    public User(int id, String username, String pass) {
        this.id = id;
        this.username = username;
        this.pass = pass;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String password) {
        this.pass = password;
    }


    // toString()
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + pass + '\'' +
                '}';
    }
}
