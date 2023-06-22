import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length < 2){
            return nums;
        }
       return mergeSort(nums,0, nums.length-1);
    }

    private int[] mergeSort(int[] arr, int low, int high ){
        if(low == high) return new int[]{arr[low]};
        int mid = low+ (high-low)/2;
        int[] arr1 = mergeSort(arr, low, mid);
        int[] arr2 = mergeSort(arr, mid+1, high);
        return merge(arr1, arr2);
    }
    private int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i< arr1.length && j< arr2.length) {
            if(arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while(i<arr1.length) {
            merged[k++] =arr1[i++];
        }
        while(j<arr2.length) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        MergeSort ob = new MergeSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.printArray(ob.sortArray(arr));
    }
}
