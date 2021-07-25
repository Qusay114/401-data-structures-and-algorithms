package TreeDataStructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private  Node<T> root ;
    private List collection = new ArrayList();
    private Integer maxValue ;

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

    public Integer getMax() {
        if (this.root == null) return null ;
        this.maxValue = (Integer) this.root.getData();
        Node current = this.root ;
        checkMax(current);
        return maxValue;
    }
    private void checkMax(Node node){
        if(node != null) {
            if ((Integer)node.getData() > this.maxValue) this.maxValue = (Integer) node.getData();
            checkMax(node.getLeft());
            this.collection.add(node.getData());
            checkMax(node.getRight());
        }
    }
}
