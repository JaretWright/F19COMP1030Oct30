import java.security.SecureRandom;

public class ComparingDice {

    public static void main(String[] args)
    {
        int die1 = rollDie();
        int die2 = rollDie();

        System.out.printf("die1: %d     die2: %d%n",die1, die2);

        if (die1 == die2)
            System.out.printf("die 1 equals die 2");
        else {
            if (die1 > die2)
                System.out.printf("%d is greater than %d", die1, die2);
            else
                System.out.printf("%d is greater than %d", die2, die1);
        }
    }

    /**
     * This method simulates rolling a die and returns a random number between 1-6
     */
    public static int rollDie()
    {
        SecureRandom rng = new SecureRandom();
        return rng.nextInt(6)+1;
    }
}
