import java.util.Random;

class error1
{

    static void subrut()
    {
        Random r = new Random();
        int a = 0;
        int b = 0;
        int c = 0;



            for (int i = 0; i < 1000; i++)
            {
                try{

                    a = r.nextInt();
                    b = r.nextInt();
                    c = 12 / (a / b);
                    // System.out.println("value of a and b is " + a + " ---- " + b);
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Exception: " + e);
                    c = 0;
                }
                System.out.println("value of c is " + c);
            }
        }
    public static void main(String args[])
    {
        // error1.subrut();

        try{
            int a = args.length;
            System.out.println("lentth of args is " + a );
            int b = 43 / a;
            int c[] = { 4 };
            // int d = c[42];
            c[23] = 32;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e );
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e );
            
        }
        catch (Exception e)
        {

            System.out.println(e );
        }
    }
}