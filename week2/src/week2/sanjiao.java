package week2;

import java.util.Scanner;

public class sanjiao {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in );
 
        System.out.println("«Î ‰»Î–– ˝");
        int rows = scan.nextInt();
        for (int row = 1;row<=rows;row++) {
            for (int col = 1; col <=rows-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

