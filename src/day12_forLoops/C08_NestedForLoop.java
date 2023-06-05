package day12_forLoops;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun
        /*
         * * * * *
         * * * * *
         * * * * *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satır sayısı giriniz : ");
        int satir=scan.nextInt();
        System.out.println("Lutfen sütun sayısı giriniz : ");
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(" * ");

            }
            System.out.println("");

        }
        /* hocanın cozumu
        int satirSayisi=3;
        int sutunsayisi=5;

        for (int k=1 ; k<=satirSayisi ; k++) { // satir sayisini

            for (int i = 1; i <=sutunsayisi ; i++) { // sutun sayisini
                System.out.print("* ");
            }
            System.out.println(""); // bir satirdaki tum sutunlar bitince alt satira geciyor
        }
         */



    }
}
