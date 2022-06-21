package academy.learnprogramming.Arrays.ZombieKiller;

import java.util.ArrayList;
import java.util.Arrays;

public class ZombieKiller {

    public static void main(String[] args) {

//        System.out.println("Welcome to the Zombie Apocalypse! Let's kill some zombies.");
//
//        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
//        String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
//
//        System.out.println(backpack[2]);
//        System.out.println(backpack[2]);
//        System.out.println(backpack[2]);
//        System.out.println(backpack[0]);

//        System.out.println("Backpack items");
//        System.out.println(backpack[0]);
//        System.out.println(backpack[1]);
//        System.out.println(backpack[2]);
//
//        System.out.println("These are the zombies,");
//        System.out.println(zombies[0]);
//        System.out.println(zombies[1]);
//        System.out.println(zombies[2]);
//
//        int num[] = new int[3];
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
        String[] friendsArray = {"ty","liz","joe"};
//        ArrayList<String> friends = new ArrayList<>();
        ArrayList<String> friends2 = new ArrayList<>(Arrays.asList("tyler", "john", "liz"));

        System.out.println(friendsArray[1]);
        System.out.println(friends2.get(1));
        System.out.println(friendsArray.length);
        System.out.println(friends2.size());
        //cant add to arrays end
        friends2.add("lenny");
        System.out.println(friends2.get(3));

        friendsArray[0] = "carl";
        System.out.println(friendsArray[0]);

        friends2.set(0,"bill");
        System.out.println(friends2.get(0));

        friends2.remove(1);
        friends2.remove("tyler");

        System.out.println(friendsArray);
        System.out.println(friends2);
    }
}
