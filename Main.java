import java.util.InputMismatchException;
import java.util.Scanner;


        public class Main{
public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Kalkulator 2 wartości");
    try{
        System.out.println("Podaj pierwszą wartość");
            double a = scanner.nextDouble();
        System.out.println("Podaj znak operacji arytmetycznej: +,-,*,/ ");
            String x = scanner.next();
            char znak = x.charAt(0);
        System.out.println("Podaj drugą wartość");
            double b = scanner.nextDouble();

        if (znak == '+'){
            System.out.println("Wynik tego działania to: " + (a+b));
        }else if (znak == '-'){
            System.out.println("Wynik tego działania to: " + (a-b));
        }else if (znak == '*'){
            System.out.println("Wynik tego działania to: " + (a*b));
        }else if(znak == '/'){
            if(b==0){
                System.out.println("Nie można dzielić przez 0!");
            }else{
                System.out.println("Wynik tego działania to: " + (a/b));
            }
        }else{
            System.out.println("Wprowadzono niepoprawny znak arytmetyczny!");
        }
    }catch (InputMismatchException e){
        System.out.println("Wprowadzono niepoprawną wartość! Spróbuj ponownie.");
    }finally {
        scanner.nextLine();
        System.out.println("Naciśnij Enter aby zakończyć program!");
        scanner.nextLine();
        scanner.close();
    }
    System.out.println("Program zakończył działanie!");
}
}
