package Lab5;

public class ReverseClass {
    public static String reverse(String text)
    {

        if(text.length() == 0)
        {
            return text;
        }
        else {

            String result = reverse(text.substring(1)) + text.charAt(0);

            return result;
        }
    }

    public static void main(String[] args) {
        String text = "Hello!";


        System.out.println(text);
        System.out.println(reverse(text));
    }
}
