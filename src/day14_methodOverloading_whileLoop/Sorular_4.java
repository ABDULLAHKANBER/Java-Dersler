package day14_methodOverloading_whileLoop;

public class Sorular_4 {
    public static void main(String[] args) {
        /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
                donduren bir method olusturun.
         */
        String input = "Java Candir";

        // output : ridnaC avaJ
        terseCevir();


       // for (int i = input.length()-1; i >=0 ; i--) {
//
       //     output += input.charAt(i);
       // }

    }
    private static void terseCevir(String input) {
        String output="";
        int index=input.length();
        while (index>0){
            output += input.charAt(index-1);
            index--;
        }
        System.out.println(output);



    }
}
