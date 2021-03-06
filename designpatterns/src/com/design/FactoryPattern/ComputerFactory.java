package com.design.FactoryPattern;
/**
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need 
 * to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program 
 * to the factory class.
 * @author bridgelabz
 *
 */
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Laptop".equalsIgnoreCase(type)) return new Laptop(ram, hdd, cpu);
		
		return null;
	}
}

