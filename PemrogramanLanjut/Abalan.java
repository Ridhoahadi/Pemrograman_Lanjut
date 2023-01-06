package PemrogramanLanjut;

import java.util.Scanner;

public class Abalan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan nilai nya");

        int alphabet = 65;


        System.out.println("** Printing the Abalan...**");

        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
