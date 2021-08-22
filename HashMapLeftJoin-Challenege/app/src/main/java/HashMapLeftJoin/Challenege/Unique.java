package HashMapLeftJoin.Challenege;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Unique {

    public Boolean uniqueChars(String text){
        String[] chars = (text.toLowerCase()).split("");
        HashSet<String> charsSet = new HashSet<>();
        for (String character : chars ){
            if (!character.equals(" "))
                if (charsSet.contains(character)) return false ;
                charsSet.add(character);
        }
         return true ;
    }
}
