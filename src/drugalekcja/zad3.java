package drugalekcja;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj wage w kg: ");
        int waga = scanner.nextInt();

        System.out.print("podaj wzrost w m: ");
        double wzrost = scanner.nextDouble();

        double BMI = waga / (wzrost*wzrost);

        if (BMI < 18.5) {
            System.out.print("niedowaga");
        }
        else if (BMI > 18.5 && BMI < 25) {
            System.out.print("waga prawidlowa");
        }
        else {
            System.out.print("nadwaga");
        }
    }
}





