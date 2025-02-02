class Javabasic {

    public static void main(String arg[]) {
        // 3 10 12
        Scanner sc = new scanner(System.in);
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
