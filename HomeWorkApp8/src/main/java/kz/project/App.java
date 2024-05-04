package kz.project;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Arsen", 300, 2);
        Cat cat = new Cat("Sharik", 700, 5);
        Robot robot = new Robot("Aleksandr", 100000, 10000);

        TreadMill treadMill = new TreadMill();
        Wall wall = new Wall();

        IAction[] actions = {person, cat, robot};
        Object[] obstacles = {treadMill, wall};

        for (IAction action : actions) {
            for (Object obs : obstacles) {
                if (obs instanceof TreadMill) {
                    action.run((TreadMill) obs, 600);
                } else {
                    if (action instanceof Person) {
                        if (((Person) action).isState()) {
                            action.jump((Wall) obs, 4);
                        }
                    } else if (action instanceof Cat) {
                        if (((Cat) action).isState()) {
                            action.jump((Wall) obs, 4);
                        }
                    }
                    else {
                        if (((Robot) action).isState()) {
                            action.jump((Wall) obs, 4);
                        }
                    }
                }
            }
        }

    }
}
