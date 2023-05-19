package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserFacade {
    public static void parse(String address) throws FileNotFoundException {
        Parser parser = new Parser();
        parser.startParse(new Scanner(new File(address)));
    }
}
