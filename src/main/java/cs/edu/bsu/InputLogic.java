package cs.edu.bsu;

public class InputLogic
{
    //String state ="";
    UserInput console = new UserInput();
    public String checkModeInput(String search)
    {
        if(search.equals("State"))
        {
            return console.getStateInput();
        }
        else
        {
            return "No valid input given";
        }
    }

    public String continueInputLogic(boolean check)
    {
       String userAnswer;
        UserInput test = new UserInput();
        if(check)
        {
            userAnswer=test.getContinueInput();
        }
        else
        {
            userAnswer="no";
            System.out.println("No park searched");
            System.out.println("LOGGING OFF");
            System.exit(0);
        }
        return userAnswer;
    }
}

