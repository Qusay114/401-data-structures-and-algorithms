package StackQueue;

public class AnimalShelter<T> {

    private Node<String> front ;
    private Node<String> back ;
    public AnimalShelter(){
        this.front = null ;
        this.back = null ;
    }

    public void enqueue(Animal data){
        Node<String> newNode = new Node<>(data.getType());
        if(this.back == null){
            this.front = newNode ;
            this.back = newNode ;
            return;
        }
        Node<String> previousBack = this.back ;
        this.back = newNode ;
        previousBack.setNext(this.back);
    }

    public T dequeue(String pref){
        if (this.front == null)
            return null;
        if(this.front.getData().equals(pref))
        {
            Node previousFront = this.front ;
            this.front = this.front.getNext() ;
            previousFront.setNext(null);
            return (T)previousFront.getData() ;
        }
        Node currentFront = this.front ;
        while (currentFront.getNext().getData()!=pref)
        {
            currentFront = currentFront.getNext();
            if(currentFront.getNext() == null)
                return null ;
        }
        Node deletedNode = currentFront.getNext();
        currentFront.setNext(deletedNode.getNext());
        deletedNode.setNext(null);
        return (T)deletedNode.getData();

    }


    public String toString(){
        if (this.front == null)
            return "The Queue list is empty";
        Node<String> currentFront = this.front ;
        String output = "{ "+currentFront.getData()+" } -> ";
        while (currentFront.getNext()!=null){
            currentFront = currentFront.getNext();
            output += "{ "+currentFront.getData()+" } -> ";
        }
        return output+"NULL";
    }
}
