package PemrogramanLanjut;
public class InsertDescending
{
    public static void main(String[] args) {
        String A [] ={"RIDHOAHADI"};
        String v;
        int j,k,i;
        char var = 'A';

        //Proses pengulangan Ascending
// Menggunakan dua perulangan (Loop) dalam Array
        for ( i = 1; i < A.length; i++)
        {
            v = A[i];
            j = i - 1;
            while (j > 0 && A[j-1].compareTo(v) > 0)
            {
                A[j] = A[j-1];
                j--;
                // j = j-1 sama artinya dengan j--
            }
            A[j] = v;
        }
        System.out.println("Setelah diurutkan Descending: ");
        for ( k = 0;k < A.length-1; k++)
        {
            System.out.print(A[k] + " ");
        }
    }

/**
        public static void main(String args[]) {

            // Sorting String array using Insertion Sort in Java
            String[] cities = {"London", "Paris", "Tokyo", "NewYork", "Chicago", "Milan", "Emire"};
            System.out.println("String array before sorting : "
                    + Arrays.toString(cities));
            insertionSort(cities);

            System.out.println("String array after sorting : "
                    + Arrays.toString(cities));
        }

        public static void insertionSort(int[] array) {
            // insertion sort starts from second element
            for (int i = 1; i < array.length; i++) {
                int numberToInsert = array[i];

                int compareIndex = i;
                while (compareIndex > 0 && array[compareIndex - 1] > numberToInsert) {
                    array[compareIndex] = array[compareIndex - 1]; // shifting element
                    compareIndex--; // moving backwards, towards index 0
                }

                // compareIndex now denotes proper place for number to be sorted
                array[compareIndex] = numberToInsert;
            }
        }

        /*
         * Method to Sort String array using insertion sort in Java.
         * This can also sort any object array which implements
         * Comparable interface.
         */
        public static void insertionSort(Comparable[] objArray)
        {
            // insertion sort starts from second element
            for (int i = 1; i < objArray.length; i++)
            {
                Comparable objectToSort = objArray[i];

                int j = i;
                while (j > 0 && objArray[j - 1].compareTo(objectToSort) > 1)
                {
                    objArray[j] = objArray[j - 1];
                    j--;
                }
                objArray[j] = objectToSort;
            }
        }

}