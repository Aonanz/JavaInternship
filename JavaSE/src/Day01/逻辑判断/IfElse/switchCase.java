package Day01.逻辑判断.IfElse;

public class switchCase {
    public static void main(String[] args) {
        String name = "Jack";
        switch(name){
            case "Jack" :
                System.out.println("A dead painter.");
                break;
            case "Rose" :
                System.out.println("A rich girl.");
                break;
            default :
                System.out.println("Well, "+name+" is nothing.");
        }
    }

}
