
interface A
{
    int no = 11;
    void fun();
}
interface B
{
    int no = 21;
    void gun();
}

class Demo implements A,B // Multiple inhertance
{
    public void fun()
    {
        System.out.println("Inside fun"+A.no); // no generates errorn
    }
    private void Display()
    {
        System.out.println("")
    }
    
}

class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        //dobj.Dislay()  //error
        
    }
}