package day10_stringManipulation;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java bazen beyin yakar";
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.lastIndexOf("a"));//20
        System.out.println(str.indexOf("a",2));//3
        System.out.println(str.lastIndexOf("a",19));//18
        System.out.println(str.indexOf("a",4));//6
        System.out.println(str.lastIndexOf("a",17));//6

        System.out.println(str.lastIndexOf("mustafa"));//-1

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 3- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle= "Yasasin java, iyi ki java ogreniyorum.";
        String kelime="java";

        int ilkindex=cumle.indexOf(kelime);
        int lastindex=cumle.lastIndexOf(kelime);

        if (ilkindex==-1){
            System.out.println("aradıgınız kelime cumlede hic kullanılmamıştır");
        } else if (ilkindex==lastindex) {
            System.out.println("aradıgınız kelime cumlede 1 kere kullanılmıstır");
        }else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");

        }

    }
}
