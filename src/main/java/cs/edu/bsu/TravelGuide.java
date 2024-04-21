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
        System.out.println(checkReturn);
        if (checkReturn)
        {
           search=getContinueInput();
        }
        else
        {
            System.out.println("NO STATE EXISTS");
            InputLogic logic = new InputLogic();
            search = logic.noStateExists(checkReturn);

            //method to check this answer
            logic.enterDifferentState(search);
        }

        parkSearcher(search);
        return search;
    }



    public void parkSearcher(String search) throws IOException {

        search=getParkInput(search);
        CheckSearchField checker = new CheckSearchField();
        //If park is spelled incorrectly program crashes

        checker.readParkInput(search);


        InputLogic logic = new InputLogic();
        search=logic.noStateExists(false);
        logic.enterDifferentState(search);

    }
}
