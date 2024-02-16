package org.ptech081.parking;

import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creating Vehicles
        Vehicle vehicle1 = new Vehicle();
        vehicle1.plate = "ASD456";
        vehicle1.vehicleType = VehicleType.CAMIONETA;
        Vehicle vehicle2 = new Vehicle("ABC123", VehicleType.MOTO);

        //Creating Customers
        Customer customer1 = new Customer("Daniel", "Gallo", 1019028401L);
        Customer customer2 = new Customer();
        customer2.name = "Andres";
        customer2.lastName = "Meza";
        customer2.dni = 1117964715L;

        //Adding Vehicles to Customers
        customer1.addCar(vehicle2);
        customer2.addCar("ERT789", VehicleType.BUS);

        //Creating Slots
        Slot slot1 = new Slot('A');
        Slot slot2 = new Slot('B');

        //Vehicles Register
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDate endDate1 = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime endTime1 = LocalTime.of(11,30,0);
        LocalDate endDate2 = LocalDate.of(2024, Month.FEBRUARY, 20);
        LocalTime endTime2 = LocalTime.of(8,40,0);

        //Register List

        List<Register> myRegisters = new ArrayList<>(); 

        //Creating first register
        Register register1 = new Register(currentDate, currentTime, endDate1, endTime1, 5000L, slot1, customer1.myVehicles.get(0), customer1);
        Register register2= new Register(currentDate, currentTime, endDate2, endTime2, 3000L, slot1, customer1.myVehicles.get(0), customer1);

        //Adding registers to registers list
        myRegisters.add(register1);
        myRegisters.add(register2);

        System.out.println("======================= LISTA DE REGISTROS =======================");
        for(Register r : myRegisters){
            System.out.println("------------------------------------------------------------------");
            System.out.println("Registro: \n");
            System.out.println("Cliente: "+r.customer.name + " " + r.customer.lastName);
            System.out.println("Vehiculo: "+r.vehicle.vehicleType + " | Placa: "+r.vehicle.plate);
            System.out.println("Fecha de Inicio: "+r.startDate+"\nHora de Inicio: "+r.startTime);
            System.out.println("Fecha de Salida: "+r.endDate+"\nHora de Salida: "+r.endTime);
            System.out.println("Precio: "+r.cost);
            System.out.println("------------------------------------------------------------------");
        }

    }
}