package algorithms.datastructures.binary.search.tree;

import java.util.Comparator;

/**
 * Created by ksamykandil on 9/2/14.
 */
public class BST<T> {
    private BSTNode<T> root;

    public BST(T value) {
        this.root = new BSTNode<T>(value);
    }

    public BSTNode<T> insertNode(Comparator<T> x, BSTNode<T> node, T value) throws Exception {
        if (node == null)
            return new BSTNode<T>(value);

        if (x.compare(node.getValue(), value) > 0)
            node.setLeft(insertNode(x, node.getLeft(), value));
        else if (x.compare(node.getValue(), value) < 0)
            node.setRight(insertNode(x, node.getRight(), value));
        else
            throw new Exception("Duplicate");

        return node;
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    public void inOrderTraversal(BSTNode<T> node) {
        if (node == null)
            return;

        inOrderTraversal(node.getLeft());

        if (node.getValue() != null)
            System.out.print(node.getValue() + " ");

        inOrderTraversal(node.getRight());
    }

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    public void preOrderTraversal(BSTNode<T> node) {
        if (node == null)
            return;

        if (node.getValue() != null)
            System.out.print(node.getValue() + " ");

        preOrderTraversal(node.getLeft());

        preOrderTraversal(node.getRight());
    }

    public void postOrderTraversal() {
        postOrderTraversal(this.root);
    }

    public void postOrderTraversal(BSTNode<T> node) {
        if (node == null)
            return;

        postOrderTraversal(node.getLeft());

        postOrderTraversal(node.getRight());

        if (node.getValue() != null)
            System.out.print(node.getValue() + " ");
    }

    public BSTNode<T> getMaximum(BSTNode<T> node){
        while(node.getRight() != null)
            node = node.getRight();

        return node;
    }

    public BSTNode<T> getMinimum(BSTNode<T> node){
        while(node.getLeft() != null)
            node = node.getLeft();

        return node;
    }

    public BSTNode<T> findNode(Comparator<T> x, BSTNode<T> node, T value){
        if (x.compare(node.getValue(), value) > 0)
            findNode(x, node.getLeft(), value);
        else if (x.compare(node.getValue(), value) < 0)
            findNode(x, node.getRight(), value);

        return node;
    }

    public BSTNode<T> deleteNode(Comparator<T> x, BSTNode<T> node, T value){
        if(node == null)
            return null;

        if (x.compare(node.getValue(), value) == 0){
            if(node.getLeft() == null && node.getRight() == null)
                return null;

            if(node.getLeft() == null)
                return node.getRight();

            if(node.getRight() == null)
                return node.getLeft();

            BSTNode<T> min = getMinimum(node.getRight());

            node.setValue(min.getValue());
            node.setRight(deleteNode(x, node.getRight(), (T) min.getValue()));
        }

        if (x.compare(node.getValue(), value) > 0)
            node.setLeft(deleteNode(x, node.getLeft(), value));
        else if (x.compare(node.getValue(), value) < 0)
            node.setRight(deleteNode(x, node.getRight(), value));

        return node;
    }

    public int calcSize(){
        return calcSize(this.root);
    }

    public int calcSize(BSTNode<T> node){
        if(node == null)
            return 0;

        return 1 + calcSize(node.getLeft()) + calcSize(node.getRight());
    }

    public BSTNode<T> getRoot() {
        return root;
    }

    public void setRoot(BSTNode<T> root) {
        this.root = root;
    }
}
