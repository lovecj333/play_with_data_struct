package com.datastruct.tree;

public class TestBST {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for(int i=0;i<nums.length;i++){
            bst.add(nums[i]);
        }
        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////
//        int min = bst.minimum();
//        System.out.println("min="+min);
//        int max = bst.maximum();
//        System.out.println("max="+max);
//        bst.removeMin();
//        bst.removeMax();
//        bst.remove(3);
//        bst.levelOrder();
//        System.out.println();
//        bst.preOrderNR();
//        System.out.println();
//        bst.preOrder();
//        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        bst.postOrder();
//        System.out.println();
    }
}
