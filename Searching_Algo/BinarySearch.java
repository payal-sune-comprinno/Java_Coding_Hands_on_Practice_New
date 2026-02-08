class BinarySearch {

    public int search(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;   
            }
            else if (x < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        int arr[] = {6, 7, 11, 23, 45}; 
        BinarySearch b1 = new BinarySearch();
        int result = b1.search(arr, 11);
        System.out.println(result);
    }
}
