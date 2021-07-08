package LinkedList;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;

public class LinkedList<T> {
    private Node head ;
    private int length ;
    public void insert(T data){
        Node<T> node = new Node<T>(data);
        if(head == null){
            head = node ;
            length = 1 ;
            return;
        }
        else {

            Node previousHead = this.head ;
            node.setNext(previousHead);
            this.head = node ;
            length++;
        }

    }
    public boolean includes(T data){
        Node node= new Node(data);
        Node currentHead = head;
        if(node.getData() == currentHead.getData()) {
            return true ;
        }

        while(currentHead.getNext() != null){
            currentHead = currentHead.getNext();
            if(node.getData() == currentHead.getData()) {
                return true ;
            }
        }
        return false ;
    }

    public String toString(){
        Node currentNode = head ;
        if(currentNode == null)
            return "empty";
        String output = "{ " + currentNode.getData().toString() + " } -> ";
        while (currentNode.getNext()!=null){
            currentNode = currentNode.getNext() ;
            output += "{ " + currentNode.getData().toString() + " } -> " ;
        }
        return output+"NULL";
    }

    public int getLength(){

        return length ;
    }
    public T getHead(){
        return (T)this.head.getData() ;
    }

}
