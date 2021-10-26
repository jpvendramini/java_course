package module20.exercicio.application;

import module20.exercicio.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();
        List<Employee> employees = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null){
                String lines[] = line.split(",");
                employees.add(new Employee(lines[1], lines[0], Double.parseDouble(lines[2])));
                line = reader.readLine();
            }
            System.out.println("Email of people whose salary is more than " + salary);
            List<String> names = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .collect(Collectors.toList());
            names.forEach(System.out::println);
            Double sum = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
