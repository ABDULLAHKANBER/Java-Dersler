package day12_forLoops;

import java.util.Scanner;

public class C06_StringiTerseCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.
        Scanner  scan=new Scanner(System.in);
        System.out.print("Lutfen bir  kelime giriniz: ");

        String kelime=scan.nextLine();
        String tersKelime="";

        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersKelime +=kelime.charAt(i);

        }
        System.out.println(kelime+  " kelimesinin " + "ters hali : " + tersKelime );
        /* hocanın cozumu
        String input = "Java Candir";

        // output : ridnaC avaJ

        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {

            output += input.charAt(i);
        }

        System.out.println(output);
         */





    }
}
