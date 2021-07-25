package TreeDataStructure;

public class BinarySearchTree  extends BinaryTree{

    private Integer max ;

    @Override
    public void setRoot(Node root) {
        super.setRoot(root);
        this.max = (Integer) root.getData();
    }

    public void add(int data){
        if(data > this.max) this.max = data ;
        Node current = super.getRoot();
        if (current == null) {
            super.setRoot(new Node(data));
            return;
        }
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

    @Override
    public Integer getMax() {
        return max;
    }
}
