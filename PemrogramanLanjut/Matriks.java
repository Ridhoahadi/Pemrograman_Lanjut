package PemrogramanLanjut;

import java.util.*;

public class Matriks
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int A[][] = new int[5][5];
        int B[][] = new int[5][5];
        int C[][] = new int[5][5];

        int m,n,o,p,i,j,k, hasil=0;

        System.out.print("Masukkan baris matriks A = ");
        m = s.nextInt();
        System.out.print("Masukkan kolom matriks A = ");
        n = s.nextInt();
        System.out.print("Masukkan baris matriks B = ");
        o = s.nextInt();
        System.out.print("Masukkan kolom matriks B = ");
        p = s.nextInt();

        if (n!=p)
        {
            System.out.println("Matriks tidak dapat dikalikan \n");
        }
        else
        {
            System.out.println("Masukkan elemen matriks A = ");
            for (i =0; i< m;i++)
            {
                for (j = 0; j < n;j++)
                {
                    A[i][j] = s.nextInt();
                }
            }
            System.out.println("Masukkan elemen matriks B = ");
            for (i = 0; i < o;i++)
            {
                for (j = 0; j < p; j++)
                {
                    B[i][j] = s.nextInt();
                }
            }
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < p; j++)
                {
                    for (k = 0; k < o;k++)
                    {
                        hasil = hasil + A[i][k] * B[k][j];
                    }
                    C[i][j] = hasil;
                    hasil = 0;
                }
            }
            System.out.println("Hasil perkalian matriks = ");
            for (i =0; i < m;i++)
            {
                for (j =0; j<p;j++)
                {
                    System.out.print(C[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
