package Day01.TypeReview.变量类型;

public class TestVarType {

    public static void main(String[] args) {

        // 对byte进行范围确认，尝试将int类型强制转换为byte
        System.out.println("Byte type has max: "+Byte.MAX_VALUE);
        System.out.println("Byte type has min: "+Byte.MIN_VALUE);
        System.out.println("Transfer from int to byte: "+(byte) 12345678+"\n----------------");

        // 对int进行范围确认，尝试用两种方法将以下String类型转换为int
        String str1 = "12345";
        String str2 = "-12523";

        // parseInt直接返回原始int类型数据；
        // 而valueOf又装了下箱，返回Integer类型。
        int aInt = Integer.parseInt(str1);
        int bInt = Integer.valueOf(str2);

        System.out.println("Integer type has max: "+Integer.MAX_VALUE);
        System.out.println("Integer type has min: "+Integer.MIN_VALUE);
        System.out.println("Test 2 methods transfer from String to Integer " +
                "and gain answer: "+aInt+", "+bInt);
        System.out.println("----------------\n");

        // 同理类似short，long，float
        System.out.println("Short type has max: "+Short.MAX_VALUE);
        System.out.println("Short type has min: "+Short.MIN_VALUE);
        System.out.println("Long type has max: "+Long.MAX_VALUE);
        System.out.println("Long type has min: "+Long.MIN_VALUE);
        System.out.println("Float type has max: "+Float.MAX_VALUE);
        System.out.println("Float type has min: "+Float.MIN_VALUE);
        System.out.println("Double type has max: "+Double.MAX_VALUE);
        System.out.println("Double type has min: "+Double.MIN_VALUE);
        System.out.println("----------------\n");

        // 尝试将小数（float）转换为整形（int/long）
        System.out.println("2 ways to make float->long");
        System.out.println("/1. Casting: Abort whatever behind the '.': ");
        System.out.println((long)409.49f);
        System.out.println("/2. Rounding, Flooring, Ceiling: ");
        System.out.println(Math.round(123.456f));
        System.out.println(Math.round(123.654f));
        System.out.println((long)Math.floor(123.654f));
        System.out.println((long)Math.ceil(123.111f));
    }

}
