package br.struts2.annotation.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by allan on 23/08/16.
 */

@Entity
@Table(name = "userdetail",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"id"}))
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Column(name = "age")
    @Getter
    @Setter
    private int age;
}
