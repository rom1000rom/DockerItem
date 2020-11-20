package com.rom1000rom.entity;




import lombok.*;
import javax.persistence.*;


@Setter
@Getter
@ToString
@Entity
public class Item {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Item() {
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
