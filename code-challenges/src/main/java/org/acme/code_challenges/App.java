package org.acme.code_challenges;

import org.acme.code_challenges.javatime.JavaTimeCode;
import org.acme.code_challenges.jodatime.JodaTimeCode;

public class App {
	public static void main(String[] args) {
		JavaTimeCode javaTime = new JavaTimeCode();
		javaTime.runJavaTime();
		JodaTimeCode jodaTime = new JodaTimeCode();
		jodaTime.runJodaTime();
	}
}
