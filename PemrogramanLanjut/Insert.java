package PemrogramanLanjut;
public class Insert {
    public static void main(String[] args) {
        int [] A ={2,4,5,3,1};
        int i,j,sisipan,k;
        String [] B ={"S", "O", "R", "T", "E", "X", "A", "M", "P", "L",
                "E"};

        for (i = 0; i < A.length;i++)
        {
            j = i;
            while (j > 0)
            {
                if(A[j] < A[j-1])
                {
                    sisipan = A[j];
                    A[j] = A[j-1];
                    A[j-1] = sisipan;
                }
                j--;
            }
        }
        for (k = 0; k < A.length; k++)
        {
            System.out.print(B[k]+", " );
        }
    }
}
/*
class Insertion
{
    public static void main(String[] args) {

        String [] A ={"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
        int i, j, k;

        for (i = 0; i < A.length; i++)
        {
            j = i;
            while (j > 0)
            {
                if(A[j].compareTo(A[j-1]) < 0)
                {
                    String v = A[j];
                    A[j] = A[j-1];
                    A[j-1] = v;
                }
                j--;
            }
        }
        for (k = 0; k < A.length; k++)
        {
            System.out.print(A[k]+", " );
        }
    }
}

 */