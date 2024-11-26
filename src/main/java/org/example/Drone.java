package org.example;

public class Drone implements Info{
    public String name;
    public int radiofreq;
    public int ID;

    public Drone(String name, int radiofreq, int ID) {
        this.name = name;
        this.radiofreq = radiofreq;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public int getRadiofreq() {
        return radiofreq;

    }
    public int getID() {
        return ID;
    }

}
