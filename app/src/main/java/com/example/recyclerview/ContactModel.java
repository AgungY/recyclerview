package com.example.recyclerview;

import java.io.Serializable;
import java.security.PublicKey;

public class ContactModel implements Serializable{
    public  String color;
    public String nama;

    public ContactModel(String color, String nama, String hp, String status) {
        this.color = color;
        this.nama = nama;
        this.hp = hp;
        this.status = status;
    }

    public String hp;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String status;

}
