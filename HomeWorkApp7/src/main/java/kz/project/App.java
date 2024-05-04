package kz.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Plate plate = new Plate(120);
        plate.fillMax();

        Cat cat = new Cat("Barsik");
        System.out.println(cat.isHungry());
        cat.eat(plate);
        System.out.println(cat.isHungry());

        Plate[] plates = new Plate[4];
        plates[0] = new Plate(90);
        plates[1] = new Plate(70);
        plates[2] = new Plate(150);
        plates[3] = new Plate(100);

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Arman");
        cats[1] = new Cat("Yerkebulan");
        cats[2] = new Cat("Asel");
        cats[3] = new Cat("Ainur");

        System.out.println("-----------------");

        for (int i = 0; i < cats.length; i++) {
            plates[i].fillMax();
            cats[i].eat(plates[i]);
        }

        for (Cat catt: cats) {
            System.out.println(catt.getName() + " is hungry: " + catt.isHungry());
        }

        plates[0].setFood(120);
        cats[0].eat(plates[0]);
        System.out.println(cats[0].isHungry());
    }
}
