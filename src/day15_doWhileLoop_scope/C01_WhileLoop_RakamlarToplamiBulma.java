package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz");
        int girilenSayi=scan.nextInt();

        int sayi=girilenSayi;
        int birlerBasagi=0;
        int rakamlarToplami=0;


        while (sayi>0){

            birlerBasagi= sayi%10;
            rakamlarToplami +=birlerBasagi;
            sayi/=10;


        }
        System.out.println("Girilen  "+ girilenSayi+"'nın rakamlar toplami :" +rakamlarToplami);
        System.out.println("for ile hesapla: " + C02_RakamlarToplaminiBul.rakamlarToplaminiBul(girilenSayi));

    }
}


