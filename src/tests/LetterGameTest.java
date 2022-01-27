package p1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Assert.*;
import org.junit.Test;
public class LetterGameTest {
	Scanner scanner = new Scanner(System.in);
	String input = null;
    Random random = new Random();
    int randIndex = random.nextInt(26);
    int max = 26;
    private static ArrayList<Character> englishList = new ArrayList<>();
    private static ArrayList<Character> spanishList = new ArrayList<>();
 
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
    
    @Test
    public void testCSVParsing() { // Tests one random letter
    	try {
            initLists("C:/Users/jimmy/p1-1/src/main/resources/letters.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }
   
       assertTrue(englishList.get(randIndex) == spanishList.get(randIndex));
       assertFalse(englishList.get(randIndex) != spanishList.get(randIndex));
    	   
    }
    
    @Test
    public void fullTest() { // Tests all the alphabets
    	try {
            initLists("C:/Users/jimmy/p1-1/src/main/resources/letters.csv");
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
	
    @Test
    public void zeroTest() { // Tests if empty
    	try {
            initLists("C:/Users/jimmy/p1-1/src/main/resources/letters.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }
    	assertFalse(englishList.isEmpty());
    	assertFalse(spanishList.isEmpty());
    }
    
}
