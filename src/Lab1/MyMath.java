package Lab1;

public class MyMath {

    public static int findSmallest(int x, int y, int z)
    {
        int smallestInt;

        if(x < y && x < z)
        {
            smallestInt = x;
        }
        else if (y < x && y < z)
        {
            smallestInt = y;
        }
        else
        {
            smallestInt = z;
        }

        return smallestInt;
    }

    public static double calculatePower(double a, int b)
    {
        double finalProduct = 1;

        for(int i=0; i<b; i++)
        {
            finalProduct = finalProduct * a;
        }

        return finalProduct;
    }

    public static int sum(int n)
    {
        int finalProduct = 0;

        for(int i = 0; i<=n; i++)
        {
            finalProduct += i;
        }

        return finalProduct;
    }

    public static double factorial(int n)
    {
        int finalProduct = 1;

        for (int i = 1; i <= n; i++) {
            finalProduct = finalProduct * i;
        }

        return finalProduct;
    }

    public static boolean isPrime(int n)
    {
        int halfpoint = n/2;
        boolean foundFactor = false;
        int i = 2;

        while (i < halfpoint && !foundFactor)
        {
            if(n%i == 0)
            {
                foundFactor = true;
            }
            else
            {
                i = i+1;
            }
        }

        return !foundFactor;
    }

}
