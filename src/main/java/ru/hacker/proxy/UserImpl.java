package ru.hacker.proxy;

public class UserImpl implements User {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void rename(String newName) {
        if(!newName.equals(name)){
            this.name = newName;
        }
    }
}