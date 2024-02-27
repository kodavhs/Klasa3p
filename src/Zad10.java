import java.util.Scanner;

public class Zad10
{
    public static void main (String[] args){


        String firstName= "";

      String middleName = "";
        String LastName = "";

        Scanner klawisz = new Scanner(System.in);


        System.out.println("Podaj pierwsze imie: ");
        firstName = klawisz.next();
        klawisz.nextLine();

        System.out.println("Podaj drugie imie: ");
       middleName = klawisz.next();
        klawisz.nextLine();


        System.out.println("Podaj nazwisko: ");
        LastName = klawisz.next();
        klawisz.nextLine();


        char firstInitial = 'o' ;
        char middleInitial = 'j' ;
        char lastInitial = 'c'  ;

        System.out.println(firstInitial);
        System.out.println(middleInitial);
        System.out.println(lastInitial);

    }
}
