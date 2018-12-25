public class Tester {


    public static void main(String[] args){


        DDBinarySearchTree <String> binarySearchTree = new DDBinarySearchTree<>();
        depthFirstSearch test = new depthFirstSearch();


        binarySearchTree.add("a");
        binarySearchTree.add("b");
        binarySearchTree.add("c");
        binarySearchTree.add("d");
        binarySearchTree.add("e");
        binarySearchTree.add("f");
        binarySearchTree.add("g");
        binarySearchTree.add("h");
        binarySearchTree.add("i");
        binarySearchTree.add("j");
        binarySearchTree.add("k");
        binarySearchTree.add("l");
        binarySearchTree.add("m");
        binarySearchTree.add("n");
        binarySearchTree.add("o");
        binarySearchTree.add("p");
        binarySearchTree.add("q");
        binarySearchTree.add("r");
        binarySearchTree.add("s");
        binarySearchTree.add("t");
        binarySearchTree.add("u");

        test.printDFS(binarySearchTree, binarySearchTree.root);










    }
}
