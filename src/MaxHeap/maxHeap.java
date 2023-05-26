package MaxHeap;

public class maxHeap {
    int[] heapArray;
    int maxSize;
    int size;

    public maxHeap(int maxSize) {
        this.maxSize = maxSize;
        heapArray = new int[maxSize];
        this.size = 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return (2 * index) + 1;
    }

    private int rightChild(int index) {
        return (2 * index) + 2;
    }

    private void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }
    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heapArray[left] > heapArray[largest])
            largest = left;

        if (right < size && heapArray[right] > heapArray[largest])
            largest = right;

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }
    public void buildMaxHeap(int arr[]){
        size = arr.length;
        System.arraycopy(arr,0,heapArray,0,size);
        for(int i=size-1 ; i>=0 ; i--){
            heapifyDown(i);
        }
    }

    public void insert(int value) {
        if (size == maxSize) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }

        heapArray[size] = value;
        int currentIndex = size;
        size++;
        heapifyUp(currentIndex);
    }

    private void heapifyUp(int index){
        if(index != 0 && heapArray[parent(index)] < heapArray[index]){
            swap(parent(index), index);
            heapifyUp(parent(index));
        }
    }

    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot extract maximum element.");
            return -1;
        }
        int max = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public int getMax(){
        if (size == 0) {
            System.out.println("Heap is empty. Cannot extract maximum element.");
            return -1;
        }
        return heapArray[0];
    }
    public void HeapSort(int[] arr){
        buildMaxHeap(arr);
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = extractMax();
        }

    }
    public void printHeap(){
        for(int i=0 ; i<size ; i++){
            System.out.print(heapArray[i]+" ");
        }
    }


}
