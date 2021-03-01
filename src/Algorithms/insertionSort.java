package Algorithms;

public class insertionSort {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void insertionSort(Object[] a, int fromIndex, int toIndex)
    {
        Object d;
        for (int i = fromIndex + 1; i < toIndex; i++)
        {
            d = a[i];
            int j = i;
            while (j > fromIndex && ((Comparable) a[j - 1]).compareTo(d) > 0)
            {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = d;
        }
    }
}
