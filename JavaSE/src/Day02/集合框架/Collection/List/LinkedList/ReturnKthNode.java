package Day02.集合框架.Collection.List.LinkedList;

public class ReturnKthNode {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

    }

    // 返回链表中第k个到最后一个节点
    // 思路1：二次遍历，第一次返回链表的长度，第二次走到k-1时停下 O(n^2)
    public static ListNode getKthFromEnd(ListNode head, int k) {

        ListNode curNode;
        ListNode retNode;

        // 排除输入不规范问题
        if (k <= 0) {
            return null;
        }
        if (head == null) return null;
        if (head.next == null) return head;

        // 一次遍历计算链表长度
        int numNode = 1;
        curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
            numNode++;
        }

        // 遍历链表，到长度-k的位置，返回此处节点
        int i = 0;
        curNode = head;
        while (true) {
            // 找到，返回，退出
            if (i == numNode - k) {
                retNode = curNode;
                break;
            }
            // 没找到，下个不为空，继续找
            if (curNode.next != null) {
                curNode = curNode.next;
                i++;
            }
            // 抵达终点，没找到，退出
            else {
                retNode = curNode;
                break;
            }
        }
        return retNode;
    }

    // 思路2：双（快慢）指针，former先向前走k步，然后一起走。当former走过尾节点跳出时，返回latter即可
    // O(n), O(1)
    public ListNode getKthToEnd(ListNode head, int k) {
        // 初始化双指针
        ListNode former = head, latter = head;
        // 一个指针先走k步
        for(int i = 0; i < k; i++)
            former = former.next;
        // 然后两个一起走
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        // former走完后，返回latter，即为答案
        return latter;
    }

}
