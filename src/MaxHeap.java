import java.util.*;

public class MaxHeap {
    int[] heapArray;
    int size;

     static private void heapify_up(int[] array,int size,int index){
        int i =index;
        while(i>0){
            if(array[i]>array[((i/2))]){
                int temp = array[i];
                array[i]=array[(int)((i/2))];
                array[((i/2))]=temp;
                
            }
            else{
                break;
            }
            i=(i/2);
            
        }



    }
     static private void heapify_down(int[] array,int size,int index){
    int i= index;
    int l;
    int r;

    while(2*i+2<size){
         l=2*i+1;
         r=2*i+2;
        int max =i;
        if(array[l]>array[max]){
            max=l;

        }
        if(array[r]>array[max]){
            max=r;

        }
        if(max!=i)
         {int temp = array[max];
         array[max]=array[i];
         array[i]=temp;

         i=max;}
         else 
         {
          break;
         }



    }
 if(2*i+1<size && array[i]<array[2*i+1]){
    int temp = array[2*i+1];
         array[2*i+1]=array[i];
         array[i]=temp;


 }
 



    }
    void Insert_Element(int element){

    }
    void Remove_Max(){

    }
    static void Build_heap(int[] array){

    }
    static void Heap_sort(int[]array){

    }

    
}
