package application;

import entities.Income;
import entities.Taxs;
import services.ProcessingService;
import services.TaxIncomeService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double annualIncome = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double annualServiceIncome = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double annualCapitalIncome = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double medicalExpenses = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double educationalExpenses = sc.nextDouble();

        Income ic = new Income(annualIncome, annualServiceIncome, annualCapitalIncome, medicalExpenses, educationalExpenses);

        ProcessingService ps = new ProcessingService(new TaxIncomeService());

        ps.processTax(ic);

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

        for (Taxs taxs : ic.getTaxsList()) {
            System.out.println(taxs);
        }


        sc.close();
    }
}
