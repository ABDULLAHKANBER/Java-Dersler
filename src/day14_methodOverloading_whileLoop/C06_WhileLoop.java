package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /// Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int girilenSayi=0;
        int girilenSayiAdedi=0;

        while (toplam<500){
            System.out.println("Lütfen sayi giriniz : ");
            girilenSayi=scan.nextInt();
            toplam +=girilenSayi;
            girilenSayiAdedi++;
        }
        System.out.println(girilenSayiAdedi+" adet sayı girildi. toplamı : "+ toplam);




    }
}
