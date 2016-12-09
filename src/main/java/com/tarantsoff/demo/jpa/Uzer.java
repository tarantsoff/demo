package com.tarantsoff.demo.jpa;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by ozzy on 12/8/16.
 */
@Entity
public class Uzer {
    private String login;
    private int id;
    private Collection<Post> posts;

    @Basic
    @Column(name = "login", nullable = false, insertable = true, updatable = true, length = 100)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uzer uzer = (Uzer) o;

        if (id != uzer.id) return false;
        if (login != null ? !login.equals(uzer.login) : uzer.login != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }

    @OneToMany(mappedBy = "author")
    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }
}
