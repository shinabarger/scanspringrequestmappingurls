import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Traqtion2\\traqtion2\\src\\main\\java\\com\\nsf\\traqtion\\service\\rest\\ProductSpecificationController.java");
        Scanner scanner = new Scanner(text);

        int lineNumber = 0;
        StringBuilder superLongString = new StringBuilder();

        while (scanner.hasNextLine()) {
            String lineFromFile = scanner.nextLine();
            superLongString.append(lineFromFile + "\n");
            //checkIfStringContainsOneThingAndPrintItOut(lineFromFile);
            //addRequestMethodTypeCommentBelow(lineFromFile);
            ifContainsPostPrintNextThreeLines(scanner, lineFromFile);
            lineNumber++;
        }
    }

    private static void checkIfStringContainsOneThingAndPrintItOut(String lineFromFile) {
        //Change the word between the quotation marks of this method for whatever you're trying to find
        if (lineFromFile.contains("@RequestMapping")) {
            System.out.println(lineFromFile);
        }
    }

    private static void addRequestMethodTypeCommentBelow(String lineFromFile) {
        if (lineFromFile.contains("POST")) {
            System.out.println("                              ↑ POST ↑ ");
        } else if (lineFromFile.contains("GET") & !lineFromFile.contains("POST") & !lineFromFile.contains("DELETE") & !lineFromFile.contains("PUT")) {
            System.out.println("                              ↑ GET ↑ ");
        } else if (lineFromFile.contains("DELETE")) {
            System.out.println("                              ↑ DELETE ↑ ");
        } else if (lineFromFile.contains("PUT")) {
            System.out.println("                              ↑ PUT ↑ ");
        }
    }

    private static void ifContainsPostPrintNextThreeLines(Scanner scanner, String lineFromFile) {
        if (lineFromFile.contains("POST")) {
            System.out.println(lineFromFile);
            lineFromFile = scanner.nextLine();
            System.out.println(lineFromFile);
            lineFromFile = scanner.nextLine();
            System.out.println(lineFromFile + "\n");
        }
    }
}
