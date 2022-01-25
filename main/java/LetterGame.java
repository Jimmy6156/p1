import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LetterGame {

    // Properties
    private static ArrayList<Character> englishList = new ArrayList<>();
    private static ArrayList<Character> spanishList = new ArrayList<>();

    private static void initLists(String filename) throws IOException {
        // Variables
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = "";

        int count = 0;
        while((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            count++;
        }
    }

    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Random random = new Random();
        int randIndex;

        // Initialize the lists
        try {
            initLists("letters.csv");
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Main gameplay loop
        while(!input.equalsIgnoreCase("exit")) {
            randIndex = random.nextInt(25);

            System.out.printf("What Spanish letter corresponds to the English letter %c at position %d\n", englishList.get(randIndex), randIndex);
            input = scanner.next();

            if(input.charAt(0) == spanishList.get(randIndex)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        }
    }
}
