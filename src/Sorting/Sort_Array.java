package Sorting;

import FileReader.Freader;
import MaxHeap.MaxHeap;

import java.util.ArrayList;

public class Sort_Array {
    private final int[] arr; // the array to be sorted
    private ArrayList<int[]> list; // the intermediate arrays

    /**
     * Sort_Array constructor
     * @param filename the file to read the array
     */
    public Sort_Array(String filename) {
        this.arr= Freader.read(filename);
    }

    /**
     * Simple sort algorithm in O(n^2) implementing bubble sort
     * @param choice whether to return the final sorted array or the intermediate results
     * @return the final sorted array if choice true, the intermediate arrays otherwise.
     */
    public Object simpleSort(boolean choice) {
        this.list = new ArrayList<>();
        int[] unsorted = this.arr.clone();
        if(!choice) list.add(unsorted);
        bubbleSort(unsorted, choice);
        return choice? unsorted : list.toArray(new int[0][]);
    }

    /**
     * Efficient sort algorithm in O(n lg n) implementing merge sort
     * @param choice whether to return the final sorted array or the intermediate results
     * @return the final sorted array if choice true, the intermediate arrays otherwise.
     */
    public Object efficientSort(boolean choice) {
        this.list = new ArrayList<>();
        int[] unsorted = this.arr.clone();
        if(!choice) list.add(unsorted);
        mergeSort(unsorted, choice,0,this.arr.length-1);
        return choice? unsorted : list.toArray(new int[0][]);
    }

    /**
     * Non comparison sort algorithm in O(n) implementing count sort
     * @param choice whether to return the final sorted array or the intermediate results
     * @return the final sorted array if choice true, the intermediate arrays otherwise.
     */
    public Object nonComparisonSort(boolean choice) throws ArrayIndexOutOfBoundsException, NegativeArraySizeException{
        if (this.arr.length == 0) throw new ArrayIndexOutOfBoundsException();
        this.list = new ArrayList<>();
        return countSort(this.arr.clone(), choice);
    }

    /**
     * Heap sort algorithm in O(n lg n) using Max Heap
     * @param choice whether to return the final sorted array or the intermediate results
     * @return the final sorted array if choice true, the intermediate arrays otherwise.
     */
    public Object heapSort(boolean choice) {
        this.list = new ArrayList<>();
        MaxHeap.HeapSort(this.arr.clone(), list, choice);
        return choice? list.get(list.size() - 1) : list.toArray(new int[0][]);
    }

    private void bubbleSort(int[] unsorted, boolean choice) {
        boolean flag = true;
        for (int i = unsorted.length; i > 1 && flag; i--) {
            flag = false;
            for (int j = 0; j < i-1; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    swap(j, unsorted);
                    flag = true;
                }
            }
            if(!choice)
                list.add(unsorted.clone());
        }
    }

    private void mergeSort(int[] unsorted, boolean choice, int l, int r) {
        if(l < r){
            int mid = (l + r)/2;
            mergeSort(unsorted, choice, l, mid);
            mergeSort(unsorted, choice, mid + 1, r);
            merge(unsorted, l, mid, r);
            if(!choice)
                list.add(unsorted.clone());
        }
    }

    private void merge(int[] unsorted,int l,int mid,int r) {
        int leftSize = mid - l + 1;
        int rightSize = r - mid;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = unsorted[l + i];
        }
        for (int i = 0; i < rightSize; i++) {
            right[i] = unsorted[mid + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while(i< leftSize && j < rightSize){
            if(left[i] <= right[j]){
                unsorted[k] = left[i];
                i++;
            }
            else{
                unsorted[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            unsorted[k]=left[i];
            k++;
            i++;
        }
        while(j < rightSize){
            unsorted[k] = right[j];
            k++;
            j++;
        }
    }

    private void swap(int index,int[] arr) {
        int temp = arr[index];
        arr[index]=arr[index + 1];
        arr[index + 1]=temp;
    }

    private Object countSort(int[] arr, boolean choice) throws NegativeArraySizeException{
        int max = arr[0], min = arr[0];
        for (int i: arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int range = max - min + 1;
        if(range < 0) throw new NegativeArraySizeException();
        int[] count = new int[range];
        int[] sorted = new int[arr.length];
        for (int i : arr) {
            count[i - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            sorted[--count[arr[i] - min]] = arr[i];
            if(!choice)
                list.add(sorted.clone());
        }
        System.arraycopy(sorted, 0, arr, 0, arr.length);
        return choice? arr : list.toArray(new int[0][]);
    }
}
