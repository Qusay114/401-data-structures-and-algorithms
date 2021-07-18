package TreeDataStructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private  Node<T> root ;
    private List collection = new ArrayList();

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public String inOrderTraversals(Node node)  {
        if(node != null) {
            inOrderTraversals(node.getLeft());
            this.collection.add(node.getData());
            inOrderTraversals(node.getRight());
        }
        return this.collection.toString();
    }

    public String preOrderTraversals(Node node){
        if(node != null) {
            this.collection.add(node.getData());
            inOrderTraversals(node.getLeft());
            inOrderTraversals(node.getRight());
        }
        return this.collection.toString();
    }

    public String postOrderTraversals(Node node){
        if(node != null) {
            inOrderTraversals(node.getLeft());
            inOrderTraversals(node.getRight());
            this.collection.add(node.getData());
        }
        return this.collection.toString();
    }
}
