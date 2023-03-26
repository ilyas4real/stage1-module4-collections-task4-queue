package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            deque.add(firstQueue.poll());
            deque.add(secondQueue.poll());
        }
        while (!firstQueue.isEmpty()) {
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());
        }
        while (!secondQueue.isEmpty()) {
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }
        return deque;
    }
}
