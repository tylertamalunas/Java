package academy.learnprogramming.challenges;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // 1 MB = 1024 KB
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else {
            int megabytes = kiloBytes / 1024;
            int leftoverkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + leftoverkilobytes + " KB");
        }
    }
}
