package com.github.sunxikai928.prototype;

/**
 * Created by sunxikai on 18/12/24.
 */
public class User implements Cloneable {

    private String name;
    public Panda panda;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCloneUSer() throws CloneNotSupportedException {
        return (User) clone();
    }
}
