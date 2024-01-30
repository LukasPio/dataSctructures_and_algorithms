package data_structures;

import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<String> grades = new PriorityQueue<>(Collections.reverseOrder());

        grades.offer("C");
        grades.offer("A");
        grades.offer("B");

        while (!grades.isEmpty()) {
            System.out.println(grades.poll());
        }

    }
}
