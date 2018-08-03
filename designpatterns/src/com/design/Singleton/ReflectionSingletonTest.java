package com.design.Singleton;
import java.lang.reflect.Constructor;
/*
 *1.
 2. java Reflection provides ability to inspect and modify the runtime behavior of application.
 Using java reflection we can inspect a class,interface,get their structure ,methods and fields at runtime even though
 class is not accessible at compile time.We can also use reflection to instantiate an object,invoke it's method,change field value.
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors =EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}

