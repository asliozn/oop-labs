package Lab2;
import java.util.Scanner;
public class Lab2 {
    //ASLI OZEN
    public static void main(String[] args) {

        fonkfonk();
        moneyfonk();
    }
    public static void fonkfonk(){

        double s,a;
        System.out.println("----CALISMA 1----");
        System.out.println("4A^2 -8A + 16 fonksiyonu icin kullanilmasini istediginiz degeri giriniz:");
        Scanner sc1 = new Scanner(System.in);
        a= sc1.nextDouble();
        s=4*(a*a) -8*a +16;
        System.out.println( s+" degerini elde ettiniz.");

    }

    public static void moneyfonk(){

        int beslik,onluk,yimbeslik,ellilik,toplam1,toplam2,kp;
        System.out.println("----CALISMA 2----");
        System.out.println("Please write a value:");
        Scanner sc2 = new Scanner(System.in);
        toplam1= sc2.nextInt();
        toplam2=toplam1;

        ellilik= toplam1/50;
        toplam1=toplam2%50;
        yimbeslik=toplam1/25;
        toplam1=toplam1%25;
        onluk=toplam1/10;
        toplam1=toplam1%10;
        beslik=toplam1/5;
        toplam1=toplam1%5;

        kp=ellilik+yimbeslik+onluk+beslik;


        System.out.println( kp+" kagit para aldim " +toplam1+" TL bozuk para yedim :).");
    }

}
