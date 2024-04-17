package cs.edu.bsu;

import java.io.IOException;

public class TravelGuide extends UserInput
{
   public static String search;
   public static boolean checkReturn;
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
        if (checkReturn)
        {
           search=getContinueInput();
        }
        else
        {
            InputLogic logic = new InputLogic();
            search = logic.noStateExists(checkReturn);

            //method to check this answer
            logic.enterDifferentState(search);
        }
        return search;
    }



    public void parkSearcher() throws IOException {
        search=getParkInput(search);
        CheckSearchField checker = new CheckSearchField();
        checker.readParkInput(search);

        InputLogic logic = new InputLogic();
        search=logic.noStateExists(false);
        logic.enterDifferentState(search);

    }
}
