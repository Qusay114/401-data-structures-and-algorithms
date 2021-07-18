package TreeDataStructure;

public class BinarySearchTree  extends BinaryTree{


    public void add(int data){
        Node current = super.getRoot();
        traverse(current , data);
    }
    private void traverse(Node current , int data){
        if(data >= (int)current.getData()){
            if(current.getRight()==null){
                current.setRight(new Node(data));
                return;
            }
            current = current.getRight();
        }
        else{
            if(current.getLeft() == null){
                current.setLeft(new Node(data));
                return;
            }
            current = current.getLeft();

        }
        traverse(current , data);
    }

    public Boolean contains(int data){
        Node currentRoot = super.getRoot();
        return containTraverse(currentRoot , data);
    }

    private Boolean containTraverse(Node current , int data) {
        if (data == (int) current.getData()) return true;
        if (data > (int) current.getData()) {
            if (current.getRight() == null) return false;
            current = current.getRight();
        } else {
            if (current.getLeft() == null) return false;
            current = current.getLeft();
        }
        containTraverse(current, data);
        return containTraverse(current, data);
    }

}
