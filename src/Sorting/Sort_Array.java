package Sorting;

import FileReader.Freader;

import java.util.ArrayList;

public class Sort_Array {
    private int[] Unsorted_Array;
    private ArrayList<int[]> list = new ArrayList<>();
    public Sort_Array(String filename)
    {
        this.Unsorted_Array= Freader.read(filename);
    }
    public Object Simple_Sort(boolean choice)
    {
        return merge_sort(this.Unsorted_Array.clone(),choice,0,this.Unsorted_Array.length-1);
    }
    private Object bubble_sort(int[] unsorted,boolean choice)
    {
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
    private Object merge_sort(int[] unsorted,boolean choice,int l,int r)
    {
        if(l<r){
            int mid=(l+r)/2;
            merge_sort(unsorted,choice,l,mid);
            merge_sort(unsorted,choice,mid+1,r);
            int[] left=new int[mid-l+1];
            int[] right=new int[r-mid];
            for (int i = 0; i < left.length ; i++) {
                left[i]=unsorted[i+l];
            }
            for (int i = 0; i < right.length ; i++) {
                right[i]=unsorted[i+mid+1];
            }
            merge(unsorted,left,right,l);
            list.add(unsorted.clone());
        }
        if(l==0&&r==unsorted.length-1)
            return choice ? list.get(list.size()-1) : list.toArray(new int[0][]);
        else
            return unsorted;
    }
    public void merge(int[] unsorted,int[] left,int[] right,int l){
        int nl= left.length;
        int nr= right.length;
        int k=l,i=0,j=0;
        while(i<nl&&j<nr){
            if(left[i]<right[j]){
                unsorted[k]=left[i];
                k++;i++;
            }
            else{
                unsorted[k]=right[j];
                k++;j++;
            }
        }
        while(i<nl){
            unsorted[k]=left[i];
            k++;i++;
        }
        while(j<nr){
            unsorted[k]=right[j];
            k++;j++;
        }
    }

    private void swap(int index,int[] arr)
    {
        int temp = arr[index];
        arr[index]=arr[index + 1];
        arr[index + 1]=temp;
    }

    public static void main(String[] args) {
        Sort_Array s = new Sort_Array("/home/exception/Heap/3bt.txt");
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
