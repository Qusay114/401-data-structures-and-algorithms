/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashMapRepeatedWord.Challenge;

import HashMapRepeatedWord.Challenge.hashTable.HashTable;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        HashTable<String , Integer> hashTable = new HashTable<>();
        hashTable.add("white" , 1);
        hashTable.add("black" , 2);
        hashTable.add("green" , 3);
        hashTable.add("blue" , 4);
        System.out.println(hashTable.remove("blue"));
        System.out.println(hashTable.get("blue"));

        RepeatedWords repeatedWords = new RepeatedWords();
        String text = "first second  third second second" ;
        System.out.println(repeatedWords.firstRepeatedWord(text));
    }

}
