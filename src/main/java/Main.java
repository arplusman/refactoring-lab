import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import parser.Parser;
import parser.ParserFacade;

public class Main {
    public static void main(String[] args) {
        try {
            // start parsing
            String address = "src/main/resources/code";
            ParserFacade.parse(address);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
