import java.util.Scanner;

public class userInput {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = sc.nextInt();
        if (x >= y && x >= z) {
            System.out.println("x is largest");
        } else if (y >= z) {

            System.out.println("y is greater");
        } else {
            System.out.println("z is greatest");
        }

    }
}
