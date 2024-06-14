class outer{
    int outer_x = 54;
    
    void inDisplay()
    {
        inner i = new inner();
        i.display();
        System.out.println("outer class value of inner_x " + i.inner_x);
        System.out.println("outer class value of outer_x " + outer_x);
    }
    class inner{
        int inner_x = 8;

        void display()
        {
            System.out.println("value of outer_x " + outer_x);
            System.out.println("value of inner_x " + inner_x);
        }
    }
}

public class nested
{
    public static void main(String args[])
    {
        outer o = new outer();
        o.inDisplay();
    }
}