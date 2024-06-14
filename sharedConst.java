import java.util.Random;

interface sharedVar {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class randomVal implements sharedVar {
    int askMe() {
        Random rand = new Random();
        int c = (int) (100 * rand.nextDouble());

        if (c < 20)
            return NO;
        else if (c < 40)
            return YES;
        else if (c < 60)
            return MAYBE;
        else if (c < 80)
            return LATER;
        else if (c < 90)
            return SOON;
        else
            return NEVER;
    }
}

class swtichVar implements sharedVar {
    void answerMe(int i) {
        switch (i) {
            case NO:
                System.out.println("You answer is NO");
                break;
            case YES:
                System.out.println("You answer is YES");
                break;
            case MAYBE:
                System.out.println("You answer is MAYBE");
                break;
            case LATER:
                System.out.println("You answer is LATER");
                break;
            case SOON:
                System.out.println("You answer is SOON");
                break;
            default:
                System.out.println("You answer is NEVER");
                break;

        }
    }
}

public class sharedConst {
    public static void main(String args[]) {
        randomVal r = new randomVal();
        int i = r.askMe();
        System.out.println("your answer is " + i);

        swtichVar s = new swtichVar();
        s.answerMe(i);
    }
}