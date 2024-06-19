class error2 {
    static void nested(int i)
    {
        try{
            if (i == 1)
                i = i / (i - i);
            if (i == 2)
            {
                int c[] = {5};
                int f = c[5];
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of range index");
        }
    }
    public static void main(String args[]) {

        try{
            int a = args.length;
            // int b = 43 / a;
            // int f[] = { 5};
            // // int g = f[25];
            //  try{
            //     if (a == 1)
            //         a = a / (a - a);
                
            //     if (a == 2)
            //     {
            //         int c[] = { 3};
            //         int d = c[43];
            //     }

            nested(2);
                    
            }
            // catch (ArrayIndexOutOfBoundsException e)
            // {
            //     System.out.println("out out of range array");
            // }
        
            catch (ArithmeticException e)
            {
                System.out.println("division by zero");
            }
        }
    }