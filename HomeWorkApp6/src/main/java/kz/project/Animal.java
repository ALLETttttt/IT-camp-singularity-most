package kz.project;

public abstract class Animal {

    public Animal() {}

    public boolean run(int obstacleSize) {
        return false;
    }

    public boolean swim(int obstacleSize) {
        return false;
    }

    public boolean jumpObstacle(int height) {
        return false;
    }
}
