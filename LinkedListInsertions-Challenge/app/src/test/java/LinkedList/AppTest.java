/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testLinkedList(){
        LinkedList list1 = new LinkedList() ;
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.append(4);
        list1.insertBefore(2 , 0);
        list1.insertAfter(2 , -10);
        assertEquals("{ 1 } -> { 0 } -> { 2 } -> { -10 } -> { 3 } -> { 4 } -> NULL" , list1.toString());
    }

}