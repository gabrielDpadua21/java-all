package all.java.structs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStructs {

    public static void main(String[] args) {

        List<Integer> newArrayList = new ArrayList<>();

        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.add(4);

        System.out.println(newArrayList.toString());

        System.out.println("GET: ");

        System.out.println(newArrayList.get(1));

        System.out.println("REMOVE: ");

        System.out.println(newArrayList.toString());

        newArrayList.remove(2);

        System.out.println(newArrayList.toString());

        System.out.println("CONTAINS: ");

        System.out.println("Arraylist contains 1: " + newArrayList.contains(1));
        System.out.println("Arraylist contains 10: " + newArrayList.contains(10));

    }

}
