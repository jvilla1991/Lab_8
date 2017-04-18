import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double average = 0.000;
        double slug = 0.000;
        double total = 0.000;
        double batHit = 0.000;
        boolean bool1 = false;
        boolean bool2 = true;
        int inputSize = 0;

        do
        {
            System.out.println("Please enter how many at bats for player");
            inputSize = scnr.nextInt();

            double[] atBatArray = new double[inputSize];



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


                total = atBatArray[i] + total;

                if (atBatArray[i] > 0)
                {
                    batHit++;
                }
            }

            System.out.println("Batting Average: " + batAverage(batHit, inputSize));
            System.out.println("Slugging Average of player: " + slugAverage(total, inputSize));


            scnr.nextLine();


            System.out.println("Would you like to know more about another player? (y/n)?");
            String s = scnr.nextLine();
            if ("y".equalsIgnoreCase(s))
            {
                bool2 = true;
            }
            else if ("n".equalsIgnoreCase(s))
            {
                bool2 = false;
            }
        } while (bool2 == true);
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
