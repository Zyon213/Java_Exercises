interface IntStack {
    void push(int item);

    int pop();

    void display();
}

class fixedStack implements IntStack {
    private int stk[];
    private int index;

    fixedStack(int size) {
        stk = new int[size];
        index = -1;
    }

    public void push(int item) {
        if (index == stk.length - 1)
            System.out.println("Stack is full");
        else
            stk[++index] = item;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else
            return (stk[index--]);
    }

    public void display() {
        System.out.println("Size of the stack is " + stk.length);
        for (int i = 0; i < stk.length; i++)
            System.out.println("index [ " + i + " ] " + "value is " + stk[i]);
    }
}

class dynStack implements IntStack {
    private int stk[];
    private int index;

    dynStack(int size) {
        stk = new int[size];
        index = -1;
    }

    public void push(int item) {
        if (index == stk.length - 1) {
            int temp[] = new int[stk.length * 2];
            for (int i = 0; i < stk.length; i++)
                temp[i] = stk[i];
            stk = temp;
            stk[++index] = item;
        } else
            stk[++index] = item;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return stk[index--];
    }

    public void display() {
        System.out.println("Size of the stack is " + stk.length);
        for (int i = 0; i < stk.length; i++)
            System.out.println("index [ " + i + " ] " + "value is " + stk[i]);
    }
}

public class demo {
    public static void main(String args[]) {

        System.out.println("***********************");
        dynStack d = new dynStack(2);
        for (int i = 0; i < 33; i++)
            d.push(i);
        
        d.display();
        for (int j = 0; j < 15; j++)
            d.pop();
        d.display();
        
    }
}