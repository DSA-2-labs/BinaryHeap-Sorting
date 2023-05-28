package Testing;

import FileReader.Freader;
import Sorting.Sort_Array;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TimeAnalysis {
    private final String test = "D:\\Data\\2nd year\\2nd term\\Data-Structure2\\labs\\Sort-test\\analysis\\";
    private Sort_Array sorting;
    @Test
    public void countingSort()
    {
        sorting = new Sort_Array(test + "worst-10.txt");
        long start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        long end = System.nanoTime();
        System.out.println("worst-10 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-100 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-10000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-10000 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-100000 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000000 case counting sort: " + (((end-start)/40)*0.001) + " ms");
        System.out.println();

        sorting = new Sort_Array(test + "avg-10.txt");
        long start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        long end2 = System.nanoTime();
        System.out.println("avg-10 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-10000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-10000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");
        System.out.println();

        sorting = new Sort_Array(test + "best-10.txt");
        long start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        long end3 = System.nanoTime();
        System.out.println("best-10 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-10000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-10000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");
    }
}
