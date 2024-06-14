interface defaultInt1 {
    int getInt(int i);

    default String getString() {
        return "Default string";
    }
}

interface defaultInt2 extends defaultInt1 {
    void showMe();
    void askMe();
   default String getString() {
        return "Default extend string";
    }
}

interface defaultInt3 {
    void tryMe();

    default void makeMe() {
        System.out.println("Default value is Make me");
    }
}

class subDefault implements defaultInt1 {
    public int getInt(int i) {
        return i;
    }
}

class subDefault1 implements defaultInt2, defaultInt3 {
    public int getInt(int i) {
        return i;
    }

    // public String geString() {
    //     return "Implemented String";
    // }

    public void showMe() {
        System.out.println("value is show me");
    }

    public void askMe() {
        System.out.println("value is ask me");
    }

    public void tryMe() {
        System.out.println("value is try me");

    }
}

public class defaultInt {
    public static void main(String args[]) {

        subDefault s = new subDefault();
        // defaultInt d = new subDefault();
        System.out.println("value is " + s.getInt(4));
        System.out.println("value is " + s.getString());

        subDefault1 d1 = new subDefault1();
        System.out.println(d1.getString());
        d1.tryMe();
        d1.makeMe();

    }
}