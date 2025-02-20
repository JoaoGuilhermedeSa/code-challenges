package org.acme.code_challenges.javatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeCode {
	
	public void runJavaTime() {

		LocalDate localDate = LocalDate.now();
		System.out.println("This is a java.time.LocalDate -> " + localDate);
		LocalTime localTime = LocalTime.now();
		System.out.println("This is a java.time.LocalTime -> " + localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("This is a java.time.LocalDateTime -> " + localDateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("This is a java.time.ZonedDateTime -> " + zonedDateTime);
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println("This is a java.time.OffsetDateTime -> " + offsetDateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Formatted our org.joda.timeLocalDateTime to dd/MM/yyyy HH:mm:ss -> "
				+ localDateTime.format(formatter));

		LocalDateTime futureDate = localDateTime.plusMonths(1);
		System.out.println("Added one month to the java.time.LocalDateTime -> " + futureDate);
		System.out.println("Checking if our future java.time.LocalDateTime is after our previous LocalDateTime-> "
				+ futureDate.isAfter(localDateTime));

		Period period = Period.between(localDate, futureDate.toLocalDate());
		Duration duration = Duration.between(localDateTime, futureDate);
		System.out.println("java.time.Period diff: " + period);
		System.out.println("java.time.Duration diff in Hours: " + duration.toHours());

		// it needs to be assigned to a new variable to work
		LocalDate immutableDate = LocalDate.of(2025, 2, 19);
		LocalDate modifiedDate = immutableDate.plusDays(5);
		System.out.println("This is a java.time LocalDate: " + immutableDate);
		System.out.println("This is a java.time.LocalDate after adding 5 days: " + modifiedDate);

	}
}
