package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class EmployeePayRollImpl {
    private List<EmployeePayRollData> employeePayRollDataList;

    public EmployeePayRollImpl(List<EmployeePayRollData> employeePayRollDataList){
        this.employeePayRollDataList = employeePayRollDataList;
    }
    public void readEmployeePayRollData(Scanner consoleInputReader){
        System.out.println("Enter Employee-Id : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee-Name : ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee-Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayRollDataList.add(new EmployeePayRollData(id, name, salary));
    }

    public void writeEmployeePayRollData(){
        System.out.println("\nWriting Employee Payroll To Console:\n" + employeePayRollDataList);
    }
}
