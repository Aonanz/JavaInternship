package Day03.类.抽象类;

public class Jack extends Person {

    public static void main(String[] args) {
        Person jack = new Jack();
        jack.doSth();
    }

    @Override
    public void doSth() {
        System.out.println("I love Rose!");
    }
}
