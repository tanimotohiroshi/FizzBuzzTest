package fizzbuzz;

public class FizzBuzz {

	public static void main ( String args[]) {


		for (int i = 1; i < 101 ; i++){
			System.out.println(fizz(i));
		}

	}


	public static String fizz(int i) {

		String str;

		if ( i % 15 == 0) {
			str = "FizzBuzz";
			return str;
		} else if ( i % 5 == 0 ) {
			str = "Buzz";
			return str;
		} else if ( i % 3 == 0) {
			str = "Fizz";
			return str;
		} else {
			str = String.valueOf(i);
			return  str;
		}
	}
}
