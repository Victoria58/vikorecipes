package com.vikorecipes.vikorecipes.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "public", catalog = "ViKoReciPeS")
public class UsersEntity {
    private int id;
    private String login;
    private String userPassword;
    private String email;
    private String nickname;
    private String userRole;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login", nullable = false, length = -1)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "user_password", nullable = false, length = -1)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "email", nullable = false, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "nickname", nullable = false, length = -1)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "user_role", nullable = false, length = -1)
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return id == that.id &&
                Objects.equals(login, that.login) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(email, that.email) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(userRole, that.userRole);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, login, userPassword, email, nickname, userRole);
    }
}
