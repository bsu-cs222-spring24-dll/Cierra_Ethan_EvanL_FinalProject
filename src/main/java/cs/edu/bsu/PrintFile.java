package cs.edu.bsu;

import java.io.*;
public class PrintFile {
    public String openFile(String search, String type) throws IOException {
        FileReader State = new FileReader("src/main/java/cs/edu/bsu/Resources/"+type+"/" + search);
        StringBuilder outputString = new StringBuilder();

        int i;
        while ((i = State.read()) != -1)
            outputString.append((char)i);

        return outputString.toString();
    }

}
