package cs.edu.bsu;

import java.io.IOException;
import java.util.Scanner;

public class InputLogic
{
    //String state ="";
    UserInput console = new UserInput();

    public String noStateExists(boolean check)
    {
        String userAnswer;


        System.out.println("Enter a different state?");
        Scanner console = new Scanner(System.in);
        userAnswer= console.nextLine();
        return userAnswer;
    }


    public void enterDifferentState(String answer) throws IOException {
        answer=answer.toUpperCase();
        if(answer.equals("YES")||answer.equals("Y"))
        {
            TravelGuide guide = new TravelGuide();
            guide.stateSearcher();
        }
        if (answer.equals("NO")||answer.equals("N"))
        {
            System.out.println("LOGGING OFF");
            System.exit(0);
        }
        else
        {
            System.out.println("No valid input given");

            answer=noStateExists(false);
            enterDifferentState(answer);
        }
    }
}

