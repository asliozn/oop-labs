package Lab12;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Ders []arr=new Ders[6];
        Ogrenci ogr1 = new Ogrenci();
        File file = new File("ali_bilge.txt");
        Scanner dosya = new Scanner(file);
        ogr1.setAd(dosya.next());
        ogr1.setSoyAd(dosya.nextLine());
        ogr1.setOgrenciNo(dosya.nextLine());
        for(int i=0;i<6;i++) {
            Ders drs=new Ders(dosya.next(),dosya.next()+" "+dosya.next(), dosya.nextInt());
            arr[i]=drs;
        }
        ogr1.setArray(arr);
        System.out.println(ogr1.getAd() + ogr1.getSoyAd()+"\n"+ogr1.getOgrenciNo());
        ogr1.dersListele(ogr1.getArray());
        ogr1.ortHesapla(ogr1.getArray());



    }

}
