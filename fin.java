class fins {
    final int NUM = 6;
    final int NUM1 = 7;
    int n2 = 8;
    int arr[] = new int[5];
    int arr1[] = {2, 3, 5, 7};

    fins(int a, int b, int c)
    {
        // NUM = a;
        // NUM1 = b;
        n2 = c;
        arr[0] = 5;
    }
    
    void display()
    {
        System.out.println("length of arr " + arr.length);
        System.out.println("length of arr1 " + arr1.length);
        System.out.println("value of arr 0 " + arr[0]);
    }
}

public class fin{
    public static void main(String args[])
    {
        fins f = new fins(4, 5, 7);
        System.out.println("value of num " + f.NUM);
        System.out.println("value of num1 " + f.NUM1);
        System.out.println("value of n " + f.n2);
        f.display();
    }
}
