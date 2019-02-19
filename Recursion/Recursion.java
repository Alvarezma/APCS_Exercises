class Recursion    {


    public static void main(String[] args)  {
    
        System.out.println(factorial(3));
        System.out.println(fibonacci(5));
        System.out.println(reverse("hello"));
        System.out.println(padjenacci(4));
        int[] list = {0, 3, 4, 6, 8, 15, 20};
        System.out.println(binarySearch(list, 0));
    }

    public static int factorial(int n)  {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n)  {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static String reverse(String word)  {
        if (word.length() <= 1) {
            return word;
        }
        return word.substring(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
    }

    public static int padjenacci(int n)  {
        if (n <= 3) {
            return n;
        }
        return (int)(Math.pow(padjenacci(n-1), 2) - Math.pow(padjenacci(n-2), 2) + Math.pow(padjenacci(n-3), 2));
    }

    public static boolean binarySearch(int[] list, int target)  {
        return binarySearch(list, target, 0, list.length - 1);
    }

    private static boolean binarySearch(int[] list, int target, int min, int max)  {
        if (max - min <= 1) {
            return false;
        }
        int place = (max - min)/2 + min;
        if (list[place] == target || list[min] == target || list[max] == target)    {
            return true;
        } else if (list[place] < target)  {
            return binarySearch(list, target, place, max);
        } else  {
            return binarySearch(list, target, min, place);
        }
    }

    public static String merge(String a, String b) {
        String answer = "";
        int place_a = 0;
        int place_b = 0;

        while (a.length() - 1 != place_a && b.length() - 1 != place_b)  {

        }
    }
}