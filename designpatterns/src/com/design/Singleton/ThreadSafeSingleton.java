package com.design.Singleton;
/*
 1.The easier way to create a thread-safe singleton class is to make the global access 
 method synchronized, so that only one thread can execute this method at a time. 
 
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    /*
     * Synchronize the getInstance() method :-
       Pros: Thread safety is guaranteed.
             Client application can pass parameters
             Lazy initialization achieved
       Cons:Slow performance because of locking overhead.
            Unnecessary synchronization that is not required once the instance variable 
            is initialized.
     */
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    /*
     * Use synchronized block inside the if loop and volatile variable
     Pros:1.Thread safety is guaranteed
		  2.Client application can pass arguments
		  3.Lazy initialization achieved
          4. Synchronization overhead is minimal and applicable only for first few threads 
          when the variable is null.
     cons:Extra if condition
     */

public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}

    
}

