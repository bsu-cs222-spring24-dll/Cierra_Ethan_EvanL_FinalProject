package cs.edu.bsu;

public class InputLogic
{
    UserInput console = new UserInput();
    public String checkModeInput(String search)
    {
        if(search.equals("State"))
        {
            return console.getStateInput();
        }
        if(search.equals("Park"))
        {
            return console.getParkInput();
        }
        else
        {
            return "Error";
        }
        }
    }

