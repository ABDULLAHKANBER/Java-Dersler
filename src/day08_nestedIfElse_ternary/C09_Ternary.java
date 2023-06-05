package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sıra ile iki sayı giriniz : ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);


    }
}
