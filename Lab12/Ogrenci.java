package Lab12;
public class Ogrenci {

    private String ad;
    private String soyAd;
    private String ogrenciNo;
    Ders [] array=new Ders[6];

    public Ogrenci() {

    }
    void dersListele(Ders ders[]){
        System.out.println("OGRENCININ DERSLERI");
        for(int i=0;i<6;i++){
            System.out.println(ders[i].getAd()+" "+ders[i].getDönem()+" "+ders[i].getNot());
        }
    }
    void ortHesapla(Ders ders[]){
        int ort=0;
        for(int i=0;i<6;i++){
           ort+=ders[i].getNot();
        }
        System.out.println("Öğrenicinin Not Ortalaması :"+ ort/6);
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ders[] getArray() {
        return array;
    }

    public void setArray(Ders[] array) {
        for(int i=0;i<6;i++) {
            this.array[i] = array[i];
        }
    }
}
