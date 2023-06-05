package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_StringManipulation {
    public static void main(String[] args) {
        String str="Java candir";
        //str'ı buyuk olarak yazdirin
        System.out.println(str.toUpperCase());//JAVA CANDİR
        System.out.println(str);//Java candir
        // String manipulation yaptiktan sonra, HANGI MANIPULATION YAPARSAN YAP
        // asil variable'a atama yapilmazsa
        // asil variable degismez
        System.out.println(str.toLowerCase());//java candir
        str=str.toUpperCase();
        System.out.println(str);
        // str'i turkce karakterleri gozonunde bulundurarak kucuk harfe cevirin
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));



    }
}
