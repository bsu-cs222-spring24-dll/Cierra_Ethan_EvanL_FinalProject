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
   /*if String search is no, then program crashes... need to figure out a way to have getParkInput recognize a 'no'
   input and end the program without an error*/
    {
        search=search.toUpperCase();
        if(search.equals("YES")||search.equals("Y"))
        {
            System.out.println("What park would you like to know more about?");
            search = console.nextLine();
            return search;
        }
        if(search.equals("NO")||search.equals("N"))
        {
            InputLogic logic = new InputLogic();
            search=logic.noStateExists(false);
            logic.enterDifferentState(search);
        }
        else
        {
            System.out.println("No valid input given");
            search = getContinueInput();
            getParkInput(search);
        }
        return search;

    }

    public String getContinueInput()
    {

        System.out.println("Would you like to know more about one of these parks?");
        search = console.nextLine();
        return search;
    }





    //Loops the main program so user can search multiple states or search again after a typo
    public String loop() throws IOException {
        Scanner console = new Scanner(System.in);
        String i="y";
        i=i.toUpperCase();
        System.out.println();
        while(i.equals("Y") || i.equals("YES"))
        {

            UserInput user = new UserInput();
            InputLogic test = new InputLogic();
            CheckSearchField check = new CheckSearchField();



            String search = "";
            search = user.getStateInput();

            boolean logicCheck = check.stateHasPark(search);

           // search=test.continueInputLogic(logicCheck);
            //make a break here

            //new method for the following lines
            search=user.getParkInput(search);
            check.readParkInput(search);
            System.out.println(search);
            System.out.println("New Search?");
            i = console.nextLine();
            i=i.toUpperCase();
        }
       return "LOGGING OFF";
    }


}
