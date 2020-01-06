import java.util.ArrayList;
import java.util.List;
/*  ## Fizz Buzz Challenge
		In this repository, you will find a solution to the Fizz Buzz program you attempted before joining Sparta Global.
		* You need to investigate how you can *test* if this program works according the specification.
		* Next, if you find any problems, repair them and retest the program
		* Create a short markdown file that explains your testing process, the changes you made if any, and the results of your tests before and after the changes were made

		### Requirements for FizzBuzz Program
		*Write a program that returns a List of strings from a List of int 's  But for multiples of three insert “Fizz” instead of the number and for the multiples of five insert “Buzz”.
		For numbers which are multiples of both three and five insert “FizzBuzz”. All other values will be numbers.*

		*You will also need to create a divisibleBy() method that accepts two int 's first being the number and the second the number to divide by. This method will return a boolean.*

		*Notes:*

		*Ensure you use the test code to print out your return statements:*

		***DivisibleBy considerations:***
		* *divisibleBy(4,2) should return true*
		* *divisibleBy(3,2) should return false*

		***fizzBuzzGenerator considerations:***
		* *fizzBuzzGenerator(1,15) should return ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "buzz", "11", "Fizz", "13", "14", "FizzBuzz"]*
		* *Keep note that the list must contain String items*
*/
public class FizzBuzzGenerator {
	public boolean divisibleBy(int numerator, int Denominator) {
		int answer = 0;
		return numerator % Denominator == 0;
	}

	public List<String> FizzBuzz(int startNumber, int endNumber) {
		List<String> fizzBuzzList = new ArrayList<String>();

		for (int i = startNumber; i < endNumber ; i++) {
			if(divisibleBy(i, 3) && divisibleBy(i, 5)) fizzBuzzList.add("FizzBuzz");
			else if (divisibleBy(i, 3)) fizzBuzzList.add("Fizz");
			else if (divisibleBy(i, 5)) fizzBuzzList.add("Buz");
			else fizzBuzzList.add(Integer.toString(i));
		}
		return fizzBuzzList;
	}
}
