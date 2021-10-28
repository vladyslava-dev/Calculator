package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static double a;
    private static double b;

    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        System.out.print("Podaj pierwszą liczbę: ");
        try {
            a = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Wartość musi być liczbą");
            checkIfContinue();
        }
        System.out.print("Jaką operację chcesz wykonać? Wpisz +, -, *, /, % (dla resztki od dzielenia), ** (dla potęgi) lub 'pierwiastek': ");
        scanner.nextLine();
        String operation = scanner.nextLine();
        

        if (!Objects.equals(operation, "pierwiastek")) {
            System.out.print("Podaj drugą liczbę: ");
            try {
                b = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Wartość musi być liczbą");
                checkIfContinue();
            }
        }


        if (Objects.equals(operation, "+")) {
            double result = a + b;
            System.out.println(a + " " + operation + " " + b + " " + "=" + " " + result);
            checkIfContinue();
        } else if (Objects.equals(operation, "-")) {
            double result = a - b;
            System.out.println(a + " " + operation + " " + b + " " + "=" + " " + result);
            checkIfContinue();
        } else if (Objects.equals(operation, "*")) {
            double result = a * b;
            System.out.println(a + " " + operation + " " + b + " " + "=" + " " + result);
            checkIfContinue();
        } else if (Objects.equals(operation, "/")) {
            if (b == 0) {
                System.out.println("You cannot divide by 0");
            } else {
                double result = a / b;
                System.out.println(a + " " + operation + " " + b + " " + "=" + " " + result);
            }
            checkIfContinue();
        } else if (Objects.equals(operation, "%")) {
            if (b == 0) {
                System.out.println("You cannot divide by 0");
            } else {
                double result = a % b;
                System.out.println("Resztka od dzielenia " + a + " przez " + b + " równa się " + result);
            }
            checkIfContinue();
        } else if (Objects.equals(operation, "**")) {
            if (a == 0 && b == 0) {
                System.out.println("Wyrażenie nie ma sensu");
            } else {
                double result = Math.pow(a, b);
                System.out.println(a + " " + "^" + " " + b + " " + "=" + " " + result);
            }
            checkIfContinue();
        }
        else if (Objects.equals(operation, "pierwiastek")) {
            if (a < 0) {
                System.out.println("W zakresie liczb rzeczywistych parzysty pierwiastek liczby ujemnej nie istnieje ");
            } else {
                double result = Math.sqrt(a);
                System.out.println("Pierwiastek kwadratowy z " + a + " wynosi " + result);
            }
            checkIfContinue();
        }
        else {
            System.out.println("Nie mogę wykonać tej operacji. Wybierz operację z listy dostępnych.");
            checkIfContinue();
        }

    }


    private static void checkIfContinue() {
        System.out.println("Czy chcesz wykonać inną operację? Wpisz 'tak' lub 'nie' ");
        scanner.nextLine();
        String ifContinue = scanner.nextLine();
        if (Objects.equals(ifContinue, "tak")) {
            calculator();
        }


    }
}