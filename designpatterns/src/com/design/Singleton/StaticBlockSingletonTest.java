package com.design.Singleton;

public class StaticBlockSingletonTest {

	public static void main(String[] args) {
		System.out.println(StaticBlockSingleton.getInstance().hashCode());
		System.out.println(StaticBlockSingleton.getInstance().hashCode());
		 StaticBlockSingleton staticBlock = StaticBlockSingleton.getInstance();
		System.out.println(staticBlock.hashCode());

	}

}
