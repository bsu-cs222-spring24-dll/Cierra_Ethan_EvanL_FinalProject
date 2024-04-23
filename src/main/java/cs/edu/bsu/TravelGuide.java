package cs.edu.bsu;

import java.io.IOException;

public class TravelGuide extends UserInput
{
   public static String search;
   public static String checkReturn;


    public String readStateInput()
    {
        String mainSearch="";
        mainSearch=getStateInput();
        return mainSearch;
    }





    public String stateSearcher() throws IOException {
        search=readStateInput();

        CheckSearchField checker = new CheckSearchField();
        checkReturn= checker.stateHasPark(search);
        //checkReturn= list of parks in the state
        //System.out.println(checkReturn);

        if (!checkReturn.isEmpty())
        {
            System.out.println(checkReturn);

        }
        else
        {
            System.out.println("NO STATE EXISTS");
            InputLogic logic = new InputLogic();
            search = logic.noStateExists();

            //method to check this answer
            logic.enterDifferentState(search);
        }


        return search;
    }



    public String parkSearcher(String search) throws IOException {
        search=getContinueInput();
        search=getParkInput(search);
        CheckSearchField checker = new CheckSearchField();
        //If park is spelled incorrectly program crashes

        search=checker.readParkInput(search);
        System.out.println(search);
        return search;

        /*
        InputLogic logic = new InputLogic();
        search=logic.noStateExists();
        logic.enterDifferentState(search);

         */

    }
}
