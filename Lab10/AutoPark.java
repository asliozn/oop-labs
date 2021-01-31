package Lab10;
import java.util.Vector;
public class AutoPark {
    Vector<Automobile> jhpark=new Vector<Automobile>(0);
    static long cashRegister = 0;
    int size;
    AutoPark(int size){
        cashRegister=0;
        jhpark.setSize(size);
        this.size= jhpark.size();
    }

    public void checkIn(Automobile oto) {
        oto.girisZamani=System.currentTimeMillis();
        if(size>0){
            System.out.println("Vehicle with the license plate "+ oto.license+ " has entered.");
            jhpark.add(oto);
            size-=size;
        }
        else if(size==0){
            System.out.println(oto.license+" can not park.");
        }

    }

    public void checkOut(Automobile oto) {

        if(jhpark.contains(oto)) {
            long outTime=System.currentTimeMillis();
            long insideTime=(outTime-oto.girisZamani);
            cashRegister+=(insideTime/100f)*10;
            jhpark.remove(oto);
            System.out.println("Vehicle with the license plate "+ oto.license+ " has exited. ");
            System.out.println("Vehicle with the license plate "+ oto.license+ " has stayed in the park for "+insideTime+" milliseconds.");
            System.out.println("Vehicle with the license plate "+ oto.license+ " has paid "+(insideTime/100f)*10+" TL.");
        }
        else {
            System.out.println("Vehicle can not be found.");
        }



    }

    public static void kasaBilgi() {
        System.out.println(cashRegister);
    }

    public int recursiveTopl(int n){
        if(n==1){
            return 1;
        }
        return (3*recursiveTopl(n-1))/2;

    }

    public static void main(String[] args) throws InterruptedException {
        AutoPark park = new AutoPark(1);
        Automobile a = new Automobile("41 BR 123");
        Automobile b = new Automobile("34 TR 456 ");
        park.checkIn(a);
        Thread.sleep(200);
        park.checkIn(b);
        Thread.sleep(999);
        park.checkOut(b);
        park.checkOut(a);
        park.kasaBilgi();
    }
}
