package cs.edu.bsu;

import java.io.IOException;

public class TravelGuide extends UserInput
{
   public static String search;
   public static String checkReturn;


    public String readStateInput()
    {
        String mainSearch;
        mainSearch=getStateInput();
        return mainSearch;
    }





    public String stateSearcher() throws IOException
    {
        search=readStateInput();
        CheckSearchField checker = new CheckSearchField();
        checkReturn= checker.stateHasPark(search);
        if (!checkReturn.isEmpty() && checker.isStateWithPark(search))
        {
            System.out.println(checkReturn);
        }
        else
        {

            InputLogic logic = new InputLogic();
            search = logic.noStateExists();

            //method to check this answer
            logic.enterDifferentState(search);
        }
        return search;
    }



                //parkSearcher must have input parameter for GUI functionality
    public void parkSearcher(String search) throws IOException {
        search=getContinueInput();
        search=getParkInput(search);
        CheckSearchField checker = new CheckSearchField();
        search=checker.readParkInput(search);
        System.out.println(search);
    }

    public String checkParkSearch(String search)
    {
        String outputString;
        if(search.equals("No valid park input given"))
        {
            outputString = "No valid park input given";
            return outputString;
        }
        else
        {
            return search;
        }
    }
}
