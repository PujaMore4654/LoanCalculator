
import java.util.Scanner;
class LoanCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for (; ; )
        {
            System.out.println("__________LoanCalculator_________");
            System.out.println();
            System.out.println("1.Home Loan");
            System.out.println("2.Gold Loan");
            System.out.println("3.Vehical Loan");
            System.out.println("4.Education Loan");
            System.out.println("5.Personal Loan");
            System.out.println();
            System.out.print("Enter your Option:");
            int opt = sc.nextInt();
            double roi = 0;
            String LoanType = null;
            String Assume = "Valid";
            switch (opt)
            {
                case 1:
                {
                    LoanType = "Home Loan";
                    roi = 8.45;
                    break;
                }
                case 2:
                {
                    LoanType = "Gold Loan";
                    roi = 3;
                    break;
                }
                case 3:
                {
                    LoanType = "Vehical Loan";
                    roi = 12;
                    break;
                }
                case 4:
                {
                    LoanType = "Education Loan";
                    roi = 9.5;
                    break;
                }
                case 5:
                {
                    LoanType = "Personal Loan";
                    roi = 16;
                    break;
                }
                default:
                {
                    System.out.println("Invalid option Entered");
                    break;
                }
            }
            if (Assume == "Not Valid")
                continue;
//...........Calculation......
            System.out.println("Enter the Amount");
            double amount = sc.nextDouble();
            if (amount < 10000 || amount > 5000000)
            {
                System.out.println("Invalid amount Entered ");
                continue;
            }
            System.out.println("Enter Tenure in the year");
            double Tenure = sc.nextDouble();
            if (Tenure < 1 || Tenure > 20)
            {
                System.out.println("Invalid tenure ");
                continue;
            }
            System.out.println();
            System.out.println("Loan Type:" + LoanType);
            System.out.println("Principal Amount:" + amount + "r]rs");
            System.out.println("tenure:" + Tenure + "Year");
            System.out.println("Rate of Interest:" + roi + "%");
            double Interest = amount * roi / 100;
            System.out.println("Interest:" + (Interest * Tenure) + "rs");
            System.out.println("Loan Amount:" + (amount * (Interest * Tenure)));
            System.out.println("Total EMI:" + (amount * Interest) / (Tenure * 12));
        }
    }
}