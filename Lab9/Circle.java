package Lab9;

public class Circle extends Shape {
    public double radius=1;

    public  Circle(double x,double y){
        super(x,y);
        this.x=x;
        this.y=y;
       System.out.print("Circle object created.\n");

    }

    public  Circle(double x,double y,double radius){
        super(x,y);
        this.x=x;
        this.y=y;
        this.radius=radius;
        System.out.print("Circle object created.\n");

    }

    public double enlarge(int k){
       radius+=k;
       return radius;
    }

    public void sil(){
      sil(varlikID);
    }

    @Override
    public double area() {
        double A;
        double pi=3.14;
        A=pi*radius*radius;
        return A;
    }

    @Override
    public double perimeter() {
        double P ;
        double pi=3.14;
        P=2*pi*radius;

        return P;
    }

    @Override
    public void top() {
        super.top();

    }


}
