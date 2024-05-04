package kz.project;

public class Person implements IAction {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean state;

    public Person(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.state = true;
    }

    @Override
    public void run(TreadMill treadMill, int distance) {
        System.out.print(name);
        if (distance <= maxRunDistance) {
            treadMill.run();
        } else {
            state = false;
            System.out.println(" can not run the tread mill");
        }
    }

    @Override
    public void jump(Wall wall, int height) {
        System.out.print(name);
        if (height <= maxJumpHeight) {
            wall.jump();
        } else {
            state = false;
            System.out.println(" can not jump the wall");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
