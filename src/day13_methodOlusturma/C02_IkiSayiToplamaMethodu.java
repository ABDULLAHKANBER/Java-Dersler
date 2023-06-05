package day13_methodOlusturma;

import java.util.Scanner;

public class C02_IkiSayiToplamaMethodu {
    public static void main(String[] args) {


        // kullanicidan 2 sayi alip
        // toplamlarini yazdiran bir method olusturun
        ikisayiTopla();



    }
    public static void ikisayiTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak üzere iki sayi giriniz: ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("iki sayinin toplami: " +(sayi1+sayi2));




    }


}
