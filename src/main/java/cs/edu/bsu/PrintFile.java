package cs.edu.bsu;

import java.io.*;
public class PrintFile {
    public String openFile(String search) throws IOException {
        FileReader State = new FileReader("srs/main/java/States/" + search + ".txt");
        int i;
        while ((i = State.read()) != -1)
            System.out.print((char)i);
        return search;
    }
}
