import java.util.ArrayList;

public class javaArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(2);
        marks.add(4);
        System.out.println(marks);// 2,4
        marks.add(0, 89);
        System.out.println(marks);// 89,2,4
        marks.add(0, 77);
        System.out.println(marks);// 77,89,2,4
        marks.set(0, 98);
        System.out.println(marks);// 98,89,2,4
        marks.remove(0);
        System.out.println(marks);// 89,2,4

    }
}
