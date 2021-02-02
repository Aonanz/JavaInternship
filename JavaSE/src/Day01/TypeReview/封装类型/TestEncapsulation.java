package Day01.TypeReview.封装类型;

public class TestEncapsulation {
    public static void main(String[] args) {
        // 用getter和setter来访问修改private修饰的属性
        Me me = new Me();
        System.out.println(me.getName());
        System.out.println("changed age using " +
                "setter: "+me.setAge(18));
        // 可以直接访问并修改同一包下其他类中的default属性
        DefaultMe defaultMe = new DefaultMe();
        System.out.println(defaultMe.age);
        defaultMe.age = 18;
        System.out.println("changed to->\n"+ defaultMe.age);

    }
}

// private
class Me {
    private String name = "Aonan";
    private int age = 21;
    private void run() {
        System.out.println("I am running");
    }

    // 访问自己类中的私有方法
    private void escape() {
        run();
    }

    // use getter and setter to be accessed from outside
    public String getName() {
        return name;
    }

    public int setAge(int age) {
        return this.age=age;
    }
}
