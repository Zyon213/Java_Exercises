interface A{
    void touchMe();

    static void showMe()
    {
        System.out.println("This is show me");
    }

    static int getInt()
    {
        return 5;
    }
}

public class staticMtd
{
    public static void main(String args[])
    {
        A.showMe();
        System.out.println("value is " + A.getInt());
    }
}