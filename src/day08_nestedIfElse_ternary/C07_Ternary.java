package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //         degilse “Eskenar degil” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sıra ile üç kenar uzunluğu giriniz : ");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0
                ? "Eşkenar üçgen"
                : "Eşkenar değil");




    }
}
