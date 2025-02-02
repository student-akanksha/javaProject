import java.util.Scanner;

public class incomeTax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;
        if (income <= 500000 && income < 1000000) {
            tax = (int) (income * 0.15);
        } else if (income >= 1000000 && income < 2000000) {
            tax = (int) (income * 0.20);
        } else {
            tax = (int) (income * 0.30);
        }
        System.out.println("your tax is:" + tax);
    }
}