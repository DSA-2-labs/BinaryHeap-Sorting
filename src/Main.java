import CLI.cli;
import MaxHeap.MaxHeap;
import Sorting.Sort_Array;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        cli c = new cli();
//        c.i();
//        MaxHeap heap = new MaxHeap(100);
//        int x[] = {0,0,8,0,1,50000,3,2,-1};
////        heap.HeapSort(x);
//        for(int i=0 ; i<x.length ; i++){
//            System.out.print(x[i]+" ");
//        }
//        //heap.printHeap();
//        //System.out.println(heap.extractMax());
        Sort_Array s = new Sort_Array("C:\\Users\\Dell\\Desktop\\arr1.txt");
        List<int[]> list = (List<int[]>) s.heapSort(false);
        for (int[] tmp : list) {
            for (int i = 0; i < tmp.length; i++ ){
                System.out.print(tmp[i] + " ");
            }
            System.out.println();
        }
    }
}