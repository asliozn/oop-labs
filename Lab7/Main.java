package Lab7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Operations try1=new Operations(4);
        double tryAdd=try1.addition(5);
        double trySub=try1.subtraction(5);
        double tryDiv=try1.division(5);
        double tryMul=try1.multiplication(5);
        boolean try1Equal=try1.isEqual(5);
        boolean try1Greater=try1.isGreaterThan(5);
        boolean try1Lesser=try1.isLessThan(5);
        System.out.println("Addition:"+tryAdd);
        System.out.println("\nSubtraction:"+trySub);
        System.out.println("\nDivision:"+tryDiv);
        System.out.println("\nMultiplication:"+ tryMul);
        System.out.println("\nAre they equal: "+try1Equal);
        System.out.println("\nIs 4 greater than 5: "+try1Greater);
        System.out.println("\nIs 4 lesser than 5: "+try1Lesser+"\n");

        Circle circle1=new Circle(5);
        circle1.printToScreen();
        System.out.println("\nIs Circumference greater than Area: "+circle1.circGreaterThanArea());
        System.out.println("\nIs Circumference lesser than Area: "+circle1.circLesserThanArea()+"\n");
        System.out.println("\n Write Your Circle's Radius");
        Scanner scan=new Scanner(System.in);
        int radius2=scan.nextInt();
        Circle circle2=new Circle(radius2);
        circle2.printToScreen();
        System.out.println("\nIs Circumference greater than Area: "+circle2.circGreaterThanArea());
        System.out.println("\nIs Circumference lesser than Area: "+circle2.circLesserThanArea()+"\n");

        Factorial value1=new Factorial();
        value1.setValue(12);
        value1.calculate();
        value1.printToScreen();
        Factorial value2=new Factorial();
        value2.setValue(7);
        value2.calculate();
        value2.printToScreen();






    }







}
