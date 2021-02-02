package Day01.逻辑判断.IfElse;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Need your height data");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            if (scan.nextInt() > 170) {
                System.out.println("Well this person is probably male");
            } else {
                System.out.println("Probably a girl");
            }
        } else {
            System.out.println("Please give me some useful data");
        }
    }
}
