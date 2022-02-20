package com.bridgelabz;

public class BinarySearchTree {
    TreeNode root;
    public void insert(int data) {
        root = insertIntoTheTree(root , data);
    }

    private TreeNode insertIntoTheTree(TreeNode node, int data) {
        if(node == null){
            return new TreeNode(data);
        }else if(data < node.data){

            node.left = insertIntoTheTree(node.left , data);
        }else{

            node.right = insertIntoTheTree(node.right , data);
        }
        return node;
    }

    class TreeNode{

        int data;
        TreeNode left,right;


        TreeNode(int data){
            this.data = data;
        }
    }
}
