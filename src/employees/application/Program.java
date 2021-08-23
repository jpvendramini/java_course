package employees.application;

import employees.entities.Employee;
import employees.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();

        for (int i =1; i<=n;i++){
            System.out.println("Employee #"+i+" data:");
            System.out.print("Outsourced (y/n)?");
            char ch = scanner.next().charAt(0);
            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Hours: ");
            int hours = scanner.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if(ch == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employeeList.add( new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }else{
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp : employeeList){
            System.out.println( emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
        }
        scanner.close();
    }
}
