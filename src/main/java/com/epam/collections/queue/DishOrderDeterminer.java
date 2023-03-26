package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishQueue = new PriorityQueue<>();
        ArrayList<Integer> eatenDishes = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishQueue.add(i);
        }
        int originalSize = dishQueue.size();
        int currentSize = originalSize;
        int count = 1;
        for (int i = 0; i < originalSize; i++) {
            Queue<Integer> newDishQueue = new PriorityQueue<>();
            for (int j = 1; j <= currentSize; j++) {
                if (count % everyDishNumberToEat == 0) {
                    eatenDishes.add(dishQueue.remove());
                    count = 1;
                } else {
                    newDishQueue.add(dishQueue.remove());
                    count++;
                }
            }
            currentSize = newDishQueue.size();
            dishQueue.clear();
            dishQueue.addAll(newDishQueue);
        }
        return eatenDishes;
    }
}
