package beginTrials;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class useSwitch {
    enum House {
        Arryn, Baratheon, Frey, Greyjoy, Lannister, Martell, Stark, Targaryen, Tully, Tyrell
    }

    public void display() {

        Scanner userIn = new Scanner(in);
        String pick = userIn.nextLine();
        String name = null;

       for (House all : House.values()) {
            if (all.toString().equals(pick)) {
                name = pick;
                break;
            }
        }

        switch (name) {
            case ("Arryn"):
                out.println("As High as Honor.");
                break;
            case ("Baratheon"):
                out.println("Ours is the Fury");
                break;
            case ("Frey"):
                out.println("*Traitorous House Selected");
                out.println("House Words Blocked");
                break;
            case ("GreyJoy"):
                out.println("We Do Not Sow");
                break;
            case ("Lannister"):
                out.println("Hear Me Roar!");
                break;
            case ("Martell"):
                out.println("Unbowed, Unbent, Unbroken");
                break;
            case ("Stark"):
                out.println("Winter is Coming");
                break;
            case ("Targaryen"):
                out.println("Fire and Blood");
                break;
            case ("Tully"):
                out.println("Family, Duty, Honor");
                break;
            case ("Tyrell"):
                out.println("Growing Strong");
                break;
            default:
                out.println("Unknown House");
        }
    }
}
