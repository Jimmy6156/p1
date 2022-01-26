package tests;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Assert.*;

public class LetterGameTest {

    @Test
    public void testCSVParsing(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = "";

            while((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                assertTrue(data[0].charAt(0) == data[1].charAt(1));
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}