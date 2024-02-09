package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public String lastName;
    public Long dni;
    public List<Vehicle> myVehicles;

    public Customer() {
        this.myVehicles = new ArrayList<Vehicle>();
    }

    public Customer(String name, String lastName, Long dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.myVehicles = new ArrayList<Vehicle>();
    }

    public void addCar(Vehicle v){
        this.myVehicles.add(v);
    }

    //sEGUNDA SOBRE CARGA   

    public void addCar(String plate, VehicleType tv){
        Vehicle vehicle = new Vehicle(plate,tv);
        this.myVehicles.add(vehicle);
    }
}