package Lab4;
import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {
        //ASLI OZEN 190201094
        //Problem 1
        int[][] A=new int [3][3];
        Scanner values = new Scanner(System.in);

        System.out.print("3X3 lük diziniz için sayı degerlerinizi giriniz! \n");
            for (int i=0;i<3;i++){
                 for(int j=0;j<3;j++){

                     A[i][j]=values.nextInt();


                 }
            }
            //max sayiyi bul
            int max=A[0][0];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    if (A[i][j]> max)
                        max = A[i][j];

            }
        }
        //min sayiyi bul
        int min=A[0][0];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (A[i][j]< min)
                    min = A[i][j];

            }
        }

        System.out.print("En büyük değer olan "+max +" ile en küçük değer olan " +min +" arasındaki fark " +(max-min)+ " dir. \n");
        //Problem 2
        int[] B= new int [10];

        int c=0,t=0;
        System.out.print("Teklik ve Ciftlik icin atayacagınız dizinizin sayi degerlerinizi giriniz! \n");


        for (int i=0;i<10;i++){

                B[i]=values.nextInt();
        }
        for (int i=0;i<10;i++){

            if(B[i]%2==0){
                c++;
            }
            else{
                t++;
            }
        }
        //Atama
        int[] C= new int [c];
        int[] T= new int [t];
        int k=0,h=0;
        for (int i=0;i<10;i++){

            if(B[i]%2==0){
                C[k]=B[i];
                k++;
            }
            else{
                T[h]=B[i];
                h++;
            }
        }
        //Yazdırma
        System.out.print("B: ");
        for (int i=0;i<10;i++){

            System.out.print(" "+ B[i]);
        }
        System.out.print("\nC: ");
        for (int i=0;i<c;i++){

          System.out.print(" "+C[i]);
        }
        System.out.print("\nT: ");
        for (int i=0;i<t;i++){

            System.out.print(" "+T[i]);
        }



    }
}
