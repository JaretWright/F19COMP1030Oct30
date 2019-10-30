import java.security.SecureRandom;

public class RollingDice {

    public static void main(String[] args)
    {
        System.out.printf("The die rolled %d%n", rollDie());
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
