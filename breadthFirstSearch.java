import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstSearch {


    //Print out all values of the Binary Tree
    static void printBFS(DDBinaryTree bt, DDBinaryTree.Node node) {

        Queue<DDBinaryTree.Node> theQueue = new LinkedList<DDBinaryTree.Node>();
        theQueue.add(node);

        while (!theQueue.isEmpty()) {
            node = theQueue.remove();
            System.out.println(node.data + " ");

            if (node.left != null) {
                theQueue.add(node.left);
            }

            if (node.right != null) {
                theQueue.add(node.right);
            }
        }
    }


    //Determine if value is in BinaryTree
    static <E> boolean findBFS(DDBinaryTree bt, DDBinaryTree.Node node, E searchTarget) {

        boolean foundTarget = false;
        Queue<DDBinaryTree.Node> theQueue = new LinkedList<DDBinaryTree.Node>();
        theQueue.add(node);

        while (!theQueue.isEmpty()) {
            node = theQueue.remove();
            if (node.data == searchTarget) {
                System.out.println(searchTarget + " was found");
                foundTarget = true;

            }

            if (node.left != null) {
                theQueue.add(node.left);
            }

            if (node.right != null) {
                theQueue.add(node.right);
            }
        }

        return foundTarget;

    }

}
