package com.jda.core;

import com.jda.utility.Utility;
public class StopWatch {

	public static void main(String[] args) {
		System.out.println("Enter 1 to start the watch.:");
		Utility.getInt();
		long start_time = System.currentTimeMillis();
		System.out.println("Enter 0 to stop the watch.:");
		Utility.getInt();
		long elapsed_time = System.currentTimeMillis() - start_time;
		System.out.println("Elapsed time(in millisec):"+elapsed_time);
	}

}
