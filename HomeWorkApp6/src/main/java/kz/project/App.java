package kz.project;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println(dog1.run(150)); // true
        System.out.println(dog1.run(1500)); // false

        System.out.println(dog1.swim(10)); // true

        Cat cat = new Cat();
        System.out.println(cat.swim(2)); // false, cat can not swim by default it is false

        Dog dog2 = new Dog();
        dog2.setRunLimitSize(15000.0);
        System.out.println(dog2.getRunLimitSize());
        System.out.println(dog2.run(1400)); // true
    }
}
