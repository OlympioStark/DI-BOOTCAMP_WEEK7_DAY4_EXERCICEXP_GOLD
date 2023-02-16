package Gold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomElementFromArray {
	
	public static String random(ArrayList<String> values) {
        Random rand = new Random();
        return values.get(rand.nextInt(0, values.size()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter several words separated by whitespaces:");
        String userInput = sc.nextLine().trim();
        String[] words = userInput.split(" ");
        ArrayList<String> stringArrayList = new ArrayList<>();
        Arrays.stream(words).forEach(w -> stringArrayList.add(w));
        System.out.println("A random word from your input: " + random(stringArrayList));
        sc.close();
    }

}
