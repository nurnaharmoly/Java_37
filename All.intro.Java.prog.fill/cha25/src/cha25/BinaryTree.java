
package cha25;

import javafx.scene.Node;

public class BinaryTree {
    
    Node root;

   BinaryTree() {
       root = null;
    }
   void printPostorder(Node node){
   if(node == null){
    return;
   }
       printPostorder(node.left);
        printPostorder(node.right);
       System.out.println(node.key + " ");
   }
    
   void printPostorder(Node node){
   if(node == null){
    return;
   }
       printPostorder(node.left);
        printPostorder(node.right);
       System.out.println(node.key + " ");
   }
    
    
    public static void main(String[] args) {
                                                                                        
    }
    
}
