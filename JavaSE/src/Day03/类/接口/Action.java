package Day03.类.接口;

public interface Action {
    public abstract void run();

    // 默认以public static final修饰
    String name = "Jack";
    int age = 21;

    // 默认以public abstract修饰
    void test();

    public void go();

}
