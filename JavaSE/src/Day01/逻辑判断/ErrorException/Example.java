package Day01.逻辑判断.ErrorException;

public class Example {
    public static void main(String[] args) {
        System.out.println(Test());
    }

    public static int Test() {
        int x = 5;
        try {
            int num = x / 0;
            System.out.println("try，正在尝试中");
            return 1;
        } catch (ArithmeticException e) {
//            throw e;
            System.err.println("除数不能为0");
            return -1;
        } finally {
            ++x;
            System.out.println("到达finally");
            return 2;
        }
    }
}
