package Insertion.Sort.Challenge;

import java.util.List;

public class Sort<Integer> {

    public List<Integer> insertionSort(List<Integer> arr){
        for (int i = 1 ; i < arr.size() ; i++){
            int j = i - 1 ;
            Integer temp = arr.get(i) ;
            while (j >= 0  && (int)temp < (int)arr.get(j)){
                arr.set(j + 1, arr.get(j));
                j-- ;
            }
            arr.set(j+1 , temp);
        }
        return arr ;
    }
}
