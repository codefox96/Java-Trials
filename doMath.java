package beginTrials;
import static java.lang.System.out;

public class doMath {
    //Initialization of int variable
    public static int number;

    public doMath(int given) {
        this.number = given;
    }

    //
    public int useNumber() {
        int use = number * number;
        return use;
    }

    public void display() {
        out.printf("The square of %s is %s\n",number,useNumber());
        out.print("Trial 2 Complete\n");
        out.println();
    }
}
