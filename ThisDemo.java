class Demo
{
    public int i;
    public static int j;

    static//static block
    {
        j = 21;
    }

    public Demo()//constructor
    {
        System.out.println("Inside Default");
        this.i = 11; //First use
    }

    public Demo (int a)
    {
        this(); //second use
        System.out.println("Inside parameterised");
    }
    public void Display()
    {
        System.out.println("Inside Display"+this.i); // Third use
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}