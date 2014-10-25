package dataStructures.binarySearchTree;

/**
 * Created by ksamykandil on 9/2/14.
 */
public class BSTNode<T> {
    private T value;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

}
