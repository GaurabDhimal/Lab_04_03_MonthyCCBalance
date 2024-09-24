public class Main
{
    public static void main(String[] args)
    {
        double ccBalance = 5000; // Starting
        final double INTEREST_RATE = 0.17;
        double interest = 0;
        double interest1 = 0; // After the first month
        double ccBalance1 = 0; // After the first month
        double ccBalance2 = 0; // After the second month

        interest = ccBalance * INTEREST_RATE;
        ccBalance1 = ccBalance + interest;
        interest1 = ccBalance1 * INTEREST_RATE;
        ccBalance2 = ccBalance1 + interest1;


        System.out.println("Your interest after the first month will be $" + interest + " for a total of $" + ccBalance1);
        System.out.println("Then your interest after the second month will be $" + interest1 + " for a total of $" + ccBalance2);

    }
}