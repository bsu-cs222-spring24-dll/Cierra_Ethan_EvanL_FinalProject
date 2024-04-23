package cs.edu.bsu.SearchJava;

import cs.edu.bsu.CheckSearchField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class InputTests
{
    @Test
    public void testHasInput() throws IOException
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
    public void testIsAState() throws IOException
    {
        CheckSearchField test = new CheckSearchField();
        boolean check = test.isAState("Nebraska");
        Assertions.assertEquals(true,check);
    }

    @Test
    public void testCheckIfStateExists() throws IOException
    {
        CheckSearchField test = new CheckSearchField();
        boolean check = test.checkIfStateExists("Puerto Rico");
        Assertions.assertEquals(false,check);
    }


}
