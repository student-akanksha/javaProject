import java.util.Scanner;

public class javaArray {
    public static void main(String args[]) {
        int marks[] = new int[10];
        System.out.println(marks.length);
        // Scanner sc = new Scanner(System.in);
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(i + "--" + marks[i]);
        }

    }

}
