package com.Rahul.day39;
import java.util.Scanner;
public class RectangularPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows and columns respectively: ");
        int rows = in.nextInt();
        int cols = in.nextInt();

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
