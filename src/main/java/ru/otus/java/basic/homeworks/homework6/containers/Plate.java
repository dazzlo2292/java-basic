package ru.otus.java.basic.homeworks.homework6.containers;

public class Plate {
    int maxFoodAmount;
    int currentFoodAmount;

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

    public void addFood(int amount) {
        if (amount <= 0 ) return;

        if (currentFoodAmount + amount > maxFoodAmount) {
            currentFoodAmount = maxFoodAmount;
        } else {
            currentFoodAmount += amount;
        }
    }

    public boolean takeFood(int amount) {
        if (amount < 0 && currentFoodAmount - amount >= 0) {
            currentFoodAmount -= (amount * (-1));
            return true;
        }
        if (amount >= 0 && currentFoodAmount - amount >= 0) {
            currentFoodAmount -= amount;
            return true;
        }
        return false;
    }
}
