/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package QuickSort.Challenge;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();
        Sort sort = new Sort() ;
        test.add(8);
        test.add(4);
        test.add(23);
        test.add(42);
        test.add(16);
        test.add(15);

        System.out.println(sort.quickSort(test , 0 , test.size()-1 ).toString());

    }
}