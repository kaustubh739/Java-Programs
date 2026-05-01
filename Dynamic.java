import java.util.Scanner;

class Dynamic
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;

        System.out.println("Enter the number of elements : ");

        length = sobj.nextInt();

        Arr = new int[length];

        if(Arr == null)
        {
            System.out.println("Unable to allocate the memory");
        }
        else
        {
            System.out.println("Memory get sucessfully allocated");
        }
        Arr =null;
        System.gc();

    }
}