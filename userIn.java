package beginTrials;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class userIn {
    protected Random rand = new Random();//check bounds

    public void display() {
        out.println("pick the correct number to open the lock (Range 0-1):");
        int lock = rand.nextInt(2);
        Scanner keyhole = new Scanner(in);
        int key = keyhole.nextInt();



        if (key==lock) {
            out.printf("Nice guess! This lock sucks!\n");
            out.println("Trial 4 Complete");
            out.println("Trial 5 Unlocked\n");
        }
        else {
            out.printf("Sorry the number was %s \n",lock);
            out.println();
            display();
        }
       // keyhole.close();
    }
}
