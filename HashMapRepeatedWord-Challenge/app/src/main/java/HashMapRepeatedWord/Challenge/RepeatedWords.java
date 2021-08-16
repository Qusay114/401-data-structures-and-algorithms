package HashMapRepeatedWord.Challenge;

import HashMapRepeatedWord.Challenge.hashTable.HashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RepeatedWords {

    public String firstRepeatedWord(String text){
        HashTable<String , Integer> repeatedWords = new HashTable<>() ;
        List<String> words = splitAndRemoveSpaces(text.toLowerCase());
        for (String word : words){
            if (repeatedWords.get(word) == null)
                repeatedWords.add(word , 1);
            else
                repeatedWords.add(word, repeatedWords.get(word)+1);
            if (repeatedWords.get(word) > 1)
                return word ;
        }
        return "no repeated words" ;
    }

    private List<String> splitAndRemoveSpaces(String text){
        List<String> words = new ArrayList<>();
        List<String> wordsWithoutSpaces = new ArrayList<>();
        words = List.of(text.split(" "));
        for (String word : words)
        {
            if (!word.equals("")) wordsWithoutSpaces.add(word);
        }
        return wordsWithoutSpaces ;
    }
}
