package cs.edu.bsu;

import java.io.IOException;

public class CheckSearchField
{
    //Check if input was given
    public String hasInput(String search)
    {
        return search;
    }

    public String stateHasPark(String search) throws IOException
    {
        if(isStateWithPark(search))
        {
            System.out.println(search+" contains the following parks:");
            PrintFile file = new PrintFile();
            return file.openFile(search,"states");
        }
        if(!isStateWithPark(search))
        {
            search=checkIfStateExists(search);
            System.out.println(search);
            return search;
        }
        return search;
    }


    public boolean isStateWithPark(String search)
    {
        String capSearch=search.toUpperCase();
        return capSearch.equals("INDIANA") || capSearch.equals("CALIFORNIA") || capSearch.equals("ALASKA") || capSearch.equals("ARIZONA") || capSearch.equals("ARKANSAS")
                || capSearch.equals("OHIO") || capSearch.equals("COLORADO") || capSearch.equals("FLORIDA") ||
                capSearch.equals("HAWAII") || capSearch.equals("IDAHO") || capSearch.equals("KENTUCKY") || capSearch.equals("MAINE") ||
                capSearch.equals("MICHIGAN") || capSearch.equals("MINNESOTA") || capSearch.equals("MISSOURI") || capSearch.equals("MONTANA")
                || capSearch.equals("NEVADA") || capSearch.equals("NEW MEXICO") || capSearch.equals("NORTH DAKOTA") ||
                capSearch.equals("NORTH CAROLINA") || capSearch.equals("OREGON") || capSearch.equals("SOUTH CAROLINA") ||
                capSearch.equals("SOUTH DAKOTA") || capSearch.equals("TENNESSEE") || capSearch.equals("TEXAS") || capSearch.equals("UTAH") ||
                capSearch.equals("VIRGINIA") || capSearch.equals("WASHINGTON") || capSearch.equals("WYOMING") || capSearch.equals("WEST VIRGINIA");
    }



    public boolean isAState(String search)
    {
        String capSearch=search.toUpperCase();
        return capSearch.equals("ALABAMA") || capSearch.equals("CONNECTICUT") || capSearch.equals("DELAWARE") ||
                capSearch.equals("ILLINOIS") || capSearch.equals("IOWA") || capSearch.equals("KANSAS") || capSearch.equals("LOUISIANA") ||
                capSearch.equals("MARYLAND") || capSearch.equals("MASSACHUSETTS") || capSearch.equals("MISSISSIPPI") || capSearch.equals("NEBRASKA") ||
                capSearch.equals("NEW HAMPSHIRE") || capSearch.equals("NEW JERSEY") || capSearch.equals("NEW YORK") || capSearch.equals("RHODE ISLAND") ||
                capSearch.equals("OKLAHOMA") || capSearch.equals("PENNSYLVANIA") || capSearch.equals("VERMONT") || capSearch.equals("WISCONSIN");

    }
    public String checkIfStateExists(String search)
    {
        String output;
        boolean aState = isAState(search);
        if(aState)
        {
            output=search + " does not contain any national parks";
        }
        else
        {
            output="No valid state input given";


        }
        return output;
    }


    public String readParkInput(String search)
    {
        //This method should take the search variable, which will be the name of a state park, and open the file correlated to said park
        String outputString;
        try{
            PrintFile file = new PrintFile();
            outputString=file.openFile(search,"parks");

        }
        catch(Exception e)
        {
           outputString= "No valid park input given";

        }
        return outputString;
    }



}
