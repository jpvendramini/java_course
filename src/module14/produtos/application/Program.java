package module14.produtos.application;

import module14.produtos.entities.ImportedProduct;
import module14.produtos.entities.Product;
import module14.produtos.entities.UserProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        List<Product> productList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");

        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Product #"+i+" data:");
            System.out.println("Commom, used or imported (c/u/i)?");
            char option = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(option == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.nextLine();
                productList.add(new UserProduct(name, price, manufactureDate));
            }else if(option == 'i'){
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customFee));
            }else{
                productList.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product product : productList){
            System.out.println(product.priceTag());
        }
    }
}
