import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int l = nums.length/2;
        nums = Arrays.stream(nums).distinct().toArray();
        return l < nums.length? l:nums.length;
    }
}