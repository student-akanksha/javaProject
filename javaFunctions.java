public class javaFunctions {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;

        // overloading by parameters//same function name but diffrent parameters
        int sumofnumbers = sum(a, b);
        System.out.println(sumofnumbers);
        int sumofnumbers1 = sum(a, b, c);
        System.out.println(sumofnumbers1);

        // overloading by data types
        float productofnumbers = multiply(0.2f, 9.6f);
        System.out.println(productofnumbers);
        int productofnumbers1 = multiply(a, b);
        System.out.println(productofnumbers1);

    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;

    }

    // overloading by different parameters

    // overloading by differnt data types

    public static float multiply(float n, float m) {

        return n * m;
    }

    public static int multiply(int o, int p) {
        return o * p;

    }

}
