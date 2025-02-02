import java.util.Scanner;

public class ternary {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax = (income < 300000) ? (int) (income * 0.10) : (int) (income * 0.20);
        System.out.println("your tax is:" + tax);

    }

}
