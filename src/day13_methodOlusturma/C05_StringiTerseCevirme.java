package day13_methodOlusturma;

import java.util.Scanner;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {


        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun
        System.out.println(stringtersineCevirme("Abdullah kanber"));
        System.out.println(stringtersineCevirme("Anlaşıldı mı?"));
        System.out.println(stringtersineCevirme("selamlar"));




    }
    public static String stringtersineCevirme(String metin){

        Scanner scan=new Scanner(System.in);

        String tersMetin="";

        for (int i = metin.length()-1; i>=0 ; i--) {

            tersMetin +=metin.charAt(i);
        }
        return tersMetin; // tersMetin istenen sonucu bana döndür.




    }

}
