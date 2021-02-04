package Day03.类.接口;

// 一个类可以实现多个接口
public class Student implements AnotherInterface, Action{

    @Override
    public void run() {
        System.out.println("Averagely, a student can run 5m/s");
    }

    @Override
    public void test() {
        System.out.println("Test test");
    }

    @Override
    public void go() {
        System.out.println("Test go");
    }
}
