import java.util.Stack;

public class depthFirstSearch {

    //Print out all values of the Binary Tree
    //Using Postorder
    static void printDFS(DDBinaryTree bt, DDBinaryTree.Node node){

        if(node == null){
            return;
        }
        printDFS(bt,node.left);
        printDFS(bt, node.right);
        System.out.println(node.data);

    }

    //Determine if value is in BinaryTree
    static  <E>  boolean findDFT(DDBinaryTree bt, DDBinaryTree.Node node, E searchTarget){
        boolean foundTarget = false;

        if (node == null){
            return foundTarget;
        }
        findDFT(bt,node.left,searchTarget);
        findDFT(bt, node.right, searchTarget);

        if (node.data == searchTarget) {
            System.out.println(node + " was found");
            foundTarget = true;
        }

        return foundTarget;
    }
}
