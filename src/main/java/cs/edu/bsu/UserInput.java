package cs.edu.bsu;



import java.io.IOException;
import java.util.Scanner;

public class UserInput
{
    Scanner console = new Scanner(System.in);
    String search = "";
    public String getStateInput()
    {
        System.out.println("What state would you like to search?");
        search = console.nextLine();
        return search;
    }

    public String getParkInput(String search) throws IOException
    {
        search=search.toUpperCase();
        if(search.equals("Y")|| search.equals("YES"))
        {
            System.out.println("What park would you like to know more about?");
            search = console.nextLine();
            return search;
        }
        if(search.equals("NO")||search.equals("N"))
        {
            InputLogic logic = new InputLogic();
            search=logic.noStateExists();
            logic.enterDifferentState(search);
        }
        else
        {
            System.out.println("No valid input given");
            search = getContinueInput();
            search=getParkInput(search);
            return search;
        }
        return search;

    }

    public String getContinueInput()
    {
        System.out.println("Would you like to know more about one of these parks?");
        search = console.nextLine();
        return search;
    }

}
