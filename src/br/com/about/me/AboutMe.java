package br.com.about.me;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // criando o obj scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Type your name");
            String name = scanner.next();

            System.out.println("Type your last name");
            String lastname = scanner.next();

            System.out.println("Type your age");
            int age = scanner.nextInt();

            System.out.println("Type your height");
            double height = scanner.nextDouble();


            // Imprimindo os dados obtidos pelo usuario
            System.out.println("Hello, My name is " + name.toUpperCase() + " " + lastname);
            System.out.println("Have " + age + " " + " age ");
            System.out.println("My height is " + height + "cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("The age and height field must be numeric");
        }
    }
}
