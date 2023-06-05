package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        // kullanici sayi1= 10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen 2. sayiyi giriniz");
        double sayi2=scan.nextDouble();
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1  - sayi2;
        System.out.println("1. sayinin yeni degeri : " + sayi1);
        System.out.println("2. sayinin yeni degeri : " + sayi2);

    }
}
