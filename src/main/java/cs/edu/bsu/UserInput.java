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

    public String getParkInput(String search)
   /*if String search is no, then program crashes... need to figure out a way to have getParkInput recognize a 'no'
   input and end the program without an error*/
    {
        search=search.toUpperCase();
        if(search.equals("YES")||search.equals("Y"))
        {
            System.out.println("What park would you like to know more about?");
            search = console.nextLine();


        }
        else
        {
            System.out.println("LOGGING OFF");
            System.exit(0);
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


            //first search must equal state due to checkMode input checking if search equals state in order to continue
            String search = "State";

            search = test.checkModeInput(search);
            boolean logicCheck = check.stateHasPark(search);

            search=test.continueInputLogic(logicCheck);
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
