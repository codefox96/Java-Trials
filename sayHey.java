package beginTrials;

import static java.lang.System.out;

//Initialization of "sayHey" class
public class sayHey {
    //Initialization of string variable
    public String trial1;

    //Initialization of "sayHey" constructor
    public sayHey(String trial1) {
        this.trial1 = trial1;
    }

    //Method for displaying the message
    public void display() {
        out.print(trial1);
        out.println();
    }
}
