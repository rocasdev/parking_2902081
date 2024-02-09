package org.ptech081.parking.entities;

public class Vehicle {
    public String plate;
    public VehicleType vehicleType;

    //Construct method
    public Vehicle() {
    }

    public Vehicle(String plate, VehicleType vehicleType) {
        this.plate = plate;
        this.vehicleType = vehicleType;
    }
}