# Java Christmast Tasks
In this repository you will find the improved code for the Fizzbuzz challenge and the test cases used will be explained bellow.
## Changes made and Outcome from the changes
When I initially run the code I received the following results: </br>
1, FizzBuzz, 3, 4, FizzBuzz, 6, FizzBuzz, FizzBuzz, 9, 10, FizzBuzz, FizzBuzz, 13, FizzBuzz, 15, 16, FizzBuzz, 18, 19, FizzBuzz, 21, FizzBuzz, FizzBuzz, 24, 25, FizzBuzz...

1. Change: changing the return value
in the FizzBuzzGenerator.java </br> The 'divisibleBy' returns  "numerator % Denominator == 2" but instead I returned "numerator % Denominator == 0". </br> The reason why we do that is because for a number to be divisible by another the reminder needs to be 0. </br> </br>
The results I received is:
1, 2, FizzBuzz, 4, FizzBuzz, FizzBuzz, 7, 8, FizzBuzz, FizzBuzz, 11, FizzBuzz, 13, 14, FizzBuzz, 16, 17, FizzBuzz, 19, FizzBuzz, FizzBuzz, 22, 23, FizzBuzz, FizzBuzz... 

2. Change: In the FizzBuzzGenerator.java change "||" to "&&". 
<pre><code>
for (int i = startNumber; i < endNumber ; i++) {
			if(divisibleBy(i, 3) || divisibleBy(i, 5)) fizzBuzzList.add("FizzBuzz");
			else if (divisibleBy(i, 3)) fizzBuzzList.add("Fizz");
			else if (divisibleBy(i, 5)) fizzBuzzList.add("Buz");
			else fizzBuzzList.add(Integer.toString(i));
		}
		return fizzBuzzList;
</code></pre>
The for loop is checking if "i" is divisibleBy "3" or "5". Therefore, the code will check the first if statement and output "FizzBuzz" only, so for it to run through the other else if statement it needs to be check  if "i" is divisibleBy "3" and "5". Therefore the code looks like this now:
<pre><code>
for (int i = startNumber; i < endNumber ; i++) {
			if(divisibleBy(i, 3) && divisibleBy(i, 5)) fizzBuzzList.add("FizzBuzz");
			else if (divisibleBy(i, 3)) fizzBuzzList.add("Fizz");
			else if (divisibleBy(i, 5)) fizzBuzzList.add("Buz");
			else fizzBuzzList.add(Integer.toString(i));
		}
		return fizzBuzzList;
</code></pre>
The reuslts I received when running the code with the above changes is:
</br>
[1, 2, Fizz, 4, Buz, Fizz, 7, 8, Fizz, Buz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buz, Fizz, 22, 23, Fizz, Buz, 26, Fizz, 28, 29, FizzBuzz... ] </br> </br>
The following code will then give me the first 15 digits only.
		<pre><code> System.out.println(fizzBuzzGenerator.FizzBuzz(1,15).toString()); </code></pre>
    
 And the result obtained from this is: </br>
 [1, 2, Fizz, 4, Buz, Fizz, 7, 8, Fizz, Buz, 11, Fizz, 13, 14]

 

