package Lab7;
public class Circle {

    public double PI=3.14;
    public int radius;

    public Circle(int radius){
        this.radius=radius;


    }
    public double calArea(){
        Operations sqrRad =new Operations(radius);
        double sqrRadi=sqrRad.multiplication(radius);
        Operations circleA=new Operations(sqrRadi);
        return circleA.multiplication(PI);

    }
    public double calCircumference(){
        Operations Rad2 =new Operations(radius);
        double sqrRadi=Rad2.addition(radius);
        Operations circleC=new Operations(sqrRadi);
        return circleC.multiplication(PI);
    }

    public boolean circGreaterThanArea(){
        Operations check= new Operations(calCircumference());

        return  check.isGreaterThan(calArea());
    }
    public boolean circLesserThanArea(){
        Operations check= new Operations(calCircumference());

        return  check.isLessThan(calArea());
    }
    public void printToScreen(){

        System.out.print("Area:"+ calArea()+"\nCircumference:"+ calCircumference()+"\n");

    }

}
