package Lab5;

public class MyPowClass {
    public static int myPow(int number, int power)
    {
        int result;

        if(power != 0)
        {
            result = number * myPow(number, power - 1);

            return result;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 7));
    }
}
