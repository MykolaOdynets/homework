package Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("task2");
		
		Integer [] numbers = { 65, 9000, 87, 12, 45, 88, 69, 58, 12, 45, 88, 65, 69 };
		
		List<Integer> list = Arrays.asList(numbers); //створення колекції типу List з масиву
		Collections.reverse(list);   //
		
		System.out.println(list);
		
		Set<Integer> setWithoutDuplicates = new HashSet<Integer>(list); // перетворення колекії з типу List в "Hashset"
		
		// System.out.println(setWithoutDuplicates); // виведення колекції типу "Hashset"

		Integer [] masyv2 = new Integer [setWithoutDuplicates.size()]; //створення масиву masyv2 довжиною setWithoutDuplicates
		System.out.println("Кількість елементів без повторень " + masyv2.length+ " Символів");
		
		masyv2 = setWithoutDuplicates.toArray(masyv2); //заповнення масиву елементами з колекції (назад)
		
		System.out.println(Arrays.toString(masyv2));

		
		}
}

