package drugalekcja;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj wynik 1 testu w %");
        double procent1 = scanner.nextInt();





        System.out.print("podaj wynik 2 testu w %");
        double procent2 = scanner.nextInt();

        System.out.print("podaj wynik 3 testu w %");
        double procent3 = scanner.nextInt();

    double procent = (procent1 + procent2 + procent3) / 3;

    int ocena;

        if (procent<=100 && procent >= 90 ){
            ocena = 5;
        }
        else if (procent<=89 && procent >= 80){
             ocena = 4;
        }
        else if(procent<=79 && procent >= 70){
             ocena = 3;
        }
        else if (procent <= 69 && procent >= 60){
             ocena = 2;
        }
        else if(procent < 60){
             ocena = 1;
        }
        else{
             ocena = 0;
            System.out.print("nieprawidlowy procent");
        }



        System.out.print("Ocena:" + ocena);
    }
}
