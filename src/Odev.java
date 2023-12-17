// Dik Üçgende Hipotenüs Bulan Program :

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int a, b;
        double c, u, alan, cevre;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

        cevre = a + b + c;
        System.out.println("Üçgenin Çevresi : " + cevre);

        u = (a + b + c) / 2;        // Üçgenin çevresi = 2u => u = (a + b + c) / 2 olur.
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı : " + alan);

    }
}
