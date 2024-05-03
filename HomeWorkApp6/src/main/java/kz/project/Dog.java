package kz.project;

public class Dog extends Animal {
    private double runLimitSize = 500;
    private double jumpLimitSize = 0.5;
    private double swimLimitSize = 10;

    @Override
    public boolean run(int obstacleSize) {
        return obstacleSize <= runLimitSize;
    }

    @Override
    public boolean swim(int obstacleSize) {
        return obstacleSize <= swimLimitSize;
    }

    @Override
    public boolean jumpObstacle(int height) {
        return height <= jumpLimitSize;
    }

    public void setRunLimitSize(double runLimitSize) {
        this.runLimitSize = runLimitSize;
    }

    public void setJumpLimitSize(double jumpLimitSize) {
        this.jumpLimitSize = jumpLimitSize;
    }

    public void setSwimLimitSize(double swimLimitSize) {
        this.swimLimitSize = swimLimitSize;
    }

    public double getRunLimitSize() {
        return runLimitSize;
    }

    public double getJumpLimitSize() {
        return jumpLimitSize;
    }

    public double getSwimLimitSize() {
        return swimLimitSize;
    }
}
