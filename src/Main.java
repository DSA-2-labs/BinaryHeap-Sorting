import CLI.cli;
import MaxHeap.maxHeap;

public class Main {
    public static void main(String[] args) {
//        cli c = new cli();
//        c.i();
        maxHeap heap = new maxHeap(100);
        int x[] = {0,0,8,0,1,50000,3,2,900,-1};
        heap.HeapSort(x);
        for(int i=0 ; i<x.length ; i++){
            System.out.print(x[i]+" ");
        }
        //heap.printHeap();
        //System.out.println(heap.extractMax());

    }
}