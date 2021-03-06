
import java.util.*;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Chapter_3 {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//multidimensional array
		/*int[][] twoD = new int[3][2];
		for(int i = 0; i < twoD.length; i++) {
			for(int j = 0; j <  twoD[i].length;j++) {
				System.out.println(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int[] inner : twoD) {
			for (int num : inner) {
				System.out.println(num + " ");
			}
			System.out.println();
		}*/
		//Autoboxing
		
		/*List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60));
		weights.remove(50.5);
		double first = weights.get(0);
		System.out.println(first);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);
		
		//Converting between array and List
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length);
		*/
		
		/*String[] array = {"hawk", "robin"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		list.set(1, "test");
		array[0] = "new";
		for(String b : array) System.out.println(b + " ");*/
		//list.remove(1); we can't change the size of the list
		
		//Sorting
		/*List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);*/
		
		//Working with Dates and Times
		//Creating
		
		/*System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 30);
		LocalDate date2 = LocalDate.of(2020, 1, 30);
		
		LocalTime time1 = LocalTime.of(8, 34);
		LocalTime time2 = LocalTime.of(13, 21, 45);
		LocalTime time3 = LocalTime.of(20, 48, 3, 234);
		
		LocalDateTime dateTime = LocalDateTime.of(date2,  time2);
		
		System.out.println(dateTime);*/
		
		//Manipulating 
		
		/*LocalDate date = LocalDate.of(2020, Month.APRIL, 3);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(2);
		System.out.println();*/
		
		/*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(15, 25);
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		System.out.println(dateTime);
		
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		LocalDate date_1 = LocalDate.of(2020, Month.JANUARY, 15);
		LocalTime time_1 = LocalTime.of(5, 15);
		LocalDateTime dateTime_1 = LocalDateTime.of(date_1, time_1)
				.minusDays(5).minusHours(2).minusSeconds(30);
		System.out.println(dateTime_1);*/
		
		//Working with periods
		/*LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		
		performAnimalEncrichment(start, end);
		
		LocalDate start2 = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end2 = LocalDate.of(2015, Month.MARCH, 15);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start2, end2, period);
		LocalDate end3 = LocalDate.of(2020, Month.MARCH, 10);
		Period annualy = Period.ofYears(1);
		performAnimalEnrichment(start2, end3, annualy);
		Period quarterly = Period.ofMonths(3);
		performAnimalEnrichment(start2, end3, quarterly);*/
		
		//Formatting Dates and Times
		
//		LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 3);
//		System.out.println(date.getDayOfWeek());
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		System.out.println(date.getDayOfYear());
//		
//		System.out.println("***");
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime2 = LocalDateTime.of(date2,time2);
//		System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
//		System.out.println(time2.format(DateTimeFormatter.ISO_LOCAL_TIME));
//		System.out.println(dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//
//		System.out.println("***");
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime2));
		System.out.println(shortDateTime.format(date2));
		//System.out.println(shortDateTime.format(time2));
		System.out.println("***");
		DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime2.format(shortDateTime2));
		System.out.println(date2.format(shortDateTime2));
		//System.out.println(time2.format(shortDateTime2));
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime2));
		System.out.println(mediumF.format(dateTime2));
		
		//Own formatter 
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime2.format(f));
		
		//Parsing Dates and Times
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date3 = LocalDate.parse("01 02 2015" ,f2);
		LocalTime time3 = LocalTime.parse("11:22");
		System.out.println(date3);
		System.out.println(time3);
		
	}
	
	private static void performAnimalEncrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);
		}
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end,
			Period period) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
}
