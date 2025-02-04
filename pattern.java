public class pattern {
    public static void main(String args[]) {
        // 1
        // 23
        // 456
        // 78910
        // 1112131415
        int counter = 1;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.print("\n");

        }
    }

}
