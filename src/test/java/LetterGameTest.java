import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterGameTest {

    // Properties
    private String filename = "src/test/resources/letters.csv";
    private String emptyFilename = "emptyCSV.csv";
    private String singleFilename = "singleCSV.csv";

    private Scanner scanner = new Scanner(System.in);
    private String input = null;
    private Random random = new Random();
    private int max = 26;
    private int randIndex = random.nextInt(max);

    private static ArrayList<Character> englishList = new ArrayList<>();
    private static ArrayList<Character> spanishList = new ArrayList<>();


    // Methods
    private static void initLists(String filename) throws IOException {
        // Variables
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = "";
        
        while((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            
            englishList.add(data[0].charAt(0));
            spanishList.add(data[1].charAt(0));
        }
        reader.close();
    }

    // Tests
    @Test
    public void testCSVParsing() { // Tests one random letter
    	try {
            initLists("src/test/resources/letters.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }
   
       assertTrue(englishList.get(randIndex) == spanishList.get(randIndex));
       assertFalse(englishList.get(randIndex) != spanishList.get(randIndex));
    	   
    }
    
    @Test
    public void zeroTest() {
    	try {
            initLists("src/test/resources/letters.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }
    	assertFalse(englishList.isEmpty());
    	assertFalse(spanishList.isEmpty());
    }
    
    @Test
    public void fullTest() { // Tests all the alphabets
    	try {
            initLists("src/test/resources/letters.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }
    	int intTest = 0;
    	while (intTest < max) {
    		assertTrue(englishList.get(intTest) == spanishList.get(intTest));
    		assertFalse(englishList.get(intTest) != spanishList.get(intTest));
    		intTest++;
    	}
    }
}
