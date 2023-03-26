package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER.reversed());
        PriorityQueue<String> queue = new PriorityQueue<>(list);
        return queue;
    }
}
