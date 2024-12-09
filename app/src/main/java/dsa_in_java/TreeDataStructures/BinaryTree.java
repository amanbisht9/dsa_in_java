package dsa_in_java.TreeDataStructures;

public class BinaryTree {
    int idx = -1;

    public BinaryNode addNode(int[] arr){
        idx++;

        if(idx >= arr.length || arr[idx] == -1){
            return null;
        }

        BinaryNode binaryNode = new BinaryNode(arr[idx]);

        binaryNode.left = addNode(arr);
        binaryNode.right = addNode(arr);

        return binaryNode;
    }

    public static void inOrderTraversal(BinaryNode root){
    
        if(root !=  null){
            inOrderTraversal(root.left);
            System.out.print(root.data+", ");
            inOrderTraversal(root.right);
        }
    }
        
    public static void main(String[] args) {
        //-1 indicate null
        int[] arr = {1,2,4,-1,4};
        BinaryTree tree = new BinaryTree();
        BinaryNode root = tree.addNode(arr);
        System.out.println(root.left.data);
        //Inorder traversal
        //inOrderTraversal(root);
    }
}
