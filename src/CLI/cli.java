package CLI;

import Sorting.Sort_Array;

import java.util.Scanner;

public class cli {
    public void i()
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        System.out.println("Enter the path of desired file that contains the list: ");
        String filename = scan.nextLine();
        int choice;
        while (!valid)
        {
            System.out.println("Please choose from the following");
            System.out.println("1- Sort the list of elements of the array.");
            System.out.println("2- Exit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1 -> valid=true;
                case 2 -> System.exit(0);
                default -> System.out.println("Enter a valid choice");
            }
        }
        Sort_Array s = new Sort_Array(filename);
        do {
            System.out.println("choose 1,2,3,4 or 5");
            System.out.println("1- Simple Sorting algorithm");
            System.out.println("2- Efficient Sorting algorithm");
            System.out.println("3- Non-Comparison Sorting algorithm");
            System.out.println("4- Heap Sort Algorithm");
            System.out.println("5- another input File");
            System.out.println("6- Exit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1 ->
                {
                    int c=return_type();
                    switch (c)
                    {
                        case 1->print1d((int[]) s.simpleSort(true));
                        case 2->print2d((int[][]) s.simpleSort(false));
                        case 3->{
                            System.out.println("The intermediate arrays: ");
                            print2d((int[][]) s.simpleSort(false));
                            System.out.println("The final sorted array: ");
                            print1d((int[]) s.simpleSort(true));
                        }
                    }
                }
                case 2 -> {
                    int c=return_type();
                    switch (c)
                    {
                        case 1->print1d((int[]) s.efficientSort(true));
                        case 2->print2d((int[][]) s.efficientSort(false));
                        case 3->{
                            System.out.println("The intermediate arrays: ");
                            print2d((int[][]) s.efficientSort(false));
                            System.out.println("The final sorted array: ");
                            print1d((int[]) s.efficientSort(true));
                        }
                    }
                }
                case 3 -> {
                    int c=return_type();
                    switch (c)
                    {
                        case 1->print1d((int[]) s.nonComparisonSort(true));
                        case 2->print2d((int[][]) s.nonComparisonSort(false));
                        case 3->{
                            System.out.println("The intermediate arrays: ");
                            print2d((int[][]) s.nonComparisonSort(false));
                            System.out.println("The final sorted array: ");
                            print1d((int[]) s.nonComparisonSort(true));
                        }
                    }
                }
                case 4 -> {
                    int c=return_type();
                    switch (c)
                    {
                        case 1->print1d((int[]) s.heapSort(true));
                        case 2->print2d((int[][]) s.heapSort(false));
                        case 3->{
                            System.out.println("The intermediate arrays: ");
                            print2d((int[][]) s.heapSort(false));
                            System.out.println("The final sorted array: ");
                            print1d((int[]) s.heapSort(true));
                        }
                    }
                }
                case 5 -> i();
                case 6 -> System.exit(0);
                default -> System.out.println("enter valid choice");
            }
        }while (true);
    }
    private int return_type()
    {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please, choose what do you want?");
            System.out.println("1- the sorted array");
            System.out.println("2- the intermediate array");
            System.out.println("3- the sorted array and the intermediate array");
            int choice2 = scan.nextInt();
            if(choice2 == 1||choice2==2||choice2==3)
                return choice2;
            System.out.println("Enter valid choice 1,2 or 3");
        }while (true);
    }
    private void print1d(int[] arr)
    {
        for (int i:arr)
            System.out.print(i + " ");
        System.out.println();
    }
    private void print2d(int[][] arr)
    {
        for (int[] A: arr) {
            for (int i:A) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
