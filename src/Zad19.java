public class Zad19 {
    public static void main(String[] args) {
        int konsumenci = 12467;
        double procentPijacychEnergetyki = 0.14;
        double procentPreferujacyCytrusowe = 0.64;

       int osobyPijaceEnergetyki = (int) (konsumenci * procentPijacychEnergetyki);
      int osobypreferujaceCytrusowe = (int) (osobyPijaceEnergetyki * procentPreferujacyCytrusowe);

        System.out.println(osobyPijaceEnergetyki);
        System.out.println(osobypreferujaceCytrusowe);


    }

}
