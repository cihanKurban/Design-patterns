package com.cihankurban.dpatterns.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton EAGER_INITIALIZATION_SINGLETON = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){
        //Disariden sinifin new'lenmesi kapatildi.
    }

    public static EagerInitializationSingleton getInstance(){
        return EAGER_INITIALIZATION_SINGLETON;
    }

    public void singletonTest(){
        System.out.println("Eager Singleton method calisti");
    }
}
