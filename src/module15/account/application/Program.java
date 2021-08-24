package module15.account.application;

import module15.account.entities.Account;
import module15.account.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, withdrawLimit);
            account.deposit(initialBalance);

            System.out.print("Enter the amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withDraw(withdraw);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }catch (DomainException e){
            System.out.println(e.getMessage());
        }
    }
}
