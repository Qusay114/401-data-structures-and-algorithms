/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashMapLeftJoin.Challenege;

import HashMapLeftJoin.Challenege.hashTable.HashTable;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        HashTable<String , Integer> leftMap = new HashTable<>();
        leftMap.add("a" , 1);
        leftMap.add("b" , 2);
        leftMap.add("c" , 3);

        HashTable<String , Integer> rightMap = new HashTable<>();
        rightMap.add("a" , 10);
        rightMap.add("d" , 20);
        rightMap.add("c" , 30);

        JoinHashMap joinHashMap = new JoinHashMap();
//        System.out.println(joinHashMap.leftJoinHashMaps(leftMap , rightMap).toString());


        Unique unique = new Unique();
        String text1 = "The quick brown fox jumps over the lazy dog";
        String text2 = "I love cats";
        String text3 = "Donald the duck" ;
        System.out.println(unique.uniqueChars(text1));
        System.out.println(unique.uniqueChars(text2));
        unique.uniqueChars(text3);
        System.out.println(unique.uniqueChars(text3));
    }
}
