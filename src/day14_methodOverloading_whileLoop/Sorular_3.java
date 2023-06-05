package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class Sorular_3 {
    public static void main(String[] args) {
        /*
        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz : ");
        int sayi=scan.nextInt();

        int toplam=0;

        while (sayi>0) {

            toplam+=sayi%10;
            sayi/=10;

        }
        System.out.println("rakamların toplamı : "+toplam);


    }
}
