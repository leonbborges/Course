package com.example.Course.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long ïd;
     private String name;
     private String email;
     private String phone;
     private String password;

     @JsonIgnore
     @OneToMany(mappedBy = "client")
     public List<Order> orders = new ArrayList<>();

    public User() {
    }

    public User(Long ID, String name, String email, String phone, String password) {
        super();
        this.ïd = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Long getÏd() {
        return ïd;
    }

    public void setÏd(Long ïd) {
        this.ïd = ïd;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ïd.equals(user.ïd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ïd);
    }

}
