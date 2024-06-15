import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator 2 wartości");


        double a=0;
        double b=0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Podaj pierwszą wartość");
                a = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawną wartość! Spróbuj ponownie.");
                scanner.next();
            }
        }validInput = false;


        System.out.println("Podaj znak operacji arytmetycznej: +,-,*,/ ");
        String x = scanner.next();
        char znak = x.charAt(0);



        while (!validInput) {
            try {
                System.out.println("Podaj drugą wartość");
                b = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawną wartość! Spróbuj ponownie.");
                scanner.next();
            }
        }validInput = false;



        if (znak == '+') {
            System.out.println("Wynik tego działania to: " + (a + b));
        } else if (znak == '-') {
            System.out.println("Wynik tego działania to: " + (a - b));
        } else if (znak == '*') {
            System.out.println("Wynik tego działania to: " + (a * b));
        } else if (znak == '/') {

            if (b == 0) {
                System.out.println("Nie można dzielić przez 0!");
            } else {
                System.out.println("Wynik tego działania to: " + (a / b));
            }
        } else {
            System.out.println("Wprowadzono niepoprawny znak arytmetyczny!");
        }


    }

}
