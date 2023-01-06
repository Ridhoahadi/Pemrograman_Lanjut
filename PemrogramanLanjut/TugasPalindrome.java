package PemrogramanLanjut;

import java.util.Arrays;
import java.util.Scanner;

public class TugasPalindrome
{
    public static void main(String[] args) {
        //Menggunakan Scanner agar mudah untuk menginput data
        Scanner scr = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = scr.nextLine();

        //Menggunakan tipe data char
        char teks[]=kata.toCharArray();
        char palindrome[]= kata.toCharArray();
        for (int i = teks.length-1; i>=0;i--)
        {
            int j = teks.length-1-i;
                palindrome[j] = teks[i];
                System.out.println(i + " <=> " + j);
        }
        if (Arrays.equals(teks, palindrome))
        {
            System.out.println(kata + " adalah Palindrome");
        }else{
            System.out.println(kata + " bukan Palindrome");
        }
    }
}
