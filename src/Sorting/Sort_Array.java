package Sorting;

import FileReader.Freader;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Array {
    private final int[] Unsorted_Array;
    public Sort_Array(String filename)
    {
        this.Unsorted_Array= Freader.read(filename);
    }
    public Object Simple_Sort(boolean choice)
    {
        return bubble_sort(this.Unsorted_Array,choice);
    }
    private Object bubble_sort(int[] unsorted,boolean choice)
    {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(unsorted.clone());
        for (int i = unsorted.length; i > 1; i--)
        {
            for (int j = 0; j < i-1; j++) {
                if (unsorted[j] > unsorted[j + 1])
                    swap(j, unsorted);
            }
            list.add(unsorted.clone());
        }
        return choice ? list.get(list.size()-1) : list.toArray(new int[0][]);
    }
    private void swap(int index,int[] arr)
    {
        int temp = arr[index];
        arr[index]=arr[index + 1];
        arr[index + 1]=temp;
    }

    public static void main(String[] args) {
        Sort_Array s = new Sort_Array("/home/mahmoud/Heap/3bt.txt");
        Object arr = s.Simple_Sort(false);
        if (arr instanceof int[])
        {
            for (int i:(int[])arr) {
                System.out.print(i+" ");
            }
        }
        else
        {
            for (int[] A:(int[][]) arr) {
                for (int i:A) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }

}
