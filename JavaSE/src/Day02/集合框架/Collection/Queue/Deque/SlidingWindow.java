package Day02.集合框架.Collection.Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

// 返回nums数组中每个大小为k的滑动窗口的最大值
// 单调队列 时间O(n),空间O(k)
public class SlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // 处理输入不规范
        if(nums.length == 0 || k == 0) return new int[0];

        // 初始化双向联表和返回数组
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if(i > 0 && deque.peekFirst() == nums[i - 1])
                deque.removeFirst();
            // 保持 deque 递减
            while(!deque.isEmpty() && deque.peekLast() < nums[j])
                deque.removeLast();
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if(i >= 0)
                res[i] = deque.peekFirst();
        }
        return res;
    }
}
