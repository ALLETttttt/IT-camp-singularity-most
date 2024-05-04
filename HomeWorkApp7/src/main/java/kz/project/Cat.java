package kz.project;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.appetite = 105;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            hungry = false;
            System.out.println("Cat eat the food");
        }
        else {
            System.out.println("Not enough food");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }
}
