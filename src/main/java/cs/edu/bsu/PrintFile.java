package cs.edu.bsu;

import java.io.*;
public class PrintFile {
    public String openFile(String search, String type) throws IOException {
        //FileReader shows a warning but works fine. Not sure what warning means but openFile works as intended.
        FileReader State = new FileReader("src/main/Resources/"+type+"/" + search);
        StringBuilder outputString = new StringBuilder();

        int i;
        while ((i = State.read()) != -1)
        {
            outputString.append((char)i);
        }
        return outputString.toString();
    }

}
