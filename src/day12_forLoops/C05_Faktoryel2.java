package day12_forLoops;

import java.util.Scanner;

public class C05_Faktoryel2 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        //       Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	     Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 20'den kucukbir sayi giriniz: ");
        int sayi=scan.nextInt();
        int faktoriyel=1;
        System.out.print(sayi+"! = ");


        if (20>=sayi && sayi>=1) {
            for (int i = sayi; i >= 1; i--) {
                faktoriyel *= i;
                if (i > 1) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i);
                }

            }
            System.out.print(" = " + faktoriyel);
        }
            else{
                System.out.println("istenen sınırların dışında birsayı girdiniz!!");
            }

            /* Hocanın çözümü
            int sayi = 8 ;
        int faktoryel= 1;

        System.out.print(sayi+"! = ");

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *=i ;

            if (i!=1){
                System.out.print(i + " * ");
            }else{
                System.out.print(i + " ");
            }

        }

        System.out.println("= " + faktoryel);

             */


    }
}
