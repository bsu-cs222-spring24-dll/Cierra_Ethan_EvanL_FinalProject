package cs.edu.bsu;

public class InputLogic
{
    String state ="";
    UserInput console = new UserInput();
    public String checkModeInput(String search)
    {
        if(search.equals("State"))
        {
            return console.getStateInput();
        }
        if(search.equals("Park"))
        {
            return "0";
        }
        else
        {
            return "No valid input given";
        }
    }

    public String continueInputLogic(boolean check)
    {
       String userAnswer = "no";
        UserInput test = new UserInput();
        if(check==true)
        {
            userAnswer=test.getContinueInput();
            return userAnswer;
        }
        else
        {
            userAnswer="no";
            return userAnswer;
        }
    }
}

