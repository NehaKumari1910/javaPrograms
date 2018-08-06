package com.jda.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;


import com.jda.utility.Utility;

public class RegularExpression {
     
	static String data;
	public static void replaceName(String Name) {
		Pattern pttrn = Pattern.compile("<{2}\\w+>{2}");
		Matcher matcher = pttrn.matcher(data);
		if (matcher.find()) {
			data = matcher.replaceAll(Name.split(" ")[0]);
		}
	}

	public static void replaceFullName(String Name) {
		Pattern pttrn = Pattern.compile("<<\\w+\\s\\w+>>");
		Matcher matcher = pttrn.matcher(data);
		if (matcher.find()) {
			data = matcher.replaceAll(Name);
		}
	}
	public static void replacePhoneNumber(String phoneNumber) {
		Pattern pttrn = Pattern.compile("x{10}");
		Matcher matcher = pttrn.matcher(data);
		if (matcher.find()) {
			data = matcher.replaceAll(phoneNumber);
		}
	}
	
	public static void replaceDate() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		Pattern pttrn = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		Matcher matcher = pttrn.matcher(data);
		if (matcher.find()) {
			data = matcher.replaceAll(dtf.format(dateTime));
		}
	}

	public static void main(String[] args) throws IOException {
		 data=new String(Files.readAllBytes(Paths.get("C:\\Javaprograms\\Functional\\src\\com\\jda\\core\\file.txt")));
		System.out.println("Enter Full name:");
		 String fullName = Utility.getstring();
		System.out.println("Enter phone number:");
		 String phoneNumber = Utility.getstring();
		replaceName(fullName);
		replaceFullName(fullName);
		replacePhoneNumber(phoneNumber);
		replaceDate();
		System.out.println(data);
	}
}