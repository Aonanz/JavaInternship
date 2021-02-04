package Day03.类.接口;

// 当然可以随意继承实施了接口的抽象类
public class StudentA extends Student{

    public static void main(String[] args) {
        Student mrA = new StudentA();
        mrA.go();
        mrA.run();
        mrA.test();
    }

    // 可以用super关键字直接调用父类Student里的实施方法
    @Override
    public void run() {
        super.run();
    }

    // 也可以无视父类Student，自己DIY方法
    @Override
    public void test() {
        System.out.println("This student has no confidence on his study. Sad.");
    }

    // 当然也不一定非得用这些方法
    @Override
    public void go() {

    }
}
