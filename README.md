# Implementing Binary Heap & Sorting Techniques

## Contents:
- [1. Introduction](#int)<br>
- [2. Binary Heap](#heap)<br>
  - [2.1 Introduction](#i)<br>
  - [2.2 Implementation](#impl)<br>
- [3. Sorting Techniques](#sort)<br>
- [4. Command Line Interface](#cli)<br>
- [5. Comparison](#comparison)<br>
  - [5.1 Time & space analysis](#analysis)<br>
  - [5.2 Mean time to sort](#time)<br>
  - [5.3 Where the algorithm will perform](#perform)<br>
 
---

## 1. Introduction <a name="int"></a>
The goal of this assignment is to become familiar with the binary heap data structure as well
as different sorting techniques.

---

## 2. Binary Heap <a name="heap"></a>

### 2.1 Introduction <a name="i"></a>
The (binary) heap data structure is an array object that we can view as a nearly complete
binary tree as shown in Figure 1. Each node of the tree corresponds to an element of the array.
The tree is completely filled on all levels except possibly the lowest, which is filled from the left
up to a point. An array A that represents a heap is an object with two attributes: A.length,
which (as usual) gives the number of elements in the array, and A.heap-size, which represents
how many elements in the heap are stored within array A.

![image](https://github.com/mohamedhassan279/BinaryHeap-Sorting/assets/96317608/bf26ae93-8df1-4073-8689-2f742e660de8)


Figure 1: A max-heap viewed as (a) a binary tree and (b) an array. The number within the circle at each node in the tree is the value stored at that node. The number above a node is the corresponding index in the array. Above and below the array are lines showing parent-child relationships; parents are always to the left of their children. The tree has a height of three; the node at index 4 (with value 8) has a height of one. - figure from Introduction to Algorithms - 3rd Edition
<br> There are two kinds of binary heaps: max-heaps and min-heaps. In both kinds, the values in the nodes satisfy a heap property, the specifics of which depend on the kind of heap. In a max-heap, the max-heap property is that for every node i other than the root,
<br> A[parent[i]] ≥ A[i] <br>
That is, the value of a node is at most the value of its parent.

### 2.2 Implementation <a name="impl"></a>
The MAX-HEAPIFY procedure, which runs in O(lg n) time, is the key to maintaining the max-heap property.
* The BUILD-MAX-HEAP procedure, which runs in linear time, produces a max-heap from an unordered input array.
* The HEAPSORT procedure, which runs in O(n lg n) time, sorts an array in place.
* The MAX-HEAP-INSERT, and HEAP-EXTRACT-MAX procedures, which run in O(lgn) time, allow the heap data structure to implement a priority queue.

---

## 3. Sorting Techniques <a name="sort"></a>
Implement the “heapsort” algorithm as an application for binary heaps. Then compare the running time performance of your algorithms against:
– An O(n2) sorting algorithm such as Bubble Sort.
– An O(n lg n) sorting algorithm such as Merge Sort in the average case.
– An O(n) sorting algorithm such as Counting Sort.

---

## 4. Command Line Interface <a name="cli"></a>
Implement a command line interface that will enable us to deal with the implemented sorting algorithm. This interface must take the path of the file containing the list of elements as an initial input and then create the sorting object using it. The interface will be composed of a main menu that allow the user to sort the list of elements of the array. You should allow the user to choose 1 of the 3
algorithms to run. The user can ask for the sorted array or/and the intermediate array
as well.

---

## 5. Comparison <a name="comparison"></a>

### 5.1 Time & space analysis <a name="analysis"></a>

| Algorithm     | Time Complexity  | Space Complexity |
| ------------- | ---------------- | ---------------- |
| Bubble sort   | O(n<sup>2</sup>) | O(1)             |
| Merge sort    | O(n log n)       | O(n)             |
| Counting sort | O(n + k)         | O(n + k)         |
| Heap sort     | O(n log n)       | O(1)             |

### 5.2 Mean time to sort in (us): <a name="time"></a>

firstly with large range of values:

| Size             | Bubble sort | Merge sort | Counting sort | Heap sort |
| ---------------- | ----------- | ---------- | ------------- | --------- |
| 10               | 2.047       | 3.075      | 82681.932     | 24.192    |
| 100              | 81.675      | 23.192     | 96230.662     | 18.56     |
| 10<sup>3</sup>   | 636.72      | 47.337     | 85378         | 78.57     |
| 10<sup>4</sup>   | 80862.29    | 846.207    | 88230         | 847.812   |
| 5x10<sup>4</sup> | 2682588.172 | 4706.2     | 89290         | 4406.2    |
| 10<sup>5</sup>   | 1.2E7       | 9689.6     | 90127.27      | 12408.5   |
| 5x10<sup>5</sup> | -           | 53433.4    | 111277        | 58023.8   |
| 10<sup>6</sup>   | -           | 122335.797 | 188044.09     | 128401.647|
| Mean Time        | 2460695     | 23885.6    | 103907.4      | 25526.16  |

![image](https://github.com/mohamedhassan279/BinaryHeap-Sorting/assets/96317608/57264f1c-2f54-4d62-943a-771c3fddb7ba)
![image](https://github.com/mohamedhassan279/BinaryHeap-Sorting/assets/96317608/370f580a-da34-495b-8537-6a16f5c44735)

- From the Time Analysis1 we notice that bubble sort O(n<sup>2</sup>) has the longest running time compared to the others.
- From the Time Analysis2 we notice that merge sort and heap sort [O(n log n)] have approximately the same running, however, heap sort has slightly larger running times.
- It’s clear that the counting sort has the longest running time, although that it has a linear time complexity O(n + k). This is because that the range of the values in the input arrays are significantly large. Counting sort is efficient when the range of these values is small. In the next comparison, a small range of values will be used to test the 4 algorithms again.

secondly with small range of values:

| Size             | Bubble sort | Merge sort | Counting sort | Heap sort |
| ---------------- | ----------- | ---------- | ------------- | --------- |
| 10               | 2.137       | 3.062      | 46.3          | 33.232    |
| 100              | 66.83       | 15.027     | 30.172        | 11.13     |
| 10<sup>3</sup>   | 647.445     | 64.042     | 77.09         | 74.535    |
| 10<sup>4</sup>   | 79020.807   | 979.85     | 225.06        | 844.527   |
| 5x10<sup>4</sup> | 2732834.765 | 4994.697   | 463.48        | 4687.337  |
| 10<sup>5</sup>   | 1.13E7      | 12633.12   | 806.917       | 12891.622 |
| 5x10<sup>5</sup> | -           | 62287.737  | 5220.942      | 64801.017 |
| 10<sup>6</sup>   | -           | 106934.79  | 8308.937      | 128925.347|
| Mean Time        | 2352095     | 23489.04   | 1897.362      | 26533.59  |

![image](https://github.com/mohamedhassan279/BinaryHeap-Sorting/assets/96317608/20719a14-89db-4ec9-9c46-2444f72e2b11)
![image](https://github.com/mohamedhassan279/BinaryHeap-Sorting/assets/96317608/80cb2c99-9066-40ba-8517-b0a75a58c451)

- From the Time Analysis3 we notice that bubble sort O(n<sup>2</sup>) still has the longest running time compared to the others.
- From the Time Analysis4 we notice that counting sort O(n + k) has the best running time. The difference here is that the range of values in the input is significantly small [-5000 : 5000].


### 5.3 Where the algorithm will perform: <a name="perform"></a>

|              | Bubble sort              | Merge sort               | Counting sort            | Heap sort                |
| ------------ | ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| Worst case   | When the array is in reversed order, so the worst-case complexity is o(n<sup>2</sup>) | When the array is in reversed order, so the worst-case complexity is O(nlogn) | When the range of elements is not bounded or significantly larger than the number of elements. | If the input array is already sorted in ascending order |
| Best case    | In case of already sorted array, so it just iterates in the list only one time. Thus, it is o(n) | When the array already sorted, so the best-case complexity is O(nlogn) | When all elements are the same. | If the input array is already sorted in descending order |
| Average case | Bubble sort may require (n/2) passes and O(n) comparisons for each pass in the average case. As a result, the average case time complexity of bubble sort is O (n<sup>2</sup>) | When 2 or more elements are jumbled, i.e., neither in the ascending order nor in the descending order. The average-case complexity is O(nlogn) | When the range of elements is bounded[k = O(n)] | When the input array is randomly shuffled which doesn’t have any specific patterns or pre-existing order |
