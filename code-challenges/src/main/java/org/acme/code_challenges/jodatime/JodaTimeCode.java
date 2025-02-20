package org.acme.code_challenges.jodatime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTimeCode {
	
	public void runJodaTime() {
		LocalDate localDate = new LocalDate();
		System.out.println("This is an org.joda.time.LocalDate: " + localDate);
		LocalTime localTime = new LocalTime();
		System.out.println("This is an org.joda.time.LocalTime: " + localTime);
		LocalDateTime localDateTime = new LocalDateTime();
		System.out.println("This is an org.joda.time.LocalDateTime: " + localDateTime);
		DateTime dateTime = new DateTime(DateTimeZone.forID("America/Sao_Paulo"));
		System.out.println("This is an org.joda.time.DateTime with TimeZone: " + dateTime);

		DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Formatted our org.joda.timeLocalDateTime to dd/MM/yyyy HH:mm:ss -> "
				+ localDateTime.toString(formatter));

		LocalDateTime futureDate = localDateTime.plusMonths(1);
		System.out.println("Added one month to the org.joda.time.LocalDateTime -> " + futureDate);
		System.out.println("Checking if our future org.joda.time.LocalDateTime is after our previous LocalDateTime-> "
				+ futureDate.isAfter(localDateTime));

		Period period = new Period(localDate, futureDate.toLocalDate());
		Duration duration = new Duration(localDateTime.toDateTime(), futureDate.toDateTime());
		System.out.println("jorg.joda.time.Period diff: " + period);
		System.out.println("org.joda.time.Duration diff in hours: " + duration.getStandardHours());

		// the mutableDateTime doesn't need reassignment
		MutableDateTime mutableDateTime = new MutableDateTime();
		System.out.println("This is a joda.time.MutableDateTime: " + mutableDateTime);
		mutableDateTime.addDays(5);
		System.out.println("This is a joda.time.MutableDateTime after adding 5 days: " + mutableDateTime);
	}
}
