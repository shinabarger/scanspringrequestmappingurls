import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Traqtion2\\traqtion2\\src\\main\\java\\com\\nsf\\traqtion\\service\\rest\\SupplierRestController.java");
        Scanner scanner = new Scanner(text);

        int lineNumber = 1;
        StringBuilder superLongString = new StringBuilder();

        while (scanner.hasNextLine()) {
            String lineFromFile = scanner.nextLine();
            superLongString.append(lineFromFile + "\n");
            checkIfStringContainsOneThingAndPrintItOut(lineFromFile);
            lineNumber++;
        }
    }

    private static void checkIfStringContainsOneThingAndPrintItOut(String lineFromFile) {
        //Change the word between the quotation marks of this method for whatever you're trying to find
        if (lineFromFile.contains("@RequestMapping")) {
            System.out.println(lineFromFile);
        }
    }

}
