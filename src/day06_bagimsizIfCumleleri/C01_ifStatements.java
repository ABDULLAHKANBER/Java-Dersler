package day06_bagimsizIfCumleleri;

public class C01_ifStatements {
    public static void main(String[] args) {

        int a=110;
        int b=106;
        if (a>b){
            System.out.println("a b'den buyuktur");
        }
        if (a%2==0){
            System.out.println("a cift sayidir");
        }
        if (b>100){
            System.out.println("b 100 den buyuktur");
        }
        //a b'den buyuktur
        //a cift sayidir
        //b 100 den buyuktur
        boolean sonuc = a*7 > b ;
        /*
           bazen if statement'da direk boolean bir deger sart olarak yazilabilir
           bu durumda boolean variable degeri true ise if body calisir,
           false ise if body calismaz
         */

        if (sonuc) {
            System.out.println("istenen sart saglandi" );
        }

    }
}
