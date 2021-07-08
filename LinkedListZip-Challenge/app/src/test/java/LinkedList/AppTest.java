/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testZipLinkedListFunction(){
        LinkedList list1 = new LinkedList() ;
        list1.append(1);
        list1.append(3);
        list1.append(2);
        LinkedList list2 = new LinkedList() ;
        list2.append(5);
        list2.append(9);
        LinkedList zipedLinkedList = new LinkedList();
        zipedLinkedList.append(1);
        zipedLinkedList.append(5);
        zipedLinkedList.append(3);
        zipedLinkedList.append(9);
        zipedLinkedList.append(2);
        App app = new App() ;
        assertEquals(zipedLinkedList.toString() , app.zipLists(list1 , list2).toString());
    }
    @Test
    public void testEdgePoint1(){
        LinkedList list1 = new LinkedList() ;
        list1.append(1);
        list1.append(3);
        list1.append(2);
        LinkedList list2 = new LinkedList() ;
        LinkedList zipedLinkedList = new LinkedList();
        zipedLinkedList.append(1);
        zipedLinkedList.append(3);
        zipedLinkedList.append(2);
        App app = new App() ;
        assertEquals(zipedLinkedList.toString() , app.zipLists(list1 , list2).toString());
    }
    @Test
    public void testEdgePoint2(){
        LinkedList list1 = new LinkedList() ;
        LinkedList list2 = new LinkedList() ;
        list1.append(1);
        list1.append(3);
        list1.append(2);
        LinkedList zipedLinkedList = new LinkedList();
        zipedLinkedList.append(1);
        zipedLinkedList.append(3);
        zipedLinkedList.append(2);
        App app = new App() ;
        assertEquals(zipedLinkedList.toString() , app.zipLists(list1 , list2).toString());
    }
    @Test
    public void testEdgePoint3(){
        LinkedList list1 = new LinkedList() ;
        list1.append(1);
        LinkedList list2 = new LinkedList() ;
        LinkedList zipedLinkedList = new LinkedList();
        zipedLinkedList.append(1);
        App app = new App() ;
        assertEquals(zipedLinkedList.toString() , app.zipLists(list1 , list2).toString());
    }
}
