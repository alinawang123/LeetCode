public class QuickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums, int lo, int hi){
        if (lo >= hi)
            return;
        int pivot = partition(nums, lo, hi);
        quickSort(nums, lo, pivot - 1);
        quickSort(nums, pivot + 1, hi);
    }

    private int partition(int[] nums, int lo, int hi){
        int pivot = nums[hi];
        int index = lo;
        for (int i = lo; i < hi; i++){
            if (nums[i] < pivot){
                exch(nums, i, index);
                index++;
            }
        }
        exch (nums, index, hi);
        return index;
    }
    private void exch(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        QuickSort ob = new QuickSort();
        int arr[] = {66, 28, 12, 22, 11, 7, 6, 5, 1 ,3, 2,10};
        ob.sortArray(arr);
        ob.printArray(arr);
    }

}
