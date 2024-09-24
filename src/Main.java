public class Main
{
    public static void main(String[] args)
    {
        double ccBalance = 5000;
        final double INTEREST_RATE = 0.17;
        double interest = 0;

        interest = ccBalance * INTEREST_RATE;
        ccBalance = ccBalance + interest;

        System.out.println("Your interest after the first month will be $" + interest + " for a total of $" + ccBalance);
        System.out.println("Then your interest after the second month will be $" + interest + " for a total of $" + ccBalance);

    }
}