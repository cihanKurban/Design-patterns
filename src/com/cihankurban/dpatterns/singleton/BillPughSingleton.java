package com.cihankurban.dpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void testSingleton(){
        System.out.println("Bill Pugh Singleton singleton calisti");
    }
}
