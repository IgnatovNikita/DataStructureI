package com.company;

import java.util.LinkedList;
import java.util.List;

//Given the root of a binary tree, return the preorder traversal of its nodes' values.
public class BinaryTreePreorderTraversal {
    private final LinkedList<Integer> res = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
           if (root == null){
               return res;
           }
           res.add(root.val);
           preorderTraversal(root.left);
           preorderTraversal(root.right);

           return res;
    }
}
