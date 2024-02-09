package org.ptech081.parking;

import org.ptech081.parking.entities.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.plate = "ASD456";
        vehicle1.vehicleType = VehicleType.CAMIONETA;
        Vehicle vehicle2 = new Vehicle("ABC123", VehicleType.MOTO);

        //Crear Clientes

        Customer customer1 = new Customer("Daniel", "Gallo", 1019028401L);
        Customer customer2 = new Customer();
        customer2.name = "Andres";
        customer2.lastName = "Meza";
        customer2.dni = 1117964715L;

        customer1.addCar(vehicle2);
        customer2.addCar("ERT789", VehicleType.BUS);

        //RECORRER LOS CARROS DEL CLIENTE 

        for( Vehicle v : customer1.myVehicles){
            System.out.println("----------------------\n placa: " + v.plate + " / tipo: " + v.vehicleType + "\n----------------------\n");
        }
    }
}