import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterGameTest {

    // Properties
    private String filename = "src/test/resources/letters.csv";
    private String emptyFilename = "emptyCSV.csv";
    private String singleFilename = "singleCSV.csv";

    @Test
    public void testCSVParsing() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = "";

            while((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                assertTrue(data[0].charAt(0) == data[1].charAt(0));
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}