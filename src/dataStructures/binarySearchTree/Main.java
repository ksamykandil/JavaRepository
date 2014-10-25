package dataStructures.binarySearchTree;

import java.io.BufferedWriter;
import java.util.Comparator;

/**
 * Created by ksamykandil on 9/2/14.
 */
public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>(40);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                if (int1 < int2)
                    return -1;
                if (int1 > int2)
                    return 1;
                return 0;
            }
        };

        try {
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 25));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 10));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 32));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 3));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 17));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 30));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 38));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 78));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 50));
            bst.setRoot(bst.insertNode(comparator, bst.getRoot(), 93));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("InOrder Traversal");
        bst.inOrderTraversal();
        System.out.println("\n");

        System.out.println("PreOrder Traversal");
        bst.preOrderTraversal();
        System.out.println("\n");

        System.out.println("PostOrder Traversal");
        bst.postOrderTraversal();
        System.out.println("\n");

        System.out.println("Find Maximum");
        System.out.println(bst.getMaximum(bst.getRoot()).getValue());

        System.out.println("Find Minimum");
        System.out.println(bst.getMinimum(bst.getRoot()).getValue());

        bst.deleteNode(comparator, bst.getRoot(), 40);
    }

}
