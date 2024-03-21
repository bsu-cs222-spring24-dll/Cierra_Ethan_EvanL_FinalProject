package cs.edu.bsu;


import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String i="";
        System.out.println();
        while(!Objects.equals(i, "n") && !Objects.equals(i, "N"))
        {
            UserInput user = new UserInput();
            InputLogic test = new InputLogic();
            CheckSearchField check = new CheckSearchField();
            String search = "";
            search =user.getModeInput();
            search = test.checkModeInput(search);
            Boolean logicCheck = check.stateHasPark(search);
            System.out.println("New Search?");
            i = console.nextLine();
            break;
        }

        System.out.println("LOGGING OFF");





    }
}


