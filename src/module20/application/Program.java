package module20.application;

import module20.domain.Product;
import module20.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String args[]){
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 988.00));
        products.add(new Product("Skate", 170.98));
        products.add(new Product("Shampoo", 15.50));
        products.add(new Product("Helicopter", 26.50));
        products.add(new Product("Touca", 70.50));

        List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
