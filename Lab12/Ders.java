package Lab12;
public class Ders {
    private String ad=null;
    private String dönem=null;
    private int not=0;

    public Ders(String ad,String dönem,int not) {
    this.ad=ad;
    this.dönem=dönem;
    this.not=not;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public String getDönem() {
        return dönem;
    }

    public void setDönem(String dönem) {
        this.dönem = dönem;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
