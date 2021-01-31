package Lab9;

public class Rectangle extends Shape{
    public double width=1;
    public double length=1;

    public  Rectangle(double x,double y){
        super(x,y);
        this.x=x;
        this.y=y;
        System.out.print("Rectangle object created.\n");
    }
    public  Rectangle(double x,double y,double width,double length){
        super(x,y);
        this.x=x;
        this.y=y;
        this.length=length;
        this.width=width;
        System.out.print("Rectangle object created.\n");

    }

    public void sil(){
        super.sil(varlikID);
    }

    @Override
    public double area() {
        double A;
        A=width*length;
        return A;
    }

    @Override
    public double perimeter() {
        double P;
        P=2*(width+length);
        return P;
    }

    @Override
    public void top() {
        super.top();
    }
}
