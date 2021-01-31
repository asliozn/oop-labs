package Lab1;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Problem 1:");
        problem1();
        System.out.println("Problem 2:");
        problem2();

    }

    public static void problem1() {
        int s=1;
        int i;
        for (i=10;i>0;i--){

            s=s*i;
        }

        System.out.println(s);

    }

    public static void problem2() {

        Scanner keyboard = new Scanner(System.in);

        String k1 , k2, k3;

        System.out.println("Write 3 words:");

        k1 = keyboard.next( );
        k2 = keyboard.next( );
        k3 = keyboard.next( );

        System.out.println(k1+ "\\ " + k2+ "\\ " + k3 );



    }

    }
