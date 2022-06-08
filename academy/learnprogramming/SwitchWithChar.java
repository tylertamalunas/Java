package academy.learnprogramming;

public class SwitchWithChar {

    public static void main(String[] args) {

        char switchValue = 'b';

        switch(switchValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Value not found");
                break;
        }
    }
}
