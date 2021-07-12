package StackQueue;

public class PseudoQueue<T> {
    private StackLinkedList stack1 ;
    private StackLinkedList stack2 ;

    public PseudoQueue(){
        this.stack1 = new StackLinkedList() ;
        this.stack2 = new StackLinkedList() ;
    }

    public void enqueue(T data){
        this.stack1.push(data) ;
    }

    public T dequeue(){
        if (this.stack1.isEmpty()) return (T)"Exception";
        while (!this.stack1.isEmpty()){
            this.stack2.push(this.stack1.peek());
            this.stack1.pop() ;
        }
        T extractData = (T)this.stack2.pop();
        while (!this.stack2.isEmpty()){
            this.stack1.push(this.stack2.peek());
            this.stack2.pop() ;
        }
        return extractData ;
    }

    public String toString(){
        return this.stack1.isEmpty() ? "empty" : this.stack1.toString() ;
    }
}
