// Example of extending interface (inherit interface to a subinterface)

interface A{
    void showMe();
    void answerMe();
}

interface B extends A
{
    void askMe();
}

class C implements B
{
    public void showMe()
    {
        System.out.println("This is show Me");
    }
    
    public void answerMe()
    {
        System.out.println("This is answer Me");
    }
    
    public void askMe()
    {
        System.out.println("This is ask Me");

    }
}

public class nestedInt
{
    public static void main(String args[])
    {
        C cc = new C();
        cc.showMe();
        cc.answerMe();
        cc.askMe();
    }
}