package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
        // kullanicidan pozitif bir tamsayi alin
        // sayi cift ise "sayi cift"
        // degilse "tek sayi" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi%2==0 ? " sayi çift " : " tek sayi ");



    }
}
