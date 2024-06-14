class mytest{
    int a;

    mytest(int aa)
    {
        a = aa;
    }

    mytest create()
    {
        mytest tst = new mytest(a + 6);
        return tst;
    }
}

public class test1 {

    public static void main(String args[])
    {
        mytest t = new mytest(5);
        mytest t1;

        t1 = t.create();

        System.out.println(t1.a);
    }
    
}
