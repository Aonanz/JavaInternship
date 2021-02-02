package Day02.集合框架.Map.HashMap;

import java.util.*;

/*
* 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
* */

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 初始化哈希map
        Map<String, List<String>> map = new HashMap(strs.length);
        // 将首尾字母转化为对应的ascii码，放入表中
        // 单向优先排在头尾，双向队中，双否自成
        // 遍历字符串数组中的每一个字符串
        for (String str : strs) {
            // 将当前字符串转换成字符数组
            char[] bin = str.toCharArray();
            // 将字符数组由小到大排序
            Arrays.sort(bin);
            // 如果不存在bin这个key，则添加到hasMap中。
            map.computeIfAbsent(String.valueOf(bin), unused -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
