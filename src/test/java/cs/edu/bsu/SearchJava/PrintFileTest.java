package cs.edu.bsu.SearchJava;

import cs.edu.bsu.PrintFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PrintFileTest
{

    @Test
    public void testPrintFile() throws IOException
    {
        PrintFile test = new PrintFile();
        String i = test.openFile("Indiana","States");
        Assertions.assertEquals("1. Indiana Dunes National Park\n",i);
    }
}
