package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile kaydedildi” yazdirin sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
         */

        int flag=0;
        int denemesayisi=0;


        while (flag!=2){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk karakteri kucuk harf olan ve son karakteri sayi olan şifrenizi giriniz:");
        String sifre=scan.nextLine();
        flag=0;

        //- sifrenin ilk karakteri kucuk harf olmali

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("Lütfen sifrenin ilk karakteri kucuk harf olmali");
        }
        //        - sifrenin son karakteri sayi olmali
        if (sifre.charAt(sifre.length()-1)>='0' &&(sifre.charAt(sifre.length()-1))<='9'){
            flag++;
        }else {
            System.out.println("Lütfen sifrenin son karakteri sayi olmali");
        }
        denemesayisi++;
        }
        System.out.println(denemesayisi+ ". denemede Tebrikler şifreniz başarı ile oluşturuldu.");

    }
}
