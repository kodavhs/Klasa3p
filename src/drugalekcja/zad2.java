package drugalekcja;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj dzien: ");
        int dzien = scanner.nextInt();

        System.out.print("podaj miesiac: ");
        int miesiac = scanner.nextInt();

        System.out.print("podaj 2 ostatnnie cyfry roku: ");
        int rok = scanner.nextInt();

        int iloczyn = dzien * miesiac;



        if(iloczyn == rok){
            System.out.println("data jest magiczna");
        }  else{
            System.out.println("data nie jest magiczna");


        }





    }
}
