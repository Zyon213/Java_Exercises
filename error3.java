class error3
{
    static void tryMe() throws NullPointerException
    {
        try{
            // throw new NullPointerException("Null");
        }
        finally
        {
            System.out.println("NUll done");
        }
    }
    static void demoErr()
    {
        try{
            throw new NullPointerException("Demo");
        }
        catch (NullPointerException e)
        {
            System.out.println("caught inside demoErr");
            throw e;
        }
    }

    static void throwErr() throws IllegalAccessException
    {
        try{
            System.out.println("Illegal access inside throwErr");
            throw new IllegalAccessException("Illegal");
        }
        finally
        {
            System.out.println("done");
        }
    }
    public static void main(String args[])
    {
        try
        {
            demoErr();
            tryMe();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught " + e);
        }

        try
        {
            throwErr();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("inside main");
        }

    }
}