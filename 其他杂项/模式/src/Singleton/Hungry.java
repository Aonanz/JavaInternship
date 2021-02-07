//package Singleton;
//
//// 饿汉式单例模式
//public class Hungry {
//
//    // 创了不用就会浪费空间，平时把它放在getInstance里
//    private byte[] data1 = new byte[1024*1024];
//    private byte[] data2 = new byte[1024*1024];
//    private byte[] data3 = new byte[1024*1024];
//    private byte[] data4 = new byte[1024*1024];
//
//    public Hungry() {
//
//    }
//
//    private final static Hungry HUNGRY = new Hungry();
//
//    public static Hungry getInstance() {
//        return Hungry;
//    }
//
//}
