package Testing;

import FileReader.Freader;
import Sorting.Sort_Array;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
    private int[] expected;

    private Sort_Array sorting;
    @Test
    public void test1()// 10 elements
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-10.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-10.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));

    }
    @Test
    public void test2()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-20.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-20.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test3()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-30.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-30.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test4()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-50.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-50.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test5()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-100.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-100.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test6()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-200.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-200.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test7()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-300.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-300.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test8()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-500.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-500.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test9()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-1000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-1000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test10()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-3000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-3000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test11()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-5000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-5000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test12()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-7000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-7000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test13()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-10000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-10000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test14()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-13000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-13000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
    @Test
    public void test15()
    {
        sorting=new Sort_Array("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/test-15000.txt");
        expected = Freader.read("/home/mahmoud/IdeaProjects/BinaryHeap-Sorting/Expected/extest-15000.txt");
        assertArrayEquals(expected,(int[])sorting.simpleSort(true));
        assertArrayEquals(expected,(int[])sorting.efficientSort(true));
        assertArrayEquals(expected,(int[])sorting.nonComparisonSort(true));
        assertArrayEquals(expected,(int[])sorting.heapSort(true));
    }
}
