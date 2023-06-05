package day12_forLoops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sırayla başlangıç degeri giriniz:" );
        int sayiBas=scan.nextInt();
        System.out.println("bitiş degeri giriniz:");
        int sayibitisi=scan.nextInt();
        int toplam=0;


            if (sayibitisi>=sayiBas){
                for (int i = sayiBas; i <=sayibitisi; i++){
                     toplam +=i;
                }
                System.out.println(sayiBas + " ile "+sayibitisi+" (sınırlar dahil) arasındaki Sayilarin toplami : " + toplam);
            }else System.out.println("Bitis degeri baslangic degerinden kucuktur.");







    }
}
