import java.security.SecureRandom;

public class RollingDice {

    public static void main(String[] args)
    {
        //variables to store how many times a value was rolled
        int one =0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;

        for(int i=1; i<=100; i++) {
            int dieValue = rollDie();
            System.out.printf("%3d. The die rolled %d%n", i, dieValue);

            if (dieValue==1)
                one++;
            else if (dieValue==2)
                two++;
            else if (dieValue==3)
                three++;
            else if (dieValue==4)
                four++;
            else if (dieValue==5)
                five++;
            else
                six++;
        }

        System.out.printf("1: %d times      2: %d times%n", one, two);
        System.out.printf("3: %d times      4: %d times%n", three, four);
        System.out.printf("5: %d times      6: %d times%n", five, six);
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
