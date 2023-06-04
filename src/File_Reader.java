
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String args[]) {
        try {
            FileReader reader = new FileReader("C:/Users/jumpr/IdeaProjects/NumberPrinter/test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String newline;
            while ((newline = bufferedReader.readLine()) != null) {
                System.out.println(newline);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
