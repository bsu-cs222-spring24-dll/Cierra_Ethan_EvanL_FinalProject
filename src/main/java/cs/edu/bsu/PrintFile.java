package cs.edu.bsu;

import java.io.*;
public class PrintFile {
    public String openFile(String search, String type) throws IOException {
        FileReader State = new FileReader("src/main/java/"+type+"/" + search);
        int i;
        while ((i = State.read()) != -1)
            System.out.print((char)i);
        return search;
    }
}
