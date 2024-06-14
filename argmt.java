class arg {
    String name = "Yonas Yohannes";
    String name1 = "setelew chala";
    String names[] = {"one", "two", "three", "four"};

    void display()
    {
        System.out.println(name);
        System.out.println(names[2]);
        System.out.println("char index of 4 " + name.charAt(3));
        System.out.println("length of name " + name.length());
        
        if (name.equals(name1))
            System.out.println("true");
        else
            System.out.println("false");

    }
}

public class argmt
{
    public static void main(String args[])
    {
        arg a = new arg();
        a.display();

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}

