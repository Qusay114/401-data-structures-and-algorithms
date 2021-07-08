package LinkedList;/*
 * This Java source file was generated by the Gradle 'init' task.
 */


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        // 1(3) , 3(4) , 6(5) , 10(6) , 15(7) , 21(8) , 28(9)
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        list1.append(6);
        list1.append(7);
        list1.append(8);
        list1.append(9);
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        list1.append(6);
        list1.append(7);
        list1.append(8);
        list1.append(9);
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        list1.append(6);
        list1.append(7);
        list1.append(8);
        list1.append(9);

        System.out.println("List1 before reverse = " + list1.toString());
        list1.reverse();
        System.out.println("List1 after reverse = "+ list1.toString());
//        LinkedList<Integer> list2 = new LinkedList<Integer>();
//        list2.append(-1);
//        list2.append(-2);
//        list2.append(-3);
//        System.out.println("List2 = "+ list2.toString());
//        System.out.println("ZipedList = "+ zipLists(list1 , list2));

    }

    public  static LinkedList zipLists(LinkedList list1 , LinkedList list2){
        LinkedList zipLinkedList = new LinkedList() ;
        int biggerLength = list1.getLength() >= list2.getLength() ? list1.getLength() : list2.getLength() ;
        for(int i = 1 ; i<=biggerLength ; i++){
            if(list1.getLength()-i >= 0)
                zipLinkedList.append(list1.kthFromEnd(list1.getLength()-i));
            if(list2.getLength()-i >= 0)
                zipLinkedList.append(list2.kthFromEnd(list2.getLength()-i));
        }
        return zipLinkedList ;
    }
}
