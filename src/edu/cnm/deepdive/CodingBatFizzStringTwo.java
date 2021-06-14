package edu.cnm.deepdive;

/*

Given an int n, return the string form of the number followed by "!".
So the int 6 yields "6!".
Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is
divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".

fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
 */

public class CodingBatFizzStringTwo {

  public static void main(String[] args) {
    System.out.printf("with the number %d, the method will return " + fizzString2(1) + ".\n", 1);
    System.out.printf("with the number %d, the method will return " + fizzString2(2) + ".\n", 2);
    System.out.printf("with the number %d, the method will return " + fizzString2(3) + ".\n", 3);
  }

  public static String fizzString2(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "FizzBuzz!";
    } else if (n % 3 == 0) {
      return "Fizz!";
    } else if (n % 5 == 0) {
      return "Buzz!";
    } else {
      return n + "!";
    }
  }

}
