package com.splitwork.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Main entity who will perform various work such as cleaning,cooking,
//vesel washing, bathroom cleaning.



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    private long phoneNumber;
    private String mail;
    private String Address;
    private String work;

    
}
