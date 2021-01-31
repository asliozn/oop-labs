package Lab8;
import java.util.ArrayList;
import java.util.Arrays;

public class kume {
    ArrayList<Integer> benKume=new ArrayList();

    public kume() {
        benKume = new ArrayList<Integer>();
    }
    public kume(int[] a){
      for(int i=0;i<a.length;++i){
          benKume.add(a[i]);
      }

    }
    public kume(kume a) {

    }
    public void add(int a){

        benKume.add(a);

    }
    public void print(){

        System.out.print(benKume);

    }
    public boolean equivalent(kume a){
        if(benKume.size()==a.benKume.size()){
            return true;
        }
        else
        return false;
    }
    public boolean equal(kume a){
        int ctrl = 0;
        if(benKume.size()==a.benKume.size()){

            for(int i=0;i<a.benKume.size();++i){
               if(a.benKume.get(i)==benKume.get(i))
                   ctrl++;
            }
            if(ctrl==a.benKume.size())
                return true;
            else
                return false;

        }
        else
            return false;
    }

    public kume birlesim(kume a){
        kume bir=new kume();

        bir.benKume.addAll(a.benKume);
        bir.benKume.addAll(benKume);
        bir.benKume.remove(bir.benKume.size()-1);

        return bir;
    }
    public kume kesisim(kume a){
           kume kes=new kume();

           kes.benKume.addAll(a.benKume);
           kes.benKume.retainAll(benKume);

        return kes;


    }
    public ArrayList<kume>subSets(){
     ArrayList<kume> subSet=new ArrayList();


            return subSet;
    }


    public kume fark(kume a){
        kume far = new kume();

        far.benKume.addAll(benKume);
        far.benKume.removeAll(a.benKume);
       return far;

    }


    public static void main(String[] args) {
        kume km = new kume();
        km.benKume.add(10);
        km.benKume.add(11);
        km.benKume.add(2);
        System.out.print("km = {");
        km.print();
        System.out.println("}");
        int[] a = {1,2,3,4,5,6};
        kume km2 = new kume(a);
        System.out.print("km2 = {");
        km2.print();
        System.out.println("}");
        kume km3 = new kume(a);
        System.out.print("km3 = {");
        km3.print();
        System.out.println("}");
        if (km.equivalent(km2))
            System.out.println("km and km2 sets are equivalent.");
        else
            System.out.println("km and km2 sets are not equivalent.");
        if (km2.equal(km3))
            System.out.println("km2 and km3 sets are equal.");
        else
            System.out.println("km2 and km3 sets are not equal.");


        kume k1 = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        k1.print();
        System.out.println("}");
        kume k2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        k2.print();
        System.out.println("}");
        kume k3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        k3.print();
        System.out.println("}");
        System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc = km.subSets();
        for(int i = 0; i < sonuc.size(); i++){
            System.out.print("{");
            sonuc.get(i).print();
            System.out.println("}");
        }
    }


}
