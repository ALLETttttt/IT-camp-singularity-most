package kz.project;


public class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void fillMax() {
        food = capacity;
    }

    public void info() {
        System.out.printf("Plate: %d / %d\n", food, capacity);
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}
