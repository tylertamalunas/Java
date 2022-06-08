package academy.learnprogramming;

public class SwitchStatement {

    public static void main(String[] args) {

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, 4, or 5");
                break;

            default:
                System.out.println("was not 1,2,3,4, or 5");
                break;
        }
    }
}
