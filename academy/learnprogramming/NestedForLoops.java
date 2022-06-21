package academy.learnprogramming;

public class NestedForLoops {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("Its hot out");
        }

        System.out.println("--------------");

        String[] colors = {"red", "blue", "green"};

        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("--------------");

        String[][] fancyColors = { {"red", "blue", "green"},
                                    {"cyan", "magenta", "turqoise"}
        };

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(fancyColors[row][column]);
            }
        }
        System.out.println("--------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
