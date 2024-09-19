public class Main {
    public static void main(String[] args) {

        double balance = 5000;
        double interestRate = 0.17;
        double interest = 0;


        interest = balance * 0.17;
        balance = balance + interest;

        System.out.println("Your balance for the 1st month is $" + balance + " with an interest of $" + interest);

        interest = balance * 0.17;
        balance = balance + interest;

        System.out.println("You balance for the 2nd month is $" + balance + " with an interest of $" + interest);


    }
}