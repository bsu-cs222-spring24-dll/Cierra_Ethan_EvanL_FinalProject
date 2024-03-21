package cs.edu.bsu;

public class CheckSearchField
{
    //Check if input was given
    public boolean hasInput(String search)
    {
        if(search.isBlank())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean stateHasPark(String search)
    {
        String capSearch = search.toUpperCase();
        if(capSearch.equals("INDIANA") || capSearch.equals("CALIFORNIA") || capSearch.equals("ALASKA") || capSearch.equals("ARIZONA") || capSearch.equals("ARKANSAS")
                || capSearch.equals("OHIO") || capSearch.equals("COLORADO") || capSearch.equals("FLORIDA") ||
                capSearch.equals("HAWAII") || capSearch.equals("IDAHO") || capSearch.equals("KENTUCKY") || capSearch.equals("MAINE") ||
                capSearch.equals("MICHIGAN") || capSearch.equals("MINNESOTA") || capSearch.equals("MISSOURI") || capSearch.equals("MONTANA")
                || capSearch.equals("NEVADA") || capSearch.equals("NEW MEXICO") || capSearch.equals("NORTH DAKOTA") ||
                capSearch.equals("NORTH CAROLINA") || capSearch.equals("OREGON") || capSearch.equals("SOUTH CAROLINA") ||
                capSearch.equals("SOUTH DAKOTA") || capSearch.equals("TENNESSEE") || capSearch.equals("TEXAS") || capSearch.equals("UTAH") ||
                capSearch.equals("VIRGINIA") || capSearch.equals("WASHINGTON") || capSearch.equals("WYOMING") || capSearch.equals("WEST VIRGINIA"))
        {
            System.out.println(search+" has a park");
            return true;
        }
        else
        {
            checkIfStateExists(search);

            return false;
        }
    }

    public String readStateFile(String search)
    {
        //This method will fit into the "stateHasPark" method and open the states related file
        return search;
    }




    public boolean isAState(String search)
    {
        String capSearch=search.toUpperCase();
        if(capSearch.equals("ALABAMA")||capSearch.equals("CONNECTICUT")||capSearch.equals("DELAWARE")||
                capSearch.equals("ILLINOIS")||capSearch.equals("IOWA")||capSearch.equals("KANSAS")||capSearch.equals("LOUISIANA")||
                capSearch.equals("MARYLAND")||capSearch.equals("MASSACHUSETTS")||capSearch.equals("MISSISSIPPI")||capSearch.equals("NEBRASKA")||
                capSearch.equals("NEW HAMPSHIRE")||capSearch.equals("NEW JERSEY")||capSearch.equals("NEW YORK")||capSearch.equals("RHODE ISLAND")||
                capSearch.equals("OKLAHOMA")||capSearch.equals("PENNSYLVANIA")||capSearch.equals("VERMONT")||capSearch.equals("WISCONSIN"))
        {
            return true;
        }
        else
        {

            return false;
        }

       }
    public boolean checkIfStateExists(String search)
    {
        boolean aState = isAState(search);
        if(aState)
        {
            System.out.println(search + " does not contain any national parks");
            return true;
        }
        else
        {
            System.out.println("No valid input given");
            return false;
        }
    }


    public String readParkInput(String search)
    {
        //This method should take the search variable, which will be the name of a state park, and open the file correlated to said park
        return search;
    }



}
