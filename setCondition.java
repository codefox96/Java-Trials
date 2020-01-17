package beginTrials;

import static java.lang.System.out;

public class setCondition extends doMath {
    public setCondition(int trial3) {
        super(trial3);
    }

    public void display(){
        if (useNumber() >= 50) {
            out.printf("%s is greater than 50\n",useNumber());
            out.print("Trial 3 Complete\n");
            out.println();
        }
        else{
            out.printf("%s is not greater than 50\n",useNumber());
            out.print("Trial 3 Complete\n");
            out.println();
        }
    }
}

