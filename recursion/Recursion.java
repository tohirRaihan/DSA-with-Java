package recursion;

class Recursion {

  public int factorial(int n) {
    if (n < 0) return -1;
    if (n <= 1) return 1;
    return n * factorial(n - 1);
  }

  public int fibonacci(int n) {
    if (n < 0) return -1;
    if (n == 0 || n == 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // find the sum of digits of a positive integer number using recursion
  public int sumOfDigits(int n) {
    if (n <= 0) return 0;
    return n % 10 + sumOfDigits(n / 10);
  }

  // calculate power of a number using recursion
  public int power(int base, int exp) {
    if (exp < 0) return -1;
    if (exp == 0) return 1;
    return base * power(base, exp - 1);
  }

  // find GCD (Greatest Common Divisor) of two numbers using recursion
  public int gcd(int a, int b) {
    if (a < 0 || b < 0) return -1;
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
