public class sort {
    public int[] sort(int[] nums) {
        //return mergeSort(nums, 0, nums.length-1);
        quickSort(nums, 0, nums.length-1);
        return nums;
        //insertion sort or reverse bubble sort
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if(nums[j] < nums[j-1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//        }
//        return nums;


        //stable selection sort
//        for (int i = 0; i < nums.length; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[j] < nums[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = nums[minIndex];
//            while(minIndex>i) {
//                nums[minIndex] = nums[minIndex-1];
//                minIndex--;
//            }
//            nums[i] = temp;
//        }
//        return nums;



        //selection sort
//        for (int i = 0; i < nums.length; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[j] < nums[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = nums[i];
//            nums[i] = nums[minIndex];
//            nums[minIndex] = temp;
//        }
//        return nums;


        //bubble sort
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length-i; j++) {
//                if(nums[j-1] > nums[j]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//        }
//        return nums;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp =arr[index];
        arr[index] = arr[high];
        arr[high] = temp;
        return index;
    }


//    public int[] mergeSort(int[] arr, int low, int high) {
//        if(low == high) return new int[]{arr[low]};
//        int mid = low+ (high-low)/2;
//        int[] arr1 = mergeSort(arr, low, mid);
//        int[] arr2 = mergeSort(arr, mid+1, high);
//        return merge(arr1, arr2);
//    }
//
//    public int[] merge(int[] arr1, int[] arr2) {
//        int[] mergedArray = new int[arr1.length+arr2.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i < arr1.length && j<arr2.length) {
//            if(arr1[i] < arr2[j]) {
//                mergedArray[k] = arr1[i];
//                i++;
//                k++;
//            } else {
//                mergedArray[k] = arr2[j];
//                j++;
//                k++;
//            }
//        }
//        while(i<arr1.length){
//            mergedArray[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while(j<arr2.length){
//            mergedArray[k] = arr2[j];
//            j++;
//            k++;
//        }
//        return mergedArray;
//    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        sort ob = new sort();
        int arr[] = {66, 28, 18, 22, 17, 7, 6, 5, 1 ,3, 2,10,15, 80, 0, 11,33,23,12};
        ob.sort(arr);
        ob.printArray(arr);
    }
}
