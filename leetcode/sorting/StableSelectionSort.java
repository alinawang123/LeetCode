// Java program for implementation of Selection Sort
class StableSelectionSort {
  public void sort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      while (minIndex > i) {
        arr[minIndex] = arr[minIndex - 1];
        minIndex--;
      }
      arr[i] = temp;
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
    StableSelectionSort ob = new StableSelectionSort();
    int arr[] = {64, 25, 12, 22, 11};
    ob.sort(arr);
    ob.printArray(arr);
  }
}
/* this sorting algorithm is stable
time complexity is O(n^2) and space complexity is O(1) s the only extra memory used is for temporary variable while swapping two values in Array.
 */
