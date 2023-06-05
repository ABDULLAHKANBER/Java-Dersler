package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*  Eger bir olay icin
            Sadece 2 olasilik varsa
            Ve bu olasiliklardan birisi mutlaka calisacaksa
            If Else Statements kullaniriz
            If-else statement'da if bodys'si veya else body'si mutlaka calisir
            ikisinin birden calisma ihtimali YOKTUR
            ikisinin de calismama ihtimali YOKTUR
         */
        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.
        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if(not >= 50 && not<=100) {
            System.out.println("Sinifi gectin");
        }

        else {
            System.out.println("Maalesef kaldin");
        }
        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin
        System.out.println("Lutfen pozitif tamsayi giriniz:");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println(sayi+" çift sayidir.");
        }else
            System.out.println(sayi+ " tek sayidir");
        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin
        System.out.println("Lutfen pozitif tamsayi giriniz:");
        int girilensayi=scan.nextInt();
        if (girilensayi%5==0){
            System.out.println(girilensayi+" sayisi 5 ile bölünebilir");
        }else
            System.out.println(girilensayi+ " sayisi 5 ile bolunmez..");







    }
}
