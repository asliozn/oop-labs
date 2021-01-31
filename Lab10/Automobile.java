package Lab10;
public class Automobile implements Vehicle{
    double fuel;
    double speed;
    String license;
    long girisZamani;
    public Automobile(){
        speed=0;
        fuel=0;
        license=null;
    }

    public Automobile(double f, double s, String l)
    {
        license=l;
        fuel=f;
        speed=s;

    }
    public Automobile(String l) {
        this.setLicense(l);
    }

    public void speedUp(double speedUpOranı){
        if(speedUpOranı>0 && speedUpOranı<=1 && speed<=300){
            speed=speed + speedUpOranı;
        }
        else {
            System.out.print("Hız Değişmedi \n");
        }


    }
    public void speedDown(double yavaslamaOranı){
        if(yavaslamaOranı>0 && yavaslamaOranı<=1 && speed>=0){
            speed=speed - yavaslamaOranı;
        }
        else {
            System.out.print("Hız Değişmedi \n");
        }

    }

    public void stop() {
        speed=0;
        System.out.print("Hız Sıfırlandı. Araç Durdu.\n");

    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }
}