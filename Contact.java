package com.androidlime.app.project;

/**
 * Created by Mithun on 12/6/2018.
 */

public class Contact {


    private String name;

    private String phnnumber;

    private String email;


    public Contact(String name, String phnnumber, String email) {
        this.name = name;
        this.phnnumber = phnnumber;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhnnumber() {
        return phnnumber;
    }

    public void setPhnnumber(String phnnumber) {
        this.phnnumber = phnnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phnnumber='" + phnnumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
