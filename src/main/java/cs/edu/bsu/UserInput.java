package cs.edu.bsu;

import javax.sound.midi.Soundbank;
import java.util.Locale;
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

    public String getParkInput()
    {
        System.out.println("What park would you like to know more about?");
        search = console.nextLine();
        return search;
    }

    public String getContinueInput()
    {
        System.out.println("Would you like to know more about one of these parks?");
        search = console.nextLine();
        return search;
    }

    public String getModeInput()
    {
        System.out.println("Would you like to search for parks in a state or learn more about a specific park?");
        System.out.println("(Enter either: (State/Park)");
        search = console.nextLine();
        return search;
    }

}
