package com.sheby.hfdpkt.chap05.singleton;
/*
 单例模式
 线程不安全的单例
 {@link com.sheby.hfdpkt.chap05.singleton.ThreadNotSafeSingleton}
 <p>
 单例模式的几种创建方法：主要是为了能够在多线程环境中安全使用
 1.饿汉模式：在classLoader加载到这个类的时候就同时创建创建了一个实例，保证在调用前已经创建好
 {@link  com.sheby.hfdpkt.chap05.singleton.HungrySingleton}
 <p>
 2.双重检查加锁模式
 {@link com.sheby.hfdpkt.chap05.singleton.DoubleCheckSingleton}
 <p>
 3.静态内部类
 {@link com.sheby.hfdpkt.chap05.singleton.InnerSingleton}
 <p>
 4.对getInstance()方法加锁的
 {@link com.sheby.hfdpkt.chap05.singleton.ThreadSafeSingleton}
 <p>
 有点特殊的是，在kotlin中，对于没有参数的构造方法的单例类，可以使用object关键字修饰类
 {@link com.sheby.hfdpkt.chap05.singleton.KotlinSingleton}
 */
