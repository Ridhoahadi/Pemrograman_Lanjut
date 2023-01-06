package PemrogramanLanjut;

import java.util.ArrayList;

public class Hari
{
    public static void main(String[] args)
    {
        ArrayList<String> aList=new ArrayList<String>();
        aList.add("Senin");
        aList.add("Selasa");
        aList.add("Rabu");
        aList.add("Kamis");
        aList.add("Jum'at");
        aList.add("Sabtu");
        aList.add("Ahad");

        System.out.println(aList);
        aList.add(3, "Rabu");
    }
}
