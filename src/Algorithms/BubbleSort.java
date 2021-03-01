package Algorithms;

public class BubbleSort {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void bubbleSort(Object[] array, int fromIndex, int toIndex)
    {
        Object d;
        for (int i = toIndex - 1; i > fromIndex; i--)
        {
            boolean isSorted = true;
            for (int j = fromIndex; j < i; j++)
            {
                //If elements in wrong order then swap them
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0)
                {
                    isSorted = false;
                    d = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = d;
                }
            }
            //If no swapping then array is already sorted
            if (isSorted)
                break;
        }
    }
}
