package Graph.Challenge;

import java.util.List;
import java.util.Stack;

public class Geater {

    public Stack<Integer> greaterThanRight(List<Integer> arr){
        Stack<Integer> greats = new Stack<>();
        for (int i = 0 ; i < arr.size() ; i ++){
            if (arr.get(i) > arr.get(i+1)){
                greats.push(arr.get(i));
            }
            if ((i+1) == arr.size()){
                greats.push(arr.get(i));
                return greats ;
            }

        }
        return greats ;
    }
}
