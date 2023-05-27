# Implementing Binary Heap & Sorting Techniques

## 1. Introduction
The goal of this assignment is to become familiar with the binary heap data structure as well
as different sorting techniques.

---

## 2. Binary Heap

### 2.1 Introduction
The (binary) heap data structure is an array object that we can view as a nearly complete
binary tree as shown in Figure 1. Each node of the tree corresponds to an element of the array.
The tree is completely filled on all levels except possibly the lowest, which is filled from the left
up to a point. An array A that represents a heap is an object with two attributes: A.length,
which (as usual) gives the number of elements in the array, and A.heap-size, which represents
how many elements in the heap are stored within array A.

![image](https://github.com/mohamedhassan279/BinaryHeap-Sorting/assets/96317608/6fd8b7d3-5a38-4c94-8323-4ed66d7bbfff)

Figure 1: A max-heap viewed as (a) a binary tree and (b) an array. The number within the circle at each node in the tree is the value stored at that node. The number above a node is the corresponding index in the array. Above and below the array are lines showing parent-child relationships; parents are always to the left of their children. The tree has a height of three; the node at index 4 (with value 8) has a height of one. - figure from Introduction to Algorithms - 3rd Edition
<br> There are two kinds of binary heaps: max-heaps and min-heaps. In both kinds, the values in the nodes satisfy a heap property, the specifics of which depend on the kind of heap. In a max-heap, the max-heap property is that for every node i other than the root,
<br> A[parent[i]] ≥ A[i] <br>
That is, the value of a node is at most the value of its parent.

### 2.2 Implementation
The MAX-HEAPIFY procedure, which runs in O(lg n) time, is the key to maintaining the max-heap property.
* The BUILD-MAX-HEAP procedure, which runs in linear time, produces a max-heap from an unordered input array.
* The HEAPSORT procedure, which runs in O(n lg n) time, sorts an array in place.
* The MAX-HEAP-INSERT, and HEAP-EXTRACT-MAX procedures, which run in O(lgn) time, allow the heap data structure to implement a priority queue.

---

## 3. Sorting Techniques
Implement the “heapsort” algorithm as an application for binary heaps. Then compare the running time performance of your algorithms against:
– An O(n2) sorting algorithm such as Bubble Sort.
– An O(n lg n) sorting algorithm such as Merge Sort in the average case.
– An O(n) sorting algorithm such as Counting Sort.

---

## Command Line Interface
Implement a command line interface that will enable us to deal with the implemented sorting algorithm. This interface must take the path of the file containing the list of elements as an initial input and then create the sorting object using it. The interface will be composed of a main menu that allow the user to sort the list of elements of the array. You should allow the user to choose 1 of the 3
algorithms to run. The user can ask for the sorted array or/and the intermediate array
as well.
