package kz.project;

public interface IAction {
    void run(TreadMill treadMill, int distance);

    void jump(Wall wall, int height);
}
