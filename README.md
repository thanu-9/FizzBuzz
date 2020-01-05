# Java Christmast Tasks
In this repository you will find the improved code for the Fizzbuzz challenge and the test cases used will be explained bellow.
## Changes made and Outcome from the changes
When I initially run the code I received the following results:
'1, FizzBuzz, 3, 4, FizzBuzz, 6, FizzBuzz, FizzBuzz, 9, 10, FizzBuzz, FizzBuzz, 13, FizzBuzz, 15, 16, FizzBuzz, 18, 19, FizzBuzz, 21, FizzBuzz, FizzBuzz, 24, 25, FizzBuzz...'
1. Change: changing the return value
In the FizzBuzzGenerator.java the 'divisibleBy' returns  "numerator % Denominator == 2" but instead I returned "numerator % Denominator == 0".
The results I received is:
1, 2, FizzBuzz, 4, FizzBuzz, FizzBuzz, 7, 8, FizzBuzz, FizzBuzz, 11, FizzBuzz, 13, 14, FizzBuzz, 16, 17, FizzBuzz, 19, FizzBuzz, FizzBuzz, 22, 23, FizzBuzz, FizzBuzz...

2. Change
