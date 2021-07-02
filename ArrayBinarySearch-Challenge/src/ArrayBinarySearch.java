public class ArrayBinarySearch {
    public static void main(String[] args) {

        //to test binary search function
        int [] testArr = {4, 8, 15, 16, 23, 42} ;
        System.out.println(binarySearch(testArr , 15));

    }

    /**
     *
     * @param arr
     * @param value
     * @return
     */
    public static int binarySearch(int [] arr , int value ){

        int low = 0 ;
        int high = arr.length-1 ;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == value)
                return mid;

            if (arr[mid] < value)
                low = mid + 1;


            else
                high = mid - 1;
        }

        return -1;
    }
}
