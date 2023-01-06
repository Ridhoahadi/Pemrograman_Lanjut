package PemrogramanLanjut;
import java.util.Scanner;


 public class DigitBiner {
     public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka =  ");
        int x = sc.nextInt();
        System.out.print("Konversi Biner = " +DigitBiner.toBinary(x));
    }

    public static String toBinary(int num){
        String binary="";
        while(num > 0) {
            binary = (num%2)+binary;
            num=num/2;
        }
        return binary;
    }
 }

  /**
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Angka = ");
    int n = input.nextInt();
    int count;

         count = 1;
         while (n > 1){
             count = (n%2)+count;
             n=n/2;
         }
         System.out.print("Konversi Bilangan Biner = " +count);
         return;
     }
}
**/