package application;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of  Employees");
        int number = input.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= number; i++){
            input.nextLine();
            System.out.println("Employee #"+i+  " data: ");
            System.out.println("Outsourced? (Y/N)");
            char response = input.next().charAt(0);
            System.out.println("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Hours: ");
            int hours = input.nextInt();
            System.out.println("value per hour: ");
            double valuePerHour = input.nextDouble();
            if (response == 'y'){
                System.out.println("additional charge: ");
                double additionalCharge = input.nextDouble();
                list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }else {
                list.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : list){
            System.out.println(emp.getName() +"- $"+ emp.payment());
        }
        input.close();
    }
}