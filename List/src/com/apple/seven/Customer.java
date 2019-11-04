package com.apple.seven;

public class Customer {
    private String password;
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String password,String name){
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.password + "," + this.name;
    }
}
