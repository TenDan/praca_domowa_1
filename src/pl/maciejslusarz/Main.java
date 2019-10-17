package pl.maciejslusarz;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
     * Napisz funkcje obliczające pole powierzchni i obwód dla każdej poniższej figury:
     * -Prostokąt
     * -Koło
     * -Trapez
     * Dobierz odpowiednie typy zmiennych
     * Wynik wyświetl na ekranie w czytelnej formie
     * W razie potrzeby skorzystaj z biblioteki Math
     *
     */
    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner input = new Scanner(System.in);
        String closeTheProgram = "Naciśnij ENTER, aby zakończyć pracę programu...";
        int n = 4;
        int repeats = 0;
        while (n > 3) {
            repeats++;
            if (repeats > 10) {
                System.out.println("Nie masz już okazji spróbowania jeszcze raz.");
                System.out.print(closeTheProgram);
                System.in.read();
                System.exit(0);
            }
            if (repeats > 1) {
                System.out.println("To był zły wybór! Ale masz okazję spróbować jeszcze raz.");
            }
            System.out.println("Co chcesz zrobić?");
            System.out.println("1 - Oblicz pole prostokąta");
            System.out.println("2 - Oblicz pole koła");
            System.out.println("3 - Oblicz pole trapezu");
            System.out.println("0 - Wyjdź z programu");
            System.out.print("Wybierz rozsądnie: ");
            n = input.nextInt();
        }
        if (n == 0) {
            System.exit(0);
        } else if (n == 1) {
            System.out.print("Wprowadź długość pierwszego boku: ");
            float a = input.nextFloat();
            System.out.print("Wprowadź długość drugiego boku: ");
            float b = input.nextFloat();
            System.out.printf("Pole prostokąta wynosi: %.1f\n", Pole.prostokat(a, b));
            System.out.print(closeTheProgram);
            System.in.read();
            System.exit(0);
        } else if (n == 2) {
            System.out.print("Wprowadź promień koła: ");
            float r = input.nextFloat();
            System.out.printf("Pole koła wynosi: %.1f\n", Pole.kolo(r));
            System.out.print(closeTheProgram);
            System.in.read();
            System.exit(0);
        } else if (n == 3) {
            System.out.print("Wprowadź długość dłuższej podstawy trapezu: ");
            float a = input.nextFloat();
            System.out.print("Wprowadź długość krótszej podstawy trapezu: ");
            float b = input.nextFloat();
            System.out.print("Wprowadź długość wysokości dzielącej dwie podstawy od siebie: ");
            float h = input.nextFloat();
            System.out.printf("Pole trapezu wynosi: %.1f\n", Pole.trapez(a, b, h));
            System.out.print(closeTheProgram);
            System.in.read();
            System.exit(0);
        }
    }
    public static class Pole {
        static float prostokat(float a, float b) {
            return a * b;
        }
        static double kolo(float r) {
            return Math.PI * Math.pow(r, 2);
        }
        static float trapez(float a, float b, float h) {
            return ((a + b) * h) / 2;
        }
    }
}
