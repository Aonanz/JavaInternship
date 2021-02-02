package Day01.集合框架.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

// return all the subsets from an array
public class Subsets {

    // 主方法用于测试
    public static void main(String[] args) {
        // 制作并赋值一个数组
        int[] aSet = new int[3];
        for (int i = 0; i < 3;) {
            aSet[i] = ++i;
        }
        // 通过subsets方法输出此数组的所有子集
        System.out.println(subsets(aSet));
    }

    // 递归法：时空皆为O(n*(2^n))
    // 返回nums数组的所有子集
    public static List<List<Integer>> subsets(int[] nums) {

        // 做一个二维数组当输出结果
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 首先将空集加入输出结果
        ans.add(new ArrayList<Integer>());

        // 遍历数组中的每一个数字
        for (int num: nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> subset: ans) {
                // 遍历整个数组，对于输出结果中的每个子集，先逐个复制结果中已经存在的子集
                List<Integer> newSubset = new ArrayList<Integer>(subset);
                // 再逐个加入当前的数字
                newSubset.add(num);
                // 最后加入到输出结果
                newSubsets.add(newSubset);
            }
            ans.addAll(newSubsets);
        }
        return ans;
    }
}
