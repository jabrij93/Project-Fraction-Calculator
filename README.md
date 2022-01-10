# Project-Fraction-Calculator
This project is designed to help you practice building your own object class and testing it with a client class. You will be creating two classes, one called Fraction and the other called FractionCalculator. The Fraction class is an object that holds information about a fraction (numerator and denominator). It will have several constructors and both private and public methods implementing the behavior of a fraction. The FractionCalculator class is a class that will allow the user to enter in fractions and operations, calculating and displaying the result. It will run until the user tells it to quit. When this program is complete, you won’t have to second guess your fraction arithmetic ever again!

Part 1 - Fraction Class
Create a new class called "Fraction" and include the following:

Fields
two private instance variables to hold the numerator and denominator as ints
Constructors
a two parameter constructor that initializes the numerator and denominator
This constructor should throw an IllegalArgumentException if the denominator is zero
If the user enters a negative denominator bump the negative sign to the numerator. For example, -3/-2 should be converted to 3/2. Likewise, 5/-3 should be converted to -5/3
example: Fraction myFrac = new Fraction(4,5); creates a fraction who's numerator is 4 and denominator is 5
one parameter constructor that initializes the object equal in value to the integer parameter.
example: Fraction myFrac = new Fraction(3) would create a Fraction with numerator equal to 3 and denominator equal to 1.
zero parameter constructor that initializes the object to 0, meaning the numerator is 0 and the denominator is 1
example: Fraction myFrac = new Fraction(); would create a fraction who's decimal value is 0
You should eliminate as much redundancy as possible by letting your constructors rely on one another using the "this" keyword.

Methods

![method](https://user-images.githubusercontent.com/95333101/148774578-f87e6a22-9078-4a5f-aca5-48fe46c2a015.png)


equals()
Override the Object equals() method so that it accurately determines whether or not two fractions are equal. In order to have it override, it has to take an Object as a parameter. Your method should check whether or not the parameter is an instanceof Fraction, since if it is not a Fraction it cannot be equal. Don’t forget to cast the parameter to a Fraction after you check if it is an Object of type Fraction so that you can access its variables. Two fractions are equal if they represent the same number (i.e. 3/6 = 1/2 and -2/3 = 2/-3).

toLowestTerms()
To convert a fraction to lowest terms we have to determine the greatest common divisor (factor) between the numerator and denominator. The greatest common divisor of two numbers a and b, is the largest number that evenly divides both a and b.

The Euclidean Algorithm is a fast method for determining the GCD of two numbers. Here is pseudocode for its implementation:

while a and b are not zero
find the remainder of a divided by b
set a to b
set b to the remainder you found
return a
Here is an example of how it would work if a is 105 and b is 147.

![f1](https://user-images.githubusercontent.com/95333101/148774373-10477e90-91fb-45b6-9ba6-86c1341856ca.png)

gcd()
Implement gcd() as a public static method that takes two integers as parameters and returns an int that is their greatest common divisor.

Part 2 – FractionCalculator Class
In this section, you will implement a FractionCalculator class that has a main method and three helper methods. Here is a screenshot from a sample run:

![part 2 fraction calc class](https://user-images.githubusercontent.com/95333101/148774758-5d7acf83-c957-4a54-8d64-04660802de2f.png)

Your program should be robust so that it if the user enters invalid input it will continue to re-prompt them until it is valid. Here is an example run where the user is confused and enters invalid input:

![2-inputValidation](https://user-images.githubusercontent.com/95333101/148774875-23988e30-83a0-43a5-9d5c-4376cda78229.png)

Methods

![methods](https://user-images.githubusercontent.com/95333101/148774953-e1da122c-e946-4a2b-a60b-8bbcf0bd9989.png)

getOperation()
Here is example output from a call to getOperation():

![3-getFraction](https://user-images.githubusercontent.com/95333101/148775017-531a29bb-d33d-420c-9dbc-92bc598823b8.png)

validFraction()
Some things to be mindful of when implementing the validFraction() method:

The first character may or may not be a "-" character. If a negative shows up anywhere else, then it is not a valid fraction. It may be helpful to remove the "-" character if there is one.
If there is no "/" character, then every character in the string must be a number (if you removed the "-" sign).
If there is a "/" character, then it may be helpful to create substrings for the numerator and denominator.
Both substrings must be non-empty.
Both must be entirely made of numbers.
The denominator cannot be "0".
Hint 1: It may be useful to create a helper method isNumber() that takes a String as input and returns true if every character in the String is a number 0-9 and false otherwise. This method can also check for empty strings. Hint 2: Once you determine whether or not the Strings are numbers, you may find the Integer.parseInt() method helpful.

getFraction()

Here is example output from a call to getFraction(). If the user enters any thing that is not a valid Fraction, it should re-prompt them until it is valid: 

![3-getFraction (1)](https://user-images.githubusercontent.com/95333101/148775100-acdfb409-c17f-4251-ab6c-e06a1df08277.png)

This call would return a new Fraction object equal to -31/1. No user input should throw an exception! If you are getting exceptions, then it is likely your validFraction method isn’t correct.

Part 3 - Putting it all together!
Write a short introduction method that describes the calculator program and welcomes your user
Ask the user to enter in an operation
As long as the user enters something that’s not "q" or "Q" when asked for an operation you should run the calculator
Get two fractions from the user and then perform whichever operation they ask for
Print the result of the operation

Here is an example run of the entire program: 

![4-sampleRun](https://user-images.githubusercontent.com/95333101/148775288-0735d194-cbc6-41e7-8ff8-fe8309820fc7.png)

Part 4 - Hacker Problem - FractionCalculatorAdvanced
Create another class called FractionCalculatorAdvanced. You may cut and paste useful methods from FractionCalculator. The key difference between FractionCalculator and FractionCalculatorAdvanced is that the user can enter in their operations on a single line. Allow the user to enter their input onto a single line. Your program must be robust so that if the user enters in invalid input, it will re-prompt them until they either enter a q to quit or a valid operation. It is possible to do this without try/catch, but it is quite difficult. You may read about try/catch blocks here: http://beginnersbook.com/2013/04/try-catch-in-java/. Here is sample output from a run of FractionCalculatorAdvanced:

![5-fracCalcAdv](https://user-images.githubusercontent.com/95333101/148775364-4079cc8a-b324-4d23-8be6-5e6e550d9542.png)
