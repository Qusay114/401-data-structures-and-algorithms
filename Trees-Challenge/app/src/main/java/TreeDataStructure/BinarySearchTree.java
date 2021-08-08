package TreeDataStructure;

public class BinarySearchTree  extends BinaryTree{

    private Integer max ;
    private Integer sumOdd ;

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

    public Integer getSumOddNums(){
        this.sumOdd = 0 ;
        sumOddsPreOrder(super.getRoot());
        return this.sumOdd ;
    }

    private void sumOddsPreOrder(Node node){
        if(node != null) {
            System.out.println(((Integer) node.getData()) % 2);
            if (((Integer) node.getData()) % 2 != 0)
                this.sumOdd += (Integer) node.getData();
            sumOddsPreOrder(node.getLeft());
            sumOddsPreOrder(node.getRight());
        }
    }
}
