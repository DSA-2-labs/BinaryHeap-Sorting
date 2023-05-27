package MaxHeap;

import javax.naming.SizeLimitExceededException;
import java.util.List;

public class MaxHeap {
    private final int[] heapArray; // the array representing the heap
    private final int maxSize; // max size for the heap
    private int size; // the current size of heap

    /**
     * MaxHeap constructor
     * @param maxSize the maximum size of the heap
     */
    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heapArray = new int[maxSize];
        this.size = 0;
    }

    /**
     * MaxHeap constructor
     * @param arr the unsorted array to build the heap with
     * O(n)
     */
    public MaxHeap(int[] arr, int maxSize) {
        this.maxSize = maxSize;
        this.size = arr.length;
        heapArray = arr;
        for(int i = size - 1; i >= 0; i--){
            maxHeapifyDown(i);
        }
    }

    /**
     * maintains the heap property for build heap method. O(lg n)
     * @param index the current index
     */
    private void maxHeapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left < size && heapArray[left] > heapArray[largest])
            largest = left;

        if (right < size && heapArray[right] > heapArray[largest])
            largest = right;

        if (largest != index) {
            swap(index, largest);
            maxHeapifyDown(largest);
        }
    }

    /**
     * maintains the heap property for insert method. O(lg n)
     * @param index the current index
     */
    private void maxHeapifyUp(int index){
        if(index != 0 && heapArray[parent(index)] < heapArray[index]){
            swap(parent(index), index);
            maxHeapifyUp(parent(index));
        }
    }

    /**
     * heap sort in O(n lg n)
     * @param arr to sort it in place.
     */
    public static void HeapSort(int[] arr, List<int[]> steps) {
        steps.add(arr.clone());
        if (arr.length == 0) return;
        MaxHeap maxHeap = new MaxHeap(arr, arr.length);
        for(int i=0 ; i < arr.length ; i++){
            maxHeap.extractMax();
            steps.add(arr.clone());
        }
    }

    /**
     * a method to insert  element in the heap in O(lg n).
     * @param value the value to be inserted
     * @throws SizeLimitExceededException if the max size is exceeded.
     */
    public void insert(int value) throws SizeLimitExceededException {
        if (size == maxSize) {
            throw new SizeLimitExceededException();
        }
        heapArray[size] = value;
        int currentIndex = size++;
        maxHeapifyUp(currentIndex);
    }

    /**
     * extracts and remove the max element in the heap in O(lg n).
     * @return the max element in the heap.
     * @throws IndexOutOfBoundsException if the heap is empty
     */
    public int extractMax() throws IndexOutOfBoundsException{
        int max = getMax();
        size--;
        if(size != 0) {
            swap(0, size);
            maxHeapifyDown(0);
        }
        return max;
    }

    /**
     * to get the max element in the heap without removing it.
     * @return the max element in the heap.
     * @throws IndexOutOfBoundsException if the heap is empty.
     */
    public int getMax() throws IndexOutOfBoundsException {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        return heapArray[0];
    }

    /**
     * @param index the current index
     * @return the parent index
     */
    private int parent(int index) {
        return (index - 1) / 2;
    }

    /**
     * @param index the current index
     * @return the left child index
     */
    private int leftChild(int index) {
        return (2 * index) + 1;
    }

    /**
     * @param index the current index
     * @return the right child index
     */
    private int rightChild(int index) {
        return (2 * index) + 2;
    }

    /**
     * swap 2 elements in the heap
     * @param i the first index
     * @param j the second index
     */
    private void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    /**
     * a method to print the heap array
     */
    public void printHeap(){
        for(int i = 0 ; i < size ; i++){
            System.out.print(heapArray[i] + " ");
        }
    }
}
