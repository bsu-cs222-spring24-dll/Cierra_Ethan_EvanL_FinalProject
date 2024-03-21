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
        if(search.equals("Indiana") || search.equals("California") || search.equals("Alaska") || search.equals("Arizona") || search.equals("Arkansas")
                || search.equals("Ohio") || search.equals("Colorado") || search.equals("Florida") ||
                search.equals("Hawaii") || search.equals("Idaho") || search.equals("Kentucky") || search.equals("Maine") ||
                search.equals("Michigan") || search.equals("Minnesota") || search.equals("Missouri") || search.equals("Montana")
                || search.equals("Nevada") || search.equals("New Mexico") || search.equals("North Dakota") ||
                search.equals("North Carolina") || search.equals("Oregon") || search.equals("South Carolina") ||
                search.equals("South Dakota") || search.equals("Tennessee") || search.equals("Texas") || search.equals("Utah") ||
                search.equals("Virginia") || search.equals("Washington") || search.equals("Wyoming") || search.equals("West Virginia"))
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

    public boolean isAState(String search)
    {
        if(search.equals("Alabama")||search.equals("Connecticut")||search.equals("Delaware")||
                search.equals("Illinois")||search.equals("Iowa")||search.equals("Kansas")||search.equals("Louisiana")||
                search.equals("Maryland")||search.equals("Massachusetts")||search.equals("Mississippi")||search.equals("Nebraska")||
                search.equals("New Hampshire")||search.equals("New Jersey")||search.equals("New York")||search.equals("Rhode Island")||
                search.equals("Oklahoma")||search.equals("Pennsylvania")||search.equals("Vermont")||search.equals("Wisconsin"))
        {
            return true;
        }
        else
        {

            return false;
        }

       }
    public String checkIfStateExists(String search)
    {
        boolean aState = isAState(search);
        if(aState)
        {
            System.out.println(search + " does not contain any national parks");
            return search;
        }
        else
        {
            System.out.println("Error: State does not exist");
            return search;
        }
    }
}
