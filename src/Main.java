import java.util.Scanner;


public class Main {

    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);

        int mpgRating;
        double tankCap;
        double percTank;
        double rawRange;



        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpgRating = scnr.nextInt();

        if (mpgRating <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");

            return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        tankCap = scnr.nextDouble();

        if (tankCap <= 0) {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");

            return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        percTank = scnr.nextDouble();

        if (percTank < 0 || percTank> 100) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");

            return;
        }

        rawRange = mpgRating * tankCap * (percTank * .01);

        if (rawRange <= 25)  {
            System.out.print("Attention! Your current estimated range is running low: " + (int)rawRange + " miles left!!!");
        }
        else
            System.out.print("Keep driving! Your current estimated range is: " + (int)rawRange + " miles!");
        }


    }


