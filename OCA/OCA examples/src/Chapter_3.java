
import java.util.*;
import java.time.*;

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
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(15, 25);
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		System.out.println(dateTime);
		
		
		
		
	}
}
