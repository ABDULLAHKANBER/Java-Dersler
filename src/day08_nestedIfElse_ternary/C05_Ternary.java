package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        // kullanicidan bir tamsayi alip
        // mutlak degerine cevirip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        sayi=sayi>=0 ? sayi : sayi*(-1);
        System.out.println(sayi);


    }
}
