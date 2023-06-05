package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerlilkGorev {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        // ve sayinin karesini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        double girilenSayi= scan.nextDouble();

        System.out.println("Girilen Sayi Karesi : " + girilenSayi*girilenSayi);

    }
}
