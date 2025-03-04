package all.java.structs;

import java.util.LinkedList;

public class LinkedListStructs {

    public static void main(String[] args) {

        LinkedList<Integer> newLinkedList = new LinkedList<>();

        newLinkedList.add(1);
        newLinkedList.add(2);
        newLinkedList.add(3);
        newLinkedList.add(4);

        System.out.println(newLinkedList.toString());

        System.out.println("GET: ");
        System.out.println(newLinkedList.get(1));

        System.out.println("REMOVE: ");
        System.out.println(newLinkedList.toString());
        newLinkedList.remove(2);
        System.out.println(newLinkedList.toString());

        System.out.println("CONTAINS: ");
        System.out.println("LinkedList contains 2: " + newLinkedList.contains(2));
        System.out.println("LinkedList contains 10: " + newLinkedList.contains(10));

    }

}
