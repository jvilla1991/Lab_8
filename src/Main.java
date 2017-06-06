import java.util.Scanner;

// Calculate the batting statistics of a person at bat

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double average = 0.000;
        double slug = 0.000;
        double totalBatResult = 0.000;
        double batHit = 0.000;
        boolean bool1 = false;
        boolean bool2 = true;
        int inputSize = 0;

        do
        {
            System.out.println("Please enter how many at bats for player");
            inputSize = scnr.nextInt();

            // The user needs to define the number of elements for the array which they will be storing information in
            double[] atBatArray = new double[inputSize];


            // Loops through and populates each element with user input, must be 1-4
            for (int i = 0; i < atBatArray.length; i++) {
                do{
                    System.out.println("Enter at bat result for player at current bat(0-4): " + (i + 1));
                    atBatArray[i] = scnr.nextInt();
                    if (!((atBatArray[i] >= 0) && (atBatArray[i] <= 4)))
                    {
                        System.out.println("Invalid input! Try again...");
                        bool1 = true;
                    }
                    else if ((((atBatArray[i] >= 0) && (atBatArray[i] <= 4))))
                    {
                        bool1 = false;
                    }
                } while(bool1 == true);


                totalBatResult = atBatArray[i] + totalBatResult;

                if (atBatArray[i] > 0)
                {
                    batHit++;
                }
            }

            // Both System Outs call methods that calculate the Batting Average and the Slugging Average respectively.
            System.out.println("Batting Average: " + batAverage(batHit, inputSize));
            System.out.println("Slugging Average of player: " + slugAverage(totalBatResult, inputSize));

            totalBatResult = 0;
            batHit = 0;


            scnr.nextLine();

            System.out.println("Would you like to know more about another player? (y/n)?");
            String s = scnr.nextLine();

            // Once again, experimenting with rerun prompts from the last lab. This one is store in a method.
            bool2 = promptRerun(s);
        } while (bool2 == true);
    }
    
    private static boolean promptRerun(String s)
    {
        boolean bool2 = true;
        if ("y".equalsIgnoreCase(s))
        {
             bool2 = true;
        }
        else if ("n".equalsIgnoreCase(s))
        {
             bool2 = false;
        }
        return bool2;
    }

    private static double slugAverage(double total, int inputSize)
    {
        double y;
        y = total / inputSize;
        return y;
    }

    private static double batAverage(double batHit, int inputSize)
    {
        double x;
        x = batHit / inputSize;
        return x;
    }
}
