package all.java.structs;

import java.util.HashSet;
import java.util.Set;

public class HashSetStruct {

    public static void main(String[] args) {

        Set<String> newSet = new HashSet<>();

        System.out.println("SET: ");
        System.out.println(newSet.toString());

        newSet.add("apple");
        newSet.add("cat");
        newSet.add("cat");

        System.out.println(newSet.toString());

        System.out.println("Hava cat? " + newSet.contains("cat"));

        System.out.println("set contains: ");
        for (String name: newSet) {
            System.out.println(name);
        }
    }

}
