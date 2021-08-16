package HashMapTreeIntersection.Challenge;

import HashMapTreeIntersection.Challenge.binaryTree.BinaryTree;
import HashMapTreeIntersection.Challenge.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {

    public List<T> hashmapTreeIntersection(BinaryTree tree1 , BinaryTree tree2){
        List<T> list1 = tree1.preOrderTraversals(tree1.getRoot());
        List<T> list2 = tree2.preOrderTraversals(tree2.getRoot());
        List<T> intersections = new ArrayList<>();
        int min = Math.min(list1.size(), list2.size());
        for (int i = 0 ; i < min ; i++ )
            if (list1.get(i).equals(list2.get(i)))
                intersections.add(list1.get(i));
        return intersections ;
    }
}
