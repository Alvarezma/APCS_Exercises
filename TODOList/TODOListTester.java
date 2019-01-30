import java.util.Random;

public class TODOListTester{
    
    public static void main (String[] args) {
        System.out.println(testSelectionSort());
        System.out.println(testBubbleSort());
        System.out.println(testInsertionSort());
        System.out.println(testCombSort());
    }

    public static boolean testSelectionSort()  {
        TODOList todd = new TODOList();
        Random random = new Random();
        for (int i = 0; i < 30; i++)    {
            todd.add("existence is suffering", (random.nextInt(5) + 1));
        }
        todd.selectionSort();
        return todd.sortCheck();
    }

    public static boolean testBubbleSort()  {
        TODOList todd = new TODOList();
        Random random = new Random();
        for (int i = 0; i < 30; i++)    {
            todd.add("there is no salvation", (random.nextInt(5) + 1));
        }
        todd.bubbleSort();
        return todd.sortCheck();
    }

    public static boolean testInsertionSort()  {
        TODOList todd = new TODOList();
        Random random = new Random();
        for (int i = 0; i < 30; i++)    {
            todd.add("reality is a low budget illusion", (random.nextInt(5) + 1));
        }
        todd.insertionSort();
        return todd.sortCheck();
    }

    public static boolean testCombSort()  {
        TODOList todd = new TODOList();
        Random random = new Random();
        for (int i = 0; i < 30; i++)    {
            todd.add("my life is a happy accident", (random.nextInt(5) + 1));
        }
        todd.combSort();
        return todd.sortCheck();
    }
}