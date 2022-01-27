package p1;

import static org.junit.Assert.assertEquals;
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
    String input = "";
    Random random = new Random();
    int randIndex = random.nextInt(26);

    ArrayList<Character> englishList = new ArrayList<>();
    ArrayList<Character> spanishList = new ArrayList<>();
    input = scanner.next();
    @Test
    public void testCSVParsing() {
       //ArrayList<Character> englishList = new ArrayList<>();
       //ArrayList<Character> spanishList = new ArrayList<>();
      // input = scanner.next();
       assertEquals(englishList.get(randIndex), input.charAt(0));
       assertEquals(spanishList.get(randIndex), input.charAt(0));
    }

}

@Test
public void testFail() {


}
