package Day01.TypeReview.封装类型;

public class DefaultMe {
    // 未有修饰符，为default类
    int age = 12;

    public void printAge() {
        // 可以访问自己类中的default属性
        System.out.println(age);
    }
}
