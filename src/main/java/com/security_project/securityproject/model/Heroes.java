package com.security_project.securityproject.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "heroes")
public class Heroes {

    @Id
    private int id;
    private String name;
    private String alias;
    private String powers;
    @Column(name = "image")
    private String image;

    public Heroes() {}
    public Heroes(int id, String name, String alias, String powers, String image) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.powers = powers;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", powers='" + powers + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
