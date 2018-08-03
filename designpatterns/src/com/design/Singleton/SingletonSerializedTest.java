package com.design.Singleton;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInput;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutput;
	import java.io.ObjectOutputStream;
	/*
	 * Sometimes in distributed syatems,we need to implement serializable interface in singleton class so thete we can
	 * store its state in file system and retrieve  it at later point of time.
	 */
/*
 * The problem with below serialized singleton class is there whenever we deserialize it,it will create a new instance of
 * the class.

 */


	public class SingletonSerializedTest {

	    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
	                "file.txt"));
	        out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "file.txt"));
	        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
	        in.close();
	        
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        
	    }

	}
	/**
	 * So it destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation 
	 * of readResolve() method.
	 * protected Object readResolve() {
    return getInstance();
}

	 */

