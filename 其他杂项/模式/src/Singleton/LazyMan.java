package Singleton;

import java.lang.reflect.Constructor;

public class LazyMan {
    private LazyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }
    private static LazyMan lazyMan;

    // 双重检测锁模式的懒汉式单例
    public static LazyMan getInstance() {
        // 没有才创建，第一层判定提高性能
        if(lazyMan==null) {
            // 锁class保证LazyMan对象只有一个
            synchronized (LazyMan.class) {
                if(lazyMan==null) {
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }
    // 单线程下单例ok
    // 多线程并发时：
//    public static void main(String[] args) {
//        for (int i = 0; i < 200; i++) {
//            new Thread(()->{
//                    LazyMan.getInstance();
//            }).start();
//        }
//    }

    public static void main(String[] args) throws NoSuchMethodException {
        LazyMan instance = LazyMan.getInstance();
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
    }



}
