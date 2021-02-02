package Day01.Loop;

// 像车站放行，要通过的车不满足条件就一直不让通过
public class WhileLoop {
    public static void main(String[] args) {
        // Do While
        int i = 0;
        do{
            System.out.println("The value of i is :" + i);
            i++;
        } while(i<10);
        // normal while
        while (i<10) {
            System.out.println("The value of i is: " + i);
            i++;
        }
    }

}
