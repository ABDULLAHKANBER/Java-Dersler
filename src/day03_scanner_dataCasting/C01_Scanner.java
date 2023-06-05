package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        System.out.println("Isminiz : " +isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

        System.out.println("=============başka yontem==========");
        System.out.println("Isminiz : " +isim + "\nSoyisminiz : " + soyisim + "\nYasiniz : " + yas +
                          "\nKaydiniz basariyla tamamlanmistir.");






    }
}
