package module14.contribuintes.application;

import module14.contribuintes.entities.Pessoa;
import module14.contribuintes.entities.PessoaFisica;
import module14.contribuintes.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        List<Pessoa> pessoaList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)?");
            char option = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            Double annualIncome = sc.nextDouble();
            if(option == 'i'){
                System.out.print("Health expenditures: ");
                Double health = sc.nextDouble();
                pessoaList.add(new PessoaFisica(name,annualIncome,health));
            }else{
                System.out.print("Number of module14.employees: ");
                int funcionarios = sc.nextInt();
                pessoaList.add(new PessoaJuridica(name, annualIncome, funcionarios));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID");
        for (Pessoa pessoa : pessoaList){
            System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", pessoa.calculaImposto()));
        }

    }
}
