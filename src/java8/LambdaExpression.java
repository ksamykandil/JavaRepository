package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 2, 4, 3, 1);

		// Java 7.
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer int1, Integer int2) {
				return Integer.compare(int1, int2);
			}
		});

		// Java 8.
		list.sort((int1, int2) -> {
			return Integer.compare(int1, int2);
		});

		// Also this will compile & run.
		list.sort((int1, int2) -> Integer.compare(int1, int2));

		// Also this will compile & run.
		list.sort((int1, int2) -> {
			if (int1 < int2)
				return -1;

			if (int1 > int2)
				return 1;

			return 0;
		});

		// Also this will compile & run.
		list.sort((int1, int2) -> int1 - int2);
	}
}
