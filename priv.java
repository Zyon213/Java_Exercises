class prv {

    private int a;
    private int b;
    public int c;
    
    prv(int aa, int bb, int cc)
    {
        a = aa;
        b = bb;
        c = cc;
    }

    void setA(int aa)
    {
        a = aa;
    }

    int getA()
    {
        return a;
    }

    void setB(int bb)
    {
        b = bb;
    }

    int getB()
    {
        return b;
    }
}

public class priv{
public static void main(String args[])
{
    prv p = new prv(4, 5, 6);

    System.out.println(p.getA());
    System.out.println(p.getB());
    System.out.println(p.c);
    
    p.setA(78);
    p.setB(87);
    
    System.out.println(p.getA());
    System.out.println(p.getB());
    System.out.println(p.c);
}


}