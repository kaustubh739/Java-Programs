import java.util.*;

class Program293
{
    public static void main(String A[])
    {
        int Arr[] = {45,21,90,54,78};

        System.out.println(Arr);
        
        //this is foreach loop
        for(int no : Arr)
        {
            System.out.println(no);
        }
        Arrays.Sort(Arr);
        System.out.println("Array after sorting : ");

        for (int no : Arr)
        {
            System.out.println(no);
        }
    }
}