package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali

        String sifre="";
        int flag=0;
        int denemeSayisi=0;

        while (flag!=4) {
            flag=0;

            Scanner scan = new Scanner(System.in);
            System.out.println(" Lütfen Şifrenizi oluşturun ");
            sifre = scan.nextLine();

            // - ilk harf kucuk harf olmali
            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
                flag++;
            }else {
                System.out.println("Şifrenin ilk harfi kucuk harf olmali");
            }
            // - son harf buyuk harf olmali
            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z') {
                flag++;
            }else {
                System.out.println("Şifrenin son harfi buyuk harf olmali");
            }
            // - bosluk icermemeli
            if (sifre.contains(" ")){
                System.out.println("Şifre boşluk içermemeli");
            }else {
                flag++;
            }

            // - 8 karakter veya daha uzun olmali
            if (sifre.length()-1>=8){
                flag++;
            }else {
                System.out.println("Şifre 8 karakterden uzun olmalı");
            }
            denemeSayisi++;

        } System.out.println("Tebrikler "+denemeSayisi+". denemenizde şifre basarili şekilde olusturuldu ");



    }
}
