package beginTrials;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        sayHey trial1 = new sayHey("Trial 1 Complete.\n");
        trial1.display();

        doMath trial2 = new doMath(5);
        trial2.display();

        setCondition trial3 = new setCondition(doMath.number);
        trial3.display();

        userIn trial4 = new userIn();
        trial4.display();

        useSwitch trial5 = new useSwitch();
        trial5.display();
    }
}

