package com.ra.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "gender")
    private Boolean gender;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<UserRole> userRoles;

    public User() {

    }

    public User(Long id, String userName, String passWord, Boolean enabled, String fullName, Boolean gender, String address, String email, String telephone, Set<UserRole> userRoles) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.enabled = enabled;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.userRoles = userRoles;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getFullName() {
        return fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
