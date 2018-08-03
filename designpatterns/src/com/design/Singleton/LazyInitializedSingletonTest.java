package com.design.Singleton;

public class LazyInitializedSingletonTest {

	public static void main(String[] args) {
		System.out.println(LazyInitializedSingleton.getInstance().hashCode());
		System.out.println(LazyInitializedSingleton.getInstance().hashCode());
		LazyInitializedSingleton lazyinitialization = LazyInitializedSingleton.getInstance();
		System.out.println(lazyinitialization.hashCode());
	}

}
