package cs.edu.bsu.SearchJava;

import cs.edu.bsu.CheckSearchField;
import cs.edu.bsu.TravelGuide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class InputTests
{
    @Test
    public void testHasInput()
    {
        CheckSearchField test = new CheckSearchField();
        String check = test.hasInput("test");
        Assertions.assertEquals("test",check);
    }

    @Test
    public void testStateHasPark() throws IOException
    {
        CheckSearchField test = new CheckSearchField();
        String check = test.stateHasPark("Indiana");
        Assertions.assertEquals("1. Indiana Dunes National Park",check);
    }

    @Test
    public void testIsAState()
    {
        CheckSearchField test = new CheckSearchField();
        boolean check = test.isAState("Nebraska");
        Assertions.assertTrue(check);
    }

    @Test
    public void testCheckIfStateExists()
    {
        CheckSearchField test = new CheckSearchField();
        String check = test.checkIfStateExists("Puerto Rico");
        Assertions.assertEquals("No valid state input given",check);
    }

    @Test
    public void testCheckParkSearch()
    {
        TravelGuide test = new TravelGuide();
        String check = test.checkParkSearch("No valid park input given");
        Assertions.assertEquals("No valid park input given", check);
    }

    @Test
    public void TestReadParkInput()
    {
        CheckSearchField test = new CheckSearchField();
        String check = test.readParkInput("sldfhsdkg");
        Assertions.assertEquals("No valid park input given" ,check);
    }


}
