package com.cihankurban.dpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){

    }
    /*
        synchronized ile birden fazla thred bu metodu cagirdiginda ilk işin tamamlanması beklenir, bu yapıda multithread
        desteklenir, fakat buraya cok sayida cagri yapildiginda beklemeden kaynakli performans sorununa neden olabilir.
     */
    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if(threadSafeSingleton == null)
            threadSafeSingleton = new ThreadSafeSingleton();
        return threadSafeSingleton;
    }

    public void testSingleton(){
        System.out.println("Thread Safe singleton calisti");
    }

}
