class methodOverloading {

    public static void main(String arg[]) {
        int a = 10;
        int c = 20;
        int b = 30;
        System.out.println("asdgashjdgahjsgdj");
        int sumofnumbers = sum(a, b);
        System.out.println(sumofnumbers);
        int sumofnumbers1 = sum(a, b, c);
        System.out.println(sumofnumbers1);

        float productofnumbers = multiply(0.2f, 0.3f);
        System.out.println(productofnumbers);
        float productofnumbers1 = multiply(a, b);
        System.out.println(productofnumbers1);

    }

    public static int sum(int x, int y) {

        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;

    }

    public static float multiply(float n, float m) {

        return n * m;
    }

    public static int multiply(int o, int p) {
        return o * p;

    }

}