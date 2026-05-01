
//class Demo extends Object
class Demo implements Cloneable
{
    public int i,j;

    public Demo(int a,int b) //parameterised const
    {
        this.i = a;
        this.j = b;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}

class CloneDemo
{
    public static void main(String A[])
    {
        try
        {
        Demo dobj1 = new Demo(11,21); //obj
        Demo dobj2 = (Demo)dobj1.clone();

        System.out.println(dobj2.i);
        System.out.println(dobj2.j);
        }
        catch(CloneNotSupportedException cobj)
        {
            
        }
    }
}