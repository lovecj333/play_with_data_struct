package com.datastruct.leecode;

public class Solution2 {

    //有虚拟头节点的删除方式
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while(pre.next != null){
            if(pre.next.val == val){
                ListNode delNode = pre.next;
                pre.next = delNode.next;
                delNode.next = null;
            }else{
                pre = pre.next;
            }
        }
        return dummyHead.next;
    }
}
