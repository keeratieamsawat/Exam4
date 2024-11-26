package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Keeper keeper1 = new Keeper("Geoff", 4392,80);
        Lion lion1 = new Lion("Simba", 7,30);
        Drone drone1 = new Drone("Monitor1", 128, 124);
        LocationSystem LocationKeeper = new LocationSystem(keeper1.getID());
        LocationSystem LocationLion = new LocationSystem(lion1.getID());

        }
    }
