package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            deque.add(i);
        }

        int index = 0;
        while (!deque.isEmpty()) {
            for (int i : deque) {
                index++;
                if (index % everyDishNumberToEat == 0) {
                    list.add(deque.poll());
                    index = 0;
                }
            }
        }
        return list;
    }
}
