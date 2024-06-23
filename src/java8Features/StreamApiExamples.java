package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExamples {
	public static void main(String[] args) {
		List<String> weekdays = Arrays.asList("Monday", "Tuesday", "Wdnsday", "Thursday", "Friday", "Saturday",
				"Sunday", "Sunday");

		weekdays.stream().forEach(day -> System.out.println("Day of the week is " + day));

		System.out.println();

		System.out.println(weekdays.stream().count());

		System.out.println();

		List<String> distinctWeekdays = weekdays.stream().distinct().collect(Collectors.toList());
		distinctWeekdays.stream().forEach(day -> System.out.println("Day of the week is " + day));

		System.out.println();

		List<String> tname = weekdays.stream().filter(day -> day.startsWith("T")).collect(Collectors.toList());
		tname.stream().forEach(day -> System.out.println("Day of the week starts with T " + day));

		System.out.println();

		List<Integer> marks = Arrays.asList(100, 200, 20, 35, 500);
		if (marks.stream().allMatch(num -> num > 100)) {
			System.out.println("Heyyy wow...lets party all got more than 100 marks");
		} else {
			System.out.println("Sorry no Party !!! some of us are not meeting expectations");
		}

		List<Integer> hit=Arrays.asList(1,2,3,4,5,6,6);
		if(hit.stream().anyMatch(num->num>=6)) {
			System.out.println("In this over we got hit a six");
		}
		else {
			System.out.println("No six got hit in this over");
		}
	}
}
