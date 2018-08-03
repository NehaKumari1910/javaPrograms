package com.design.Singleton;

public class EagerInitializationsingletonTest {

	public static void main(String[] args) {
		System.out.println("EagerInitialization test");
		System.out.println(EagerInitialization.getInstance().hashCode());
		System.out.println(EagerInitialization.getInstance().hashCode());
		EagerInitialization eagerInitialization = EagerInitialization.getInstance();
		System.err.println(eagerInitialization.hashCode());
	}

}
