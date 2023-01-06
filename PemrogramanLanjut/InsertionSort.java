package PemrogramanLanjut;
public class InsertionSort
{
    /*
    public static void main(String[] args)
    {
        int[] A = {11 , 7, 3, 5, 9};
        int j,sisipan,k,i;

            //Proses pengulangan

        for ( i = 1; i < A.length; i++)
        {
            sisipan = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > sisipan)
            {
                A[j +1] = A[j];
                j--;
                // j = j-1 sama artinya dengan j--
            }
            A[j + 1] = sisipan;
        }
        System.out.println("Setelah diurutkan Ascending: ");
        for ( k = 0;k < A.length; k++)
        {
            System.out.print(A[k] + " ");
        }
    }

     */
    /*
    public static void main (String [] args)
    {
        int bilangan [] = {3, 2, 4, 1, 5};

        System.out.println("======== KELOMPOK 4 =========");
        System.out.println("____________________________");
        System.out.println("SEBELUM DIURUTKAN");
        for (int b: bilangan)
        {
            System.out.print(" " + b + ",");
        }
        System.out.println("\n____________________________");
        //proses pengulangan
        for (int i = 1; i < bilangan.length; i++)
        {
            int masukan = bilangan[i];
            int j = i-1;
            while (j >= 0 && bilangan[j] > masukan)
            {
                bilangan[j+1]= bilangan[j];
                j = j-1;
            }
            bilangan[j + 1] = masukan;
        }
        System.out.println("____________________________");
        System.out.println("SETELAH DIURUTKAN");
        for (int k = 0; k < bilangan.length; k++)
        {
            System.out.print(" " + bilangan [k] + ",");
        }
        System.out.println("\n____________________________");
    }
    */

    public static void main (String [] args)
    {
        String [] huruf ={"S", "O", "R", "T", "E", "X", "A", "M", "P", "L",
                "E"};
        String v;

        System.out.println("======== KELOMPOK 4 =========");
        System.out.println("____________________________");
        System.out.println("SEBELUM DIURUTKAN");
        for (String b: huruf)
        {
            System.out.print(" " + huruf + ",");
        }
        System.out.println("\n____________________________");
        //proses pengulangan
        for (int i = 1; i < huruf.length; i++)
        {
            String m = huruf [i];
            int j = i-1;
            while (j > 0 && huruf[j].compareTo(m) > 1)
            {
                huruf[j+1] = huruf[i];
                j = j-1;
            }
            huruf[j + 1] = m;
        }
        System.out.println("____________________________");
        System.out.println("SETELAH DIURUTKAN");
        for (int k = 0; k < huruf.length; k++)
        {
            System.out.print(" " + huruf [k] + ",");
        }
        System.out.println("\n____________________________");
    }
}