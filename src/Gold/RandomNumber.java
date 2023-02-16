package Gold;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	
	public static int random(int a, int b) {
        int[] inputs = {a, b};
        Random rand = new Random();

        return inputs[rand.nextInt(0, 2)];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Randomly picked number: " + random(a,b));
    }

}
