class Recursion    {

    public static void main(String[] args)  {
    
        System.out.println(factorial(3));
        System.out.println(fibonacci(5));
        System.out.println(reverse("hello"));
        
    }

    public static int factorial(int n)  {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n)  {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static String reverse(String word)  {
        if (word.length() == 1) {
            return word;
        }
        return word.substring(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
    }
}