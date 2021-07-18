package TreeDataStructure;

public class Node<T> {
    private final T data ;
    private Node<T> right ;
    private Node<T> left ;

    public Node(T data){
        this.data = data ;
    }

    public T getData() {
        return data;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public Node<T> getLeft() {
        return left;
    }
}
