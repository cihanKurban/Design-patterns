package com.cihankurban.dpatterns.singleton;

public class Run {

    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

        LazySingleton.getLazySingleton().singletonTest();

        ThreadSafeSingleton.getThreadSafeSingleton().testSingleton();

        BillPughSingleton.getInstance().testSingleton();
    }
}
