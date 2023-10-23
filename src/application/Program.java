package application;
import entities.Employee;
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

        for (int i = 0; i < number; i++){
            System.out.println("Employee #"+(i+ 1) + " data: ");
            
        }




    }
}