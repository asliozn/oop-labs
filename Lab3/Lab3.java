package Lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        int j;
        //Bölüm A
        Scanner sentence = new Scanner(System.in);
        System.out.print("First Sentence	  : ");
        String s1 = sentence.nextLine();

        System.out.print("Second Sentence	  : ");
        String s2 = sentence.nextLine();

        if(cS(s1, s2)){

            System.out.print("Cumleler esittir :) \n ");
        }
        else{
            System.out.print("Cumleler esit degildir :( \n");
        }

        //Bölüm B
        System.out.print("Birinci cumlenin tersi : \n");
        for (j = s1.length() - 1; j >= 0; j--) {
            System.out.print(s1.charAt(j));
        }


    }

    public static boolean cS(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}