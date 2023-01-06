package PemrogramanLanjut;

import javax.swing.*;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
/*

public class Contoh1 {
    public static void main(String[] args)
    {
        String [] hari= {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Ahad"};

        for (int i = hari.length - 1; i < 0;i++ )
        {
            for (int j = 0; j < hari.length - 1; j++)
            {
                i += j;

                System.out.println("");

            }
            System.out.println("Hari ini adalah hari: " + i);
        }
    }
}

 */
class Contoh1 {
    public static void main(String[] args) {

        int x = 34;
        int y = ++x;

        System.out.println(x);
        System.out.println(y);
    }
}