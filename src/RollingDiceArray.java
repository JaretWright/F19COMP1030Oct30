import java.security.SecureRandom;

public class RollingDiceArray {

    public static void main(String[] args)
    {
        int[] counts = new int[6];

        for (int i=1; i<=100;i++)
        {
            int dieValue = rollDie();
            System.out.printf("%3d. The die rolled %d%n", i, dieValue);

            counts[dieValue-1]++;
        }

        for (int i=0; i<counts.length; i++)
            System.out.printf("%d: %d times%s", i+1, counts[i], (i%2!=0)?"\n":"    ");
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
