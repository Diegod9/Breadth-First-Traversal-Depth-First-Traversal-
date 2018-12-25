/**
 * Binary Search Tree
 */
public class DDBinarySearchTree<E extends Comparable<E>> extends DDBinaryTree {

    /**
     * Searches tree for target.
     * @param target The element to look for.
     * @return true if in tree, and false otherwise
     */
    public boolean contains(E target) {
        return contains(root, target);
    }

    /**
     * Adds target to tree if it doesn't already exist.
     * @param target The element to add.
     * @return true if target added and false otherwise.
     */
    public boolean add(E target) {
        if (root==null) {
            root = new Node<E>(target);
            return true;
        }
        return add(root, target);
    }

    /**
     * Output contents in order.
     */
    public void printOrderedData() {
        inOrderTraversal(new ProcessData<E>(){
            @Override
            public void process(E data) {
                System.out.print(data + " ");
            }});
    }

    private boolean contains(Node<E> subtreeRoot, E target) {
        if (subtreeRoot==null) return false;
        if (target.compareTo(subtreeRoot.data)==0) return true;
        else if (target.compareTo(subtreeRoot.data)<0)
            return contains(subtreeRoot.left, target);
        else
            return contains(subtreeRoot.right, target);
    }


    private boolean add(Node<E> subtreeRoot, E target) {
        if (target.compareTo(subtreeRoot.data)==0) return false;
        else if (target.compareTo(subtreeRoot.data)<0) {
            if (subtreeRoot.left==null) {
                subtreeRoot.left = new Node<E>(target);
                return true;
            }
            return add(subtreeRoot.left, target);
        } else {
            if (subtreeRoot.right==null) {
                subtreeRoot.right = new Node<E>(target);
                return true;
            }
            return add(subtreeRoot.right, target);
        }
    }
}
