package TreeDataStructure;


import TreeDataStructure.QueueList.QueueLinkedList;

import java.util.ArrayList;
import java.util.List;

public class TreeBreadthFirst {

    private List values = new ArrayList();
    private QueueLinkedList queue = new QueueLinkedList();


    public List traverse(Node current){
        this.values.add(current.getData());
        if(current.getLeft() != null)
        {
            queue.enqueue(current.getLeft());
        }

        if (current.getRight() != null)
        {
            queue.enqueue(current.getRight());
        }

        if(!queue.isEmpty())
            traverse((Node) queue.dequeue());
        return this.values ;
    }

}
