class Javabasic {

    public static void main(String arg[]) {
        int a = 10;
        int c = 20;
        int b = 30;

        int sumofnumbers = sum(a, b);
        System.out.println(sumofnumbers);
        int sumofnumbers1 = sum(a, b, c);
        System.out.println(sumofnumbers1);
    }

    public static int sum(int x , int y){
        return x + y;
        public static int sum(int x , int y, int z){
            return x + y + z;
        }

    }
}
