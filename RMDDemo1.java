class Base
{
    public int i,j;
}

class Derived extends Base
{
    public int x;
}

class RMDDemo1
{
    public static void main(String A[])
    {
        Base bp1 = new Base(); // Nocasting
        Derived bp1 = new Derived()l //Nocasting
        Base bp2 = new Derived(); // Upcasting
        Base bp2 = new Base(); //Downcasting //error
    }
}