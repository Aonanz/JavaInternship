package Day01.TypeReview.测试用包;

import Day01.TypeReview.封装类型.ProtectedMe;

// 不同包下，但为其子类者，可查修以protected修饰者
public class TestProtected extends ProtectedMe {
    public static void main(String[] args) {
        TestProtected testProtected = new TestProtected();
        System.out.println(testProtected.age);
        testProtected.age = 18;
        System.out.println(testProtected.age);
    }
}
