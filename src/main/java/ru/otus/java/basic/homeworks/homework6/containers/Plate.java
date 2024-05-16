package ru.otus.java.basic.homeworks.homework6.containers;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public int getMaxFoodAmount() {
        return maxFoodAmount;
    }

    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public int addFood(int amount) {
        if (amount <= 0 ) {
            return 0;
        }

        if (currentFoodAmount + amount > maxFoodAmount) {
            int addedFood = amount - (currentFoodAmount - maxFoodAmount);
            currentFoodAmount = maxFoodAmount;
            return addedFood;
        }
        currentFoodAmount += amount;
        return amount;
    }

    public boolean takeFood(int amount) {
        if (amount <= 0) {
            return false;
        }

        if (currentFoodAmount - amount >= 0) {
            currentFoodAmount -= amount;
            return true;
        }
        return false;
    }
}
