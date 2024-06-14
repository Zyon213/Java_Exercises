class a {
    public interface Nest {
        boolean isNum(int i);
    }
}

class b implements a.Nest
{
    public boolean isNum(int i)
    {
        return i < 0 ? false : true;
    }
}

public class tester
{
    public static void main(String args[])
    {
        a.Nest a = new b();
        System.out.println("value is " + a.isNum(-2));
    }
}