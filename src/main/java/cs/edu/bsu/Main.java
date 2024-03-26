package cs.edu.bsu;


import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        UserInput user = new UserInput();
        String end="";
        end= user.loop();
        System.out.println(end);


    }
}


