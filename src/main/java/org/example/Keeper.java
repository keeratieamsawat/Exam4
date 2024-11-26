package org.example;

public class Keeper implements Info {
    public String name;
    public int phoneNumber;
    public int ID;
    public Keeper(String name, int phoneNumber, int ID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }
    @Override
    public String getName(){
        return name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public int getID(){
        return ID;
    }
}
