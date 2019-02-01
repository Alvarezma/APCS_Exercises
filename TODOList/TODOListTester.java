import java.util.Random;

public class TODOListTester{
    
    public static void main (String[] args) {
        System.out.println(testSelectionSort());
        System.out.println(testBubbleSort());
        System.out.println(testInsertionSort());
        System.out.println(testCombSort());
        System.out.println(testBinarySearch());
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

    public static boolean testBinarySearch()  {
        TODOList todd = new TODOList();
        todd.add("coolio", 2); //0  
        todd.add("coolio", 2); //1
        todd.add("coolio", 2); //2
        todd.add("coolio", 2); //3
        todd.add("coolio", 2); //4
        todd.add("coolio", 2); //5
        todd.add("coolio", 2); //6
        todd.add("coolio", 2); //7
        todd.add("coolio", 3); //8
        todd.add("coolio", 3); //9
        todd.add("coolio", 4); //10
        todd.add("coolio", 5); //11
        todd.add("coolio", 5); //12
        todd.add("coolio", 5); //13
        todd.add("coolio", 5); //14
        todd.add("coolio", 5); //15
        todd.add("coolio", 5); //16
        todd.add("coolio", 5); //17
        return todd.binarySearch(4);
    }
}