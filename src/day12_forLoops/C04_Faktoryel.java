package day12_forLoops;

import java.util.Scanner;

public class C04_Faktoryel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 20'den kucukbir sayi giriniz: ");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        if (20>=sayi && sayi>=1){
            for (int i = sayi; i >=1 ; i--) {
                faktoriyel *=i;
            }
        }else System.out.println("istenen sınırların dışında birsayı girdiniz!!");
        System.out.println(sayi + "!" + "= " + faktoriyel);
        System.out.println(sayi + " nın " + " faktoriyeli= " + faktoriyel);
    }
}
