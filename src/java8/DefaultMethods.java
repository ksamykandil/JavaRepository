package java8;

public class DefaultMethods {
	interface Calculator {
		public void add();

		// Can't be overridden.
		public static void subtract() {
			System.out.println("Calculator Subtract Method");
		}

		public default void multiply() {
			System.out.println("Calculator Multiply Method");
		}
	}

	class FirstCalculator implements Calculator {
		@Override
		public void add() {
			System.out.println("FirstCalculator Add Method");
		}

		public void multiply() {
			System.out.println("FirstCalculator Multiply Method");
		}
	}

	class SecondCalculator implements Calculator {
		@Override
		public void add() {
			System.out.println("SecondCalculator Add Method");
		}
	}

	public static void main(String[] args) {
		DefaultMethods defaultMethods = new DefaultMethods();

		Calculator firstCalculator = defaultMethods.new FirstCalculator();
		Calculator secondCalculator = defaultMethods.new SecondCalculator();

		Calculator.subtract(); // Calculator Subtract Method

		firstCalculator.add(); // FirstCalculator Add Method
		secondCalculator.add(); // SecondCalculator Add Method

		System.out.println();

		firstCalculator.multiply(); // FirstCalculator Multiply Method
		secondCalculator.multiply(); // Calculator Multiply Method
	}
}
