import java.util.Scanner;

public class Zad14 {

    public static void main(String[] args) {

        int Test1=1;
        int Test2=1;
        int Test3=1;

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wpisz wyniki trzech testow: ");
        Test1 = klawisz.nextInt();
        klawisz.nextLine();

        Test2= klawisz.nextInt();
        klawisz.nextLine();

        Test3= klawisz.nextInt();
        klawisz.nextLine();

        double srednia = ((Test1 + Test2 + Test3) /3);
        System.out.println(Test1 + " " + Test2 + " " + Test3 );
        System.out.println("Srednia: " + srednia);


    }
}
