    import java.util.Scanner;


    /*Calculates the monthly payment the user
 has to pay by taking loan, interest, and term as inputs*/

    public class whatdoesitdo {
        public static void main(String[] args) {

            // inputs
            Scanner keyboard = new Scanner(System.in);
            double loan = 0;
            double interest = 0;
            double monthlyPayment = 0;
            double balance = 0;
            int trm;

            System.out.printf("Enter the loan amount: ");
            loan = keyboard.nextDouble();

            System.out.printf("Enter the interest rate on the loan: ");
            interest = keyboard.nextDouble();

            System.out.printf("Enter the term (years) for the loan payment: ");
            trm = keyboard.nextInt();

            System.out.printf("\n======================================\n");
            keyboard.close();

            // Processing
            monthlyPayment = processSomething(loan, interest, trm);
            balance = -(monthlyPayment*(trm*12));

            // Output
            System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
            System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
        }

        // Calculates the monthly payment and returns to main method
        public static double processSomething(double loan, double interest, int trm) {
            // calculates the monthly payment
            double rate = (interest/ 100) / 12;
            double base = (1 + rate);
            double months = trm* 12;
            double result = 0.0;
            result = ((rate * loan) / (1 - Math.pow(base, -months)));

            return result;


        }//end method
    }//end class


