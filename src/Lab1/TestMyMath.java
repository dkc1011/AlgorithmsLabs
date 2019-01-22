package Lab1;

public class TestMyMath {
    public static void main(String[] args) {

        int smallestInt;

        smallestInt = MyMath.findSmallest(6, 12, 14);
        System.out.println("Smallest number 1: " + smallestInt);
        //Expected 6

        smallestInt = MyMath.findSmallest(17, 9, 14);
        System.out.println("Smallest number 2: " + smallestInt);
        //Expected 9

        smallestInt = MyMath.findSmallest(6, 12, 5);
        System.out.println("Smallest number 3: " + smallestInt);
        //Expected 5

        System.out.println("\n----------------\n");

        double powerTest;

        powerTest = MyMath.calculatePower(3,3);
        System.out.println("Power 1: " + powerTest);
        //Expected 27

        powerTest = MyMath.calculatePower(8,0);
        System.out.println("Power 2: " + powerTest);
        //Expected 1

        System.out.println("\n----------------\n");

        int sumTest;

        sumTest = MyMath.sum(4);
        System.out.println("Sum 1: " + sumTest);
        //Expected 10

        sumTest = MyMath.sum(1);
        System.out.println("Sum 2: " + sumTest);
        //Expected 1

        System.out.println("\n----------------\n");

        double factorialTest;

        factorialTest = MyMath.factorial(3);
        System.out.println("Factorial 1: " + factorialTest);
        //Expected 6

        factorialTest = MyMath.factorial(9);
        System.out.println("Factorial 2: " + factorialTest);
        //Expected 362880

        System.out.println("\n----------------\n");

        boolean isPrime;

        isPrime = MyMath.isPrime(16);
        if(isPrime)
        {
            System.out.println("16 is a prime number");
        }
        else
        {
            System.out.println("16 is not a prime number");
        }
        //Expected false

        isPrime = MyMath.isPrime(13);
        if(isPrime)
        {
            System.out.println("13 is a prime number");
        }
        else
        {
            System.out.println("13 is not a prime number");
        }
        //Expected true
    }
}
