package com.design.Singleton;
/**
 * In eager initialization, the instance of Singleton Class is created at 
 * the time of class loading, this is the easiest method to create a singleton class 
 * but it has a drawback that instance is created even though client application might 
 * not be using it.
 * @author 1022783
 *
 */
public class EagerInitialization {
	private static final EagerInitialization instance=new EagerInitialization();
	private EagerInitialization() {
	}
	public static EagerInitialization getInstance()
	{
		return instance;
	}

}
