package HashMapLeftJoin.Challenege;

import HashMapLeftJoin.Challenege.hashTable.HashTable;

import java.util.ArrayList;
import java.util.List;

public class JoinHashMap<T> {

    public List<List<T>> leftJoinHashMaps(HashTable<T , T> leftMap , HashTable<T , T> rightMap){
        List<List<T>> joinedValues = new ArrayList<>();
        for (T key : leftMap.getKeys()){
            List<T> innerArray = new ArrayList<>();
            innerArray.add(key) ;
            innerArray.add(leftMap.get(key));
            innerArray.add(rightMap.get(key));
            joinedValues.add(innerArray);
        }
        return joinedValues ;
    }
}
