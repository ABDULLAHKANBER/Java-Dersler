package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sırayla başlangıç degeri giriniz:" );
        int sayiBas=scan.nextInt();
        System.out.println("bitiş degeri giriniz:");
        int sayiBit=scan.nextInt();
        int toplam=0;

        if (sayiBit>=sayiBas){
            for (int i = sayiBas; i <=sayiBit ; i++) {
                toplam +=i;
            }
        }else  {
            for (int i = sayiBit; i <=sayiBas ; i++){
                toplam +=i;
            }

        }
        System.out.println(sayiBas + " ile " + sayiBit + " arasındaki sayıların toplamı: " + toplam);



    }
}
