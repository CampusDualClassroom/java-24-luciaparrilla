package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> q = new LinkedList<>();

        q.add("Smith");
        q.add("Montessori");
        q.add("Peralta");
        q.add("House");

        return q;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        System.out.println(createQueue());

        String remove = queue.remove();
        System.out.println("Queue succesfully removed.");
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        printAndEmptyQueue(queue);
    }
}
