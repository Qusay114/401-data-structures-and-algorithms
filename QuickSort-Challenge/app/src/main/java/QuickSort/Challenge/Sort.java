package QuickSort.Challenge;



import java.util.List;


public class Sort<T> {

    public List<T> quickSort(List<T> arr , int left , int right ){
        if(left < right){
            int position = partition(arr , left , right);
            quickSort(arr , left , position-1);
            quickSort(arr , position+1 , right);
        }
        return arr ;
    }



    public int partition(List<T> arr  , int left , int right){
        T pivot = arr.get(right) ;
        int low = left - 1 ;
        for( int i = left ; i < right ; i++){
            if ((Integer)arr.get(i) <= (Integer)pivot){
                low++ ;
                swap(arr , i , low) ;
            }
        }
        swap(arr, right, low + 1) ;
        return low + 1 ;
    }


    public void swap(List<T> arr  , int i , int low){
        T temp = arr.get(i) ;
        arr.set(i , arr.get(low));
        arr.set(low , temp);
    }
}
