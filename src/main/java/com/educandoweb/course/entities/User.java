package com.educandoweb.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    // adicionar atributos da entidade

    @Id // pra dizer pro JPA que essa é a chave primária no bd
    @GeneratedValue(strategy = GenerationType.IDENTITY) // configuração de auto incremento
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String passoword;

    // gerar construtores :
    public User() {

    }

    public User(Long id, String name, String email, String phone, String passoword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passoword = passoword;
    }

    // gerar os métodos de acesso :


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    // implementar hashCode e equals :

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
