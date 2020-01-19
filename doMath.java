package beginTrials;
import static java.lang.System.out;

public class doMath {
    //Creation of int variable
    public static int number;
    
    //Creation of Constructor
    public doMath(int given) {
        this.number = given;
    }
    //Method to be inherited
    public int useNumber() {
        int use = number * number;
        return use;
    }
    //Prints to user
    public void display() {
        out.printf("The square of %s is %s\n",number,useNumber());
        out.print("Trial 2 Complete\n");
        out.println();
    }
}
