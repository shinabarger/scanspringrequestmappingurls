import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");

        File text = new File("C:\\Traqtion2\\traqtion2\\src\\main\\java\\com\\nsf\\traqtion\\service\\rest\\SupplierRestController.java");
        Scanner scanner = new Scanner(text);

        int lineNumber = 1;
        StringBuilder superLongString = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            superLongString.append(line + "\n");
            System.out.println(superLongString);
            lineNumber++;
        }

        //TODO figure this out...
        for (int i = 0; i < superLongString.length(); i++) {

        }


    }
}
