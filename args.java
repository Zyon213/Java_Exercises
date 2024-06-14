public class args {

    static void display(int x[])
    {
        for (int i : x)
            System.out.println(i + " ");
            System.out.println(" ****************** ");
            
        }
        
        static void varDisplay(int ...y)
        {
            for (int j : y)
                System.out.println(j + " ");
            System.out.println(" ****************** ");

    }

   static void mulDisplay(int a, double b, int ...c)
    {
        System.out.println(a);
        System.out.println(b);

        for (int t : c)
            System.out.println(t);
        System.out.println("+++++++++++++++");
        
    }

    static void mulDisplay(boolean y, int ...c)
    {
        System.out.println(y);

        for (int t : c)
            System.out.println(t);
        System.out.println("+++++++++++++++");
        
    }

    public static void main(String args[])
    {
        int a[] = { 3, 4, 5, 7};
        int b[] = { 7,8,9,0,2,4,6};
        int c[] = { };

        display(a);
        display(b);
        display(c);

        varDisplay(5, 6);
        varDisplay();
        varDisplay(1, 2,3 ,4 ,5, 6, 7);

        mulDisplay(3, 5.4, 5,6,7,8,9);
        mulDisplay( true, 5,6,7,8,9);
    }
    
}
