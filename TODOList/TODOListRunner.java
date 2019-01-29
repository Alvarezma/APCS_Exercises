import java.util.Scanner;

class TODOListRunner    {

    public static void main(String[] args)  {
        Scanner scan = new Scanner( System.in );
        Scanner scan2 = new Scanner( System.in );

        int input;
        String desc;
        int priority;
        int target;
        String complete;
        TODOList todd = new TODOList();

        System.out.println("Enter a number to continue\n1 = adding\n2 = display\n3 = change items status\n4 = remnove an item\n5 = sort list\n0 = quit");
        input = scan.nextInt();
        while (input < 0 || input > 5)   {
            System.out.println("Incorrect input please enter a input between 0 and 5");
            input = scan.nextInt();
        }

        while(input > 0)    {
            if (input == 1)  {
                System.out.println("Description?");
                desc = scan2.nextLine();

                System.out.println("Priority?");
                priority = scan.nextInt();

                while (priority < 1 || priority > 5)   {
                    System.out.println("Incorrect input please enter a priority between 1 and 5");
                    priority = scan.nextInt();
                }

                todd.add(desc, priority);
            } else if(input == 2)   {
                System.out.println("\n" + todd.display());
            } else if(input == 3)   {
                System.out.println("Place in list?");
                target = scan.nextInt();

                System.out.println("What to set it too?");
                complete = scan2.nextLine();

                if(complete.toLowerCase().equals("complete"))    {
                    todd.setStatus(target, true);
                } else  {
                    todd.setStatus(target, false);
                }
            } else if(input == 4)   {
                System.out.println("Place in list?");
                target = scan.nextInt();
                todd.remove(target);
            } else if(input == 5)   {
                // todd.selectionSort();
                // todd.bubbleSort();
                // todd.insertionSort();
                todd.combSort();
                System.out.println("\n" + todd.display());
            }
            System.out.println("\nEnter a number to continue\n1 = adding\n2 = display\n3 = change items status\n4 = remnove an item\n5 = sort list\n0 = quit");
            input = scan.nextInt();
            while (input < 0 || input > 5)   {
                System.out.println("Incorrect input please enter a input between 0 and 4");
                input = scan.nextInt();
            }
        }

        
    }
}