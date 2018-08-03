package com.design.Singleton;
/**
 1.Enum is to overcome the situation with reflection.
 2. Enum to implement Singleton design pattern as Java ensures that any enum value is instantiated only once in a 
 * Java program. Since Java Enum values are globally accessible, so is the singleton. The drawback is that the enum t
 * ype is somewhat inflexible; for example, it does not allow lazy initialization.
 *
 */
public class EnumSingletonTest {
	public static void main(String args[]){
	EnumSingleton en=EnumSingleton.INSTANCE;
    System.out.println(en.hashCode());
    en=EnumSingleton.INSTANCE;
    System.out.println(en.hashCode());
	}
}
