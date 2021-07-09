package StackQueue;

public class QueueLinkedList<T> {
    private Node front ;
    private Node back ;
    public QueueLinkedList(){
        this.front = null ;
        this.back = null ;
    }

    public void enqueue(T data){
        Node newNode = new Node(data);
        if(this.back == null){
            this.front = newNode ;
            this.back = newNode ;
            return;
        }
        Node previousBack = this.back ;
        this.back = newNode ;
        previousBack.setNext(this.back);
    }

    public T dequeue(){
        if (this.front == null)
            return (T)"Exception";
        Node previousFront = this.front ;
        this.front = this.front.getNext() ;
        previousFront.setNext(null);
        return (T)previousFront.getData();

    }

    public T peek(){
        if (this.front == null)
            return (T)"Exception";
        return (T)this.front.getData();
    }

    public Boolean isEmpty(){
        return this.front == null ? true : false ;
    }

    public String toString(){
        if (this.front == null)
            return "The Queue list is empty";
        Node currentFront = this.front ;
        String output = "{ "+currentFront.getData()+" } -> ";
        while (currentFront!=this.back){
            currentFront = currentFront.getNext();
             output += "{ "+currentFront.getData()+" } -> ";
        }
        return output+"NULL";
    }
}
