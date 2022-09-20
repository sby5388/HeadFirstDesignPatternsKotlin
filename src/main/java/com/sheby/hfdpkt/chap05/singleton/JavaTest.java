package com.sheby.hfdpkt.chap05.singleton;

public class JavaTest {
    static {
        System.out.println("--static--");
    }

    public static void main(String[] args) {
        System.out.println("---start main--");
        final DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        final HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        final KotlinSingleton kotlinSingleton = KotlinSingleton.INSTANCE;

        final ThreadNotSafeSingleton threadNotSafeSingleton = ThreadNotSafeSingleton.getInstance();
        final ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        final InnerSingleton innerSingleton = InnerSingleton.getInstance();

        System.out.println("---end main--");


    }
}
