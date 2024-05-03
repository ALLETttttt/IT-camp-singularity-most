package kz.project;

public class Cat extends Animal {
    private double runLimitSize = 200;
    private double jumpLimitSize = 2;

    @Override
    public boolean run(int obstacleSize) {
        return obstacleSize <= runLimitSize;
    }

    @Override
    public boolean swim(int obstacleSize) {
        return super.swim(obstacleSize);
    }

    @Override
    public boolean jumpObstacle(int height) {
        return height <= jumpLimitSize;
    }

    public double getRunLimitSize() {
        return runLimitSize;
    }

    public void setRunLimitSize(double runLimitSize) {
        this.runLimitSize = runLimitSize;
    }

    public double getJumpLimitSize() {
        return jumpLimitSize;
    }

    public void setJumpLimitSize(double jumpLimitSize) {
        this.jumpLimitSize = jumpLimitSize;
    }
}
