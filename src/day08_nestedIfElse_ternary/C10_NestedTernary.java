package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C10_NestedTernary {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olanib yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi=scan.nextInt();

        System.out.println(sayi>0
                ? (sayi%2==0 ? "çift sayi" : "çift sayı değil")
                : (sayi<-99 && sayi>-1000 ? "sayi üçbasamaklı" : "sayi üç basamaklı değil"));




    }
}
