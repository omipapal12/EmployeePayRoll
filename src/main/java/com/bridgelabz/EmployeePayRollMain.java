package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayRollMain {
    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayRollDataList = new ArrayList<>();
        EmployeePayRollImpl employeePayRollImpl = new EmployeePayRollImpl(employeePayRollDataList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayRollImpl.readEmployeePayRollData(consoleInputReader);
        employeePayRollImpl.writeEmployeePayRollData();
    }
}
