package day12_forLoops;

import java.util.Scanner;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        /*
                Verilen satir sayisina gore
                asagidaki sekli olusturan kod yaziniz
                *
                * *
                * * *
                * * * *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satır sayısı giriniz : ");
        int satir=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }
            System.out.println("");

        }
        /*hocanın cozumu
         int satir= 6;

        for (int i = 1; i <=satir ; i++) { // satirlar Outer Loop / dis Dongu

            for (int j = 1; j <= i ; j++) { // sutunlar inner Loop / ic dongu

                System.out.print("* ");

            }
            System.out.println("");
        }
         */


    }
}
