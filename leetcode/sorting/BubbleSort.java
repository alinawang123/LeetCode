public class BubbleSort {
  //Bubble Sort is the simplest sorting algorithm that works
  // by repeatedly swapping the adjacent elements if they are in the wrong order.
  //It can be optimized by stopping the algorithm if the inner loop didn’t cause any swap.
  //The above function always runs O(n^2) time even if the array is sorted.

  public void sort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++)
      for (int j = 0; j < n - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
          // swap arr[j+1] and arr[j]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
  }

  // Prints the array
  public void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver code to test above
  public static void main(String args[]) {
    SelectionSort ob = new SelectionSort();
    int arr[] = {64, 25, 12, 22, 11};
    ob.sort(arr);
    ob.printArray(arr);
  }
}