package Lab9;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(1,1);
        Circle c2 = new Circle(2,3, 2);
        Rectangle r1 = new Rectangle(2,2);
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(r1.area());
        c1.top();
        c2.top();
        r1.top();
        
        c1.list();
        c2.sil();
        c1.list();
    }


}
