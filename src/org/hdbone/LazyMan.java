package org.hdbone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 懒汉式
// 需要使用的时候才进行加载
public class LazyMan {
    // 通过标志位
    private static boolean Flag=false;
    private LazyMan()
    {
        synchronized (LazyMan.class)
        {
            if(Flag==false)
                Flag=true;
            else
                throw new RuntimeException("不要试图用反射进行破坏");
        }

        //System.out.println(Thread.currentThread().getName()+"ok");
    }
    // volatile : 避免指令重排
    private volatile static LazyMan lazyMan;

    // 双重检测锁模式 DCL 懒汉式
    private static LazyMan getInstance()
    {
        if(lazyMan==null)
        {
            synchronized(LazyMan.class)
            {
                if(lazyMan==null)
                {
                    lazyMan=new LazyMan();//非原子性操作
                    /*
                    * 1.分配内存空间
                    * 2.执行构造方法, 初始化对象
                    * 3.将对象指向这个空间
                    * 期待执行顺序是123
                    * 但可能由于指令重排 执行132
                    * 此时如果lazyman 被占用, if就不会执行 ,
                    * 会产生一段虚无的对象(对象没有初始化 , 不安全)
                    * */
                }
            }
        }

        return lazyMan;
    }

    // 并发有问题
    // 需要synchronized + volatile 使之安全
    /*
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan.getInstance();
            }).start();
        }
    }
    */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<LazyMan> declaredConstructor=LazyMan.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        // 反射无视私有构造器

        /*
        LazyMan instance1=LazyMan.getInstance();
        LazyMan instance2=declaredConstructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        */
        // 反射破坏了单例模式 (可以再添加一个锁)

        // 但可以通过两次反射 避开地三把锁
        // 于是添加一个标志位 Flag
        LazyMan instance3=declaredConstructor.newInstance();
        LazyMan instance4=declaredConstructor.newInstance();
        System.out.println(instance3);
        System.out.println(instance4);
    }
}
