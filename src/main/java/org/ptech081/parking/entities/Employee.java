package org.ptech081.parking.entities;

public class Employee {
    public String name;
    public String lastName;
    public Long id;


    public Employee() {
    }


    public Employee(String name, String lastName, Long id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
}
