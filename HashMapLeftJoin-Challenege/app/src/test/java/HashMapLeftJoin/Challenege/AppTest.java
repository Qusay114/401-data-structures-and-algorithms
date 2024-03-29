/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashMapLeftJoin.Challenege;

import HashMapLeftJoin.Challenege.hashTable.HashTable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @DisplayName("test leftJoinHashMap method in JoinHashMap with the same hashTable as params")
    @Test
    public void testSameHashsAsParams(){
        HashTable<String , Integer> leftMap = new HashTable<>();
        leftMap.add("a" , 1);
        leftMap.add("b" , 2);
        leftMap.add("c" , 3);

        HashTable<String , Integer> rightMap = new HashTable<>();
        rightMap.add("a" , 10);
        rightMap.add("b" , 20);
        rightMap.add("c" , 30);

        JoinHashMap joinHashMap = new JoinHashMap();

        assertEquals("[[a, 1, 10], [b, 2, 20], [c, 3, 30]]" ,
                joinHashMap.leftJoinHashMaps(leftMap , rightMap).toString() ,
                "it should return [[a, 1, 10], [b, 2, 20], [c, 3, 30]]");
    }

    @DisplayName("test leftJoinHashMap method in JoinHashMap with completely different maps")
    @Test
    public void testDifferentMaps(){
        HashTable<String , Integer> leftMap = new HashTable<>();
        leftMap.add("a" , 1);
        leftMap.add("b" , 2);
        leftMap.add("c" , 3);

        HashTable<String , Integer> rightMap = new HashTable<>();
        rightMap.add("d" , 10);
        rightMap.add("e" , 20);
        rightMap.add("f" , 30);

        JoinHashMap joinHashMap = new JoinHashMap();

        assertEquals("[[a, 1, null], [b, 2, null], [c, 3, null]]" ,
                joinHashMap.leftJoinHashMaps(leftMap , rightMap).toString() ,
                "it should return [[a, 1, null], [b, 2, null], [c, 3, null]]");
    }

    @DisplayName("test leftJoinHashMap method in JoinHashMap with some same keys ")
    @Test
    public void testWithSomeKeys(){
        HashTable<String , Integer> leftMap = new HashTable<>();
        leftMap.add("a" , 1);
        leftMap.add("b" , 2);
        leftMap.add("c" , 3);

        HashTable<String , Integer> rightMap = new HashTable<>();
        rightMap.add("d" , 10);
        rightMap.add("a" , 20);
        rightMap.add("f" , 30);

        JoinHashMap joinHashMap = new JoinHashMap();

        assertEquals("[[a, 1, 20], [b, 2, null], [c, 3, null]]" ,
                joinHashMap.leftJoinHashMaps(leftMap , rightMap).toString() ,
                "it should return [[a, 1, 20], [b, 2, null], [c, 3, null]]");
    }

}
