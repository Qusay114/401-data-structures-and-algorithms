package LinkedList;

public class LinkedList<T> {
    private Node head ;
    private int length ;

    public void append(T data){
        Node<T> node = new Node<T>(data);
        if(head == null){
            head = node ;
            length = 1 ;
            return;
        }
        else {
            Node<T> currentHead = head ;
            while (currentHead.getNext() != null) {
                currentHead = currentHead.getNext();
            }
            currentHead.setNext(node);
            length++;
        }

    }

    public void insert(T data){
        Node<T> node = new Node<T>(data);
        if(head == null){
            head = node ;
            length = 1 ;
            return;
        }
        else {
            Node<T> currentHead = head ;
            while (currentHead.getNext() != null) {
                currentHead = currentHead.getNext();
            }
            currentHead.setNext(node);
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

    public void insertBefore(T data , T newData){
        Node<T> node = new Node<T>(newData);
        if(head.getData() == data)
        {
            Node<T> node2 = new Node<T>(data);
            node2.setNext(head.getNext());
            head = node ;
            head.setNext(node2);
            length++;
            return;
        }
        else {
            Node<T> currentHead = head ;
            while (currentHead.getNext().getData() != data) {
                currentHead = currentHead.getNext();
            }
            Node node2 = currentHead.getNext() ;
            node.setNext(node2);
            currentHead.setNext(node);
            length++;
        }

    }

    public void insertAfter(T data , T newData) {
        Node<T> node = new Node<T>(newData);
        Node<T> currentHead = head ;
        while (currentHead.getData() != data) {
            currentHead = currentHead.getNext();
        }
        node.setNext(currentHead.getNext());
        currentHead.setNext(node);
        length++;
    }

    public T kthFromEnd(int data){
        Node<T> currentHead = this.head ;
        for(int i = 1 ; i < (this.length - data) ; i++ ){
            currentHead = currentHead.getNext();
        }
        return (this.length - data) < 1 ? (T)"Exception":currentHead.getData() ;
    }

    public void reverse(){
        int steps = this.length ;
        if(this.head == null || this.head.getNext()==null)
            return;
        if (this.head.getNext().getNext()==null)
        {
            Node node = this.head.getNext() ;
            this.head.setNext(null);
            node.setNext(this.head);
            this.head = node ;
            return;
        }
        Node currentHead = this.head ;
        Node newHead = null;
        int counter = 0 ;
        int checkLastNode = 1 ;
        Node lastNode = null ;
        while(this.head.getNext().getNext()!=null){
            counter++ ;
            if(steps > 3) {
                currentHead = currentHead.getNext().getNext().getNext();
                steps-=3;
            }
            else
                currentHead = currentHead.getNext();
            if(currentHead.getNext().getNext()==null){
                Node node = currentHead.getNext() ;
                Node node1 = currentHead ;
                node1.setNext(null);
                (node).setNext(node1);
                if(checkLastNode==1) {
                    newHead = node;
                    checkLastNode = 0 ;
                }
                length-=2;
                steps=length;
                lastNode = currentHead ;
                currentHead = this.head;

            }

        }
        this.head.setNext(null);
        lastNode.setNext(this.head);
        this.head = newHead ;
        System.out.println("Counter is " + counter);

    }
}


