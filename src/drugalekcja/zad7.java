package drugalekcja;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz imie 1 ");
        String imie1 = scanner.nextLine();

        System.out.println("wpisz imie 2 ");
        String imie2 = scanner.nextLine();

        System.out.println("wpisz imie 3 ");
        String imie3 = scanner.nextLine();

        if(imie1.charAt(0)< imie2.charAt(0) && imie1.charAt(0) < imie3.charAt(0)){

            if (imie2.charAt(0) < imie3.charAt(0)) {
                System.out.println(imie1);
                System.out.println(imie2);
                System.out.println(imie3);
            } else{
                System.out.println(imie1);
                System.out.println(imie3);
                System.out.println(imie2);
            }

        }
        else if(imie2.charAt(0)< imie1.charAt(0) && imie2.charAt(0) <imie3.charAt(0)){

            if (imie1.charAt(0) < imie3.charAt(0)) {
                System.out.println(imie2);
                System.out.println(imie1);
                System.out.println(imie3);
            } else{
                System.out.println(imie2);
                System.out.println(imie3);
                System.out.println(imie1);
            }
        }

        else if (imie3.charAt(0)< imie1.charAt(0) && imie3.charAt(0)<imie2.charAt(0)){

            if (imie1.charAt(0) < imie2.charAt(0)) {
                System.out.println(imie3);
                System.out.println(imie1);
                System.out.println(imie2);
            } else{
                System.out.println(imie3);
                System.out.println(imie2);
                System.out.println(imie1);
            }
        }

    }



}
