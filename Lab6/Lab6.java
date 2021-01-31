package Lab6;
import java.util.Scanner;
public class Lab6 {

    public static void main(String[] args) {
        Scanner  values = new Scanner(System.in);
        //WORK 1
        System.out.println("Please write line size:");
        int line = values.nextInt();
        System.out.println("Please write column size:");
        int column = values.nextInt();
        for(int i=0;i<column;i++){
            System.out.print("\n");
            for(int j=0;j<line;j++){

                System.out.print(" "+  createArray(line,column)[j][i]);

            }

        }

        //WORK 2
           arrays array1=new arrays();
          printArray(array1.Array1, array1.length);
          System.out.println("\n Sum of array elements: "+array1.sum());
    }

    static int[][] createArray(int line, int column){

        int[][] Array = new int[line][column];
        for(int i=0;i<column;i++){
            for(int j=0;j<line;j++){

                Array[j][i]= (int) (Math.random() * ((100-1) + 1)+1);
            }

        }



        return Array;
    }
    static void printArray(int []arr,int leng){
        for(int j=0;j<leng;j++){

            System.out.print(" "+ arr[j]);

        } }
}

class arrays {
     int[] Array1;
     int length;
    public arrays(){
        Scanner  getLength = new Scanner(System.in);
        System.out.println("\n Please write your array's length: \n");
        length = getLength.nextInt();
        Array1 = new int[length];
        for(int i=0;i<length;i++){

            Array1[i]= (int) (Math.random() * ((100-1) + 1)+1);
        }

    }

     int sum(){
        int sum1=0;
        for (int j=0;j<length;j++){
            sum1 +=Array1[j];
        }
        return sum1;

    }
}