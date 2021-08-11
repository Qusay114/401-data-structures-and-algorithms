package MergeSort.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {

    public List<Integer> mergeSort(List<Integer> arr){
        int n = arr.size() ;

        if(n > 1)
        {
            int mid = n / 2 ;
            List<Integer> left = new ArrayList<>();
            for (int l = 0 ; l < mid ; l ++)
                left.add(arr.get(l));
            List<Integer> right = new ArrayList<>();
            for (int r = mid ; r < arr.size() ; r ++)
                right.add(arr.get(r));

            mergeSort(left);

            mergeSort(right);
            merge(left , right  , arr) ;
        }
        return arr ;
    }




    private List<Integer> merge(List<Integer> left , List<Integer> right , List<Integer> arr){
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while (i < left.size() && j < right.size()){
            if(left.get(i) <= right.get(j))
            {
                arr.set(k , left.get(i)) ;
                i++ ;
            } else
            {
                arr.set(k , right.get(j));
                j++;
            }
            k++ ;
        }

        if ( i == left.size())
            while (j < right.size()){
                arr.set(k , right.get(j));
                k ++ ;
                j ++ ;
            }
        else
            while (i < left.size()){
                arr.set(k , left.get(i));
                k ++ ;
                i ++ ;
            }

        return arr ;

    }
}
