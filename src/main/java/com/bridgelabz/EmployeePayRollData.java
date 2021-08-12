package com.bridgelabz;

public class EmployeePayRollData {
    public int id;
    public String name;
    public double salary;

    @Override
    public String toString() {
        return "EmployeePayRollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeePayRollData(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;


    }
}
