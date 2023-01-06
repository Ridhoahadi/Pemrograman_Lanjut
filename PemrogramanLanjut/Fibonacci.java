package PemrogramanLanjut;
import java.util.*;

public class Fibonacci
{
    public static void main(String[] args)
	{
        /**
        int n = 0;
        int recursive;
        int maxnumber = 10;

        for (int i = 0; i < maxnumber; i++)
        {
            if (n == 0){
                return;
            }
            if (n == 1 || n == 2){
                return;
            }
            System.out.println( maxnumber );

        }
    }
}
//end class
public class Fibonacci {
 public static int fibonacciRecursion(int n){
  	if(n == 0){
  		return 0;
         }
  	if(n == 1 || n == 2){
  			return 1;
         }
  	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
     }
      public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Masukkan jumlah fibonacci = ");
  	   int maxNumber = scan.nextInt();
         System.out.println("Fibonacci dari "+maxNumber+" adalah : ");

    	for(int i = 0; i < maxNumber; i++){
  			System.out.print(fibonacciRecursion(i) +" ");
         }
     }
  }
 **/
		/*
        Scanner input = new Scanner(System.in);

		int i;
		double hasilKali = 1;

		System.out.println("Masukkan nilai i: ");
		i = input.nextInt();

		for (int j = 1; j <= i; j++){
			hasilKali = hasilKali * 1;
		}
		System.out.print("Hasil kali deret bilangan = " + hasilKali);

		 */

		int n1 = 0;
		int n2 = 1;
		int n3;
		int hitung = 5;

		System.out.print(n1 + " "+ n2);

		for (int i = 0; i < hitung; i++) {

			n3 = n1 + n2;
			System.out.print(" " +n3);

			n1 = n2;
			n2 = n3;
		}
	}
}