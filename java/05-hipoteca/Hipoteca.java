package io.ferclager;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Hipoteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("es", "ES");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);

        System.out.println("Introduce el total del préstamo (principal)");
        double principal = scanner.nextDouble();
        System.out.println("Introduce la tasa de intéres anual");
        double annualRate = scanner.nextDouble();
        System.out.println("Introduce el plazo del préstamo en años");
        int years = scanner.nextInt();

        double monthlyRate = (annualRate / 100) / 12;
        int totalPayments = years * 12;

        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) /
                (Math.pow(1 + monthlyRate, totalPayments) - 1);

        System.out.println("Pago mensual: " + currencyInstance.format(monthlyPayment));
        System.out.println("Pago total: " + currencyInstance.format(monthlyPayment * totalPayments));

        System.out.println("Tabla de amortización:");
        System.out.printf("%-5s %-12s %-12s %-12s %-12s%n",
                "Mes", "Pago", "Interés", "Principal", "Saldo");

        double balance = principal;
        for (int month = 1; month <= totalPayments; month++) {
            double interes = balance * monthlyRate;
            double principalPayment = monthlyPayment - interes;
            balance = balance - principalPayment;

            if (balance < 0.01) balance = 0;
            System.out.printf("%-5s %-12s %-12s %-12s %-12s%n",
                    month,
                    currencyInstance.format(monthlyPayment),
                    currencyInstance.format(interes),
                    currencyInstance.format(principalPayment),
                    currencyInstance.format(balance));
        }
    }
}