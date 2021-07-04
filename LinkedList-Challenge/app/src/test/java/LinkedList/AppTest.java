/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testLinkedList(){
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        assertEquals(true , list1.includes(1));
        list1.insert(3);
        list1.insert(5);
        assertEquals("{ 1 } -> { 3 } -> { 5 } -> NULL" , list1.toString());
        assertEquals(3 , list1.getLength());

    }


}
