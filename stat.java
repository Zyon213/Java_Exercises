class statDemo
{
    static int a;
    static int b;

    static {
        a = 5;
        b = 6;
        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
    }

    static void callMe(int x)
    {
        System.out.println("value of a after " + ( a * x));
        System.out.println("value of b after " + ( b * x));
    }
}

public class stat{

    public static void main(String args[])
    {
        statDemo.callMe(5);
        System.out.println("value of a in main " + statDemo.a);
        System.out.println("value of b in main " + statDemo.b);
    }
}