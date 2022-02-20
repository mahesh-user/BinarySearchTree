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
            //goes left to the root
            node.left = insertIntoTheTree(node.left , data);
        }else{
            //goes right side to the root
            node.right = insertIntoTheTree(node.right , data);
        }
        return node;
    }

    public boolean search(int data) {
        return searchInTheTree(root,data);
    }

    private boolean searchInTheTree(TreeNode node, int data) {
        if(node == null){
            return false;
        }
        else if (node.data==data){
            return true;
        }
        else if (data < node.data){
            return searchInTheTree(node.left,data);
        }
        else
            return searchInTheTree(node.right , data);
    }



    class TreeNode{
        //class level variables
        int data;
        TreeNode left,right;


        TreeNode(int data){
            this.data = data;
        }
    }
}
