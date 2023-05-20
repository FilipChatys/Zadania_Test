import java.util.Scanner;

public class Zad1 {

    public static int[] znajdzMinimalnaRoznice(int jablka, int pomarancze, int monety) {

        int[] wynik = {jablka, pomarancze, monety};

        while (monety != 0) {
            if (jablka == pomarancze) {
                return znajdzMinimalnaRoznice(jablka + 1, pomarancze, monety - 1);
            } else if (jablka < pomarancze) {
                return znajdzMinimalnaRoznice(jablka + 1, pomarancze, monety - 1);
            } else {
                return znajdzMinimalnaRoznice(jablka, pomarancze + 1, monety - 1);
            }
        }
        return wynik;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe jablek :");
        int jablka = scanner.nextInt();

        System.out.println("Podaj liczbe pomaranczy :");
        int pomarancze = scanner.nextInt();

        System.out.println("Podaj liczbe monet :");
        int monety = scanner.nextInt();

        int[] minimalnaRoznica = znajdzMinimalnaRoznice(jablka, pomarancze, monety);
        System.out.println("Minimalna różnica: " + Math.abs(minimalnaRoznica[0] - minimalnaRoznica[1]));
        System.out.println("Ilość jabłek: " + (minimalnaRoznica[0]));
        System.out.println("Ilość pomarańczy: " + (minimalnaRoznica[1]));
    }
}


