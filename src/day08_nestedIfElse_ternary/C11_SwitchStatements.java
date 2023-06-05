package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin
        // o harfle baslayan gun ismi varsa yazdirin
        // yoksa "gecersiz harf" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz : ");
        char A=scan.next().charAt(0);

        if (Character.toUpperCase(A)=='P'){
            System.out.println("PAZAR, PAZARTESİ, PERŞEMBE");
        } else if (Character.toUpperCase(A)=='C') {
            System.out.println("CUMA, CUMARTESİ");
        } else if (Character.toUpperCase(A)=='S') {
            System.out.println("SALI");
        } else if (Character.toUpperCase(A)=='Ç') {
            System.out.println("ÇARŞAMBA");
        }else System.out.println("geçersiz harf");

        System.out.println("==================================");

        switch (Character.toUpperCase(A)) {
            case 'P' : System.out.println("PAZAR, PAZARTESİ, PERŞEMBE");
            break;
            case 'C' : System.out.println("CUMA, CUMARTESİ");
            break;
            case 'S' : System.out.println("SALI");
            break;
            case 'Ç' : System.out.println("ÇARŞAMBA");
            break;
            default: System.out.println("geçersiz");
        }



    }
}
