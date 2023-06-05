package day14_methodOverloading_whileLoop;

public class Sorular_2 {
    public static void main(String[] args) {
        /*
        Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin.
         */
        int sayi=10;
        String yazdir="";
        while (sayi>=10&&sayi<=100){
            if (sayi%7==0){
                      yazdir+=" "+sayi;
            }
            sayi++;
        }
        System.out.println(yazdir);



    }
}
