package PemrogramanLanjut;

import java.util.Scanner;
public class TugasJavaPalindrome
{
    public static void main(String[] args)
    {
        //Menggunakan scanner untuk memanggil dan memasukkan kata
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        String kata = input.nextLine();

        //Menggunakan Tipe data Char
        char[] kata1 = kata.toCharArray();
        char[] kata2 = kata.toCharArray();

        //Menggunakan tipe data boolean untuk menentukan output true atau false
        boolean hasil = false;
        for (int i = kata.length() - 1; i >= 0; i--)
        {
            for (int j = 0; j < kata.length(); j++)
            {
                if (kata1[i] == kata2[j]) {
                    hasil = true;
                } else {
                    hasil = false;
                }
            }
        }
        if (hasil == true)
        {
            System.out.println("Kata " + kata + " adalah Palindrome!");
        } else
        {
            System.out.println("Kata "+ kata + " Bukanlah Palindrome!");
        }
    }
}
