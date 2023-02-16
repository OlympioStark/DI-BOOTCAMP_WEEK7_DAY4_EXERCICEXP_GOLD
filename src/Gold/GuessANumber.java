package Gold;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	
	public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(1, 1001);
        int userNumber = -1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What number was generated?");
            userNumber = sc.nextInt();
            if(userNumber > secretNumber)
                System.out.println("Wrong, it’s too big.");
            else if (userNumber < secretNumber)
                System.out.println("Wrong, it’s too small");
            else
                System.out.println("Yeah, you’ve found it!");
        } while(secretNumber != userNumber);

        sc.close();
    }

}
