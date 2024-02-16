package org.ptech081.parking.entities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Register {

    //Class Attributes
    public LocalDate startDate;
    public LocalTime startTime;
    public LocalDate endDate;
    public LocalTime endTime;
    public Long cost;
    
    //Relational Attributes
    public Slot slot;
    public Vehicle vehicle;
    public Employee employee;
    public Customer customer;
    
    //Construct Methods
    public Register() {
    }

    public Register(LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime, Long cost,
            Slot slot, Vehicle vehicle, Employee employee, Customer customer) {
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.cost = cost;
        this.slot = slot;
        this.vehicle = vehicle;
        this.employee = employee;
        this.customer = customer;
    }
    
}
