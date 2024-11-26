package org.example;

import java.awt.*;
import java.util.Objects;


public class DistanceAlert {
    private Point LocationKeeper;
    private Point LocationLion;
    private Point LocationDrone;
    private int DistanceKL;

    public DistanceAlert(LocationSystem locationSystem) {
        Point LocationKeeper = new Point(Objects.requireNonNull(LocationSystem.getCoords(Keeper.getID())));
        Point LocationLion = new Point(Objects.requireNonNull(LocationSystem.getCoords(Lion.getID())));
        Point LocationDrone = new Point(Objects.requireNonNull(LocationSystem.getCoords(Drone.getID())));

        int DistanceKL = (int) Math.hypot(LocationKeeper, LocationLion);

        this.LocationKeeper = LocationKeeper;
        this.LocationLion = LocationLion;
        this.LocationDrone = LocationDrone;
        this.DistanceKL = DistanceKL;

        if (DistanceKL < 60 ) {
            System.out.println("DistanceKL less than 60");
            AlertSystem.alertAKeeper(Keeper.getPhoneNumber());
            AlertSystem.alertADrone(Drone.getRadiofreq());

        }


    }
}
